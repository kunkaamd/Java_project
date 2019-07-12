/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.ListView;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author LOC
 */
@Controller
public class BFSController {
    static final int MAX = 100;
    private int G[][] = new int[MAX][MAX];/* ma trận kề*/
    private boolean chuaxet[] = new boolean[MAX];/*mảng đánh dấu đỉnh đã được thăm.*/
    private int QUEUE[] = new int[MAX]; /*hàng đợi*/
    private List<ListView> list;
    private int n;
    private String temp = "";
    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String viewUpload() {
        return "uploadFile";
    }
    @RequestMapping(value="/savefile",method=RequestMethod.POST)  
    public String saveimage( @RequestParam CommonsMultipartFile file,@RequestParam(value="txtDau", required=false) int dau,@RequestParam(value="txtCuoi", required=false) int cuoi,  HttpSession session,ModelMap mm) throws Exception{  
        ServletContext context = session.getServletContext();  
        String path = context.getRealPath("/");  
        String filename = file.getOriginalFilename();  

        System.out.println(path+" "+filename);        

        byte[] bytes = file.getBytes();  
        BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
             new File(path + File.separator + filename)));  
        stream.write(bytes);  
        stream.flush();  
        stream.close();
        System.out.println(dau + "---------" + cuoi);
       
        run(dau,cuoi, path + File.separator + filename);
        mm.put("list", list);
        return "uploadFile";
    }
    
    //
    private void getData(String file) {
        BufferedReader reader = null;
        try {
            
            reader = new BufferedReader(new FileReader(file));
            n = Integer.parseInt(reader.readLine());
            for (int i = 1; i <= n; i++) {
                String[] aLineOfMatrix = reader.readLine().split("\\s+");
                for (int j = 1; j <= n; j++) {
                    G[i][j] = Integer.parseInt(aLineOfMatrix[j - 1]);/*index của J bắt đầu từ 0*/
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null)
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void BFS(int v,int inputCuoi) {
        int u, dauQ, cuoiQ, j;
        dauQ = 1;
        cuoiQ = 1;
        QUEUE[cuoiQ] = v;
        System.out.println(QUEUE[cuoiQ]);
        chuaxet[v] = false;
        /* thiết lập hàng đợi với đỉnh đầu là i */
        while (dauQ <= cuoiQ) {
            u = QUEUE[dauQ];
            System.out.print(u + " ");
            String daduyet;
            String hangdoi;
            String dinhconlai;
            ListView listView =new ListView();
            if (list.isEmpty()) {
                temp = Integer.toString(u);
                listView.setDaduyet(Integer.toString(u));
            }
            else{
                temp = temp +" "+ Integer.toString(u);
                listView.setDaduyet(temp);
            }
            
            dauQ = dauQ + 1; /* duyệt đỉnh đầu hàng đợi */
            for (j = 1; j <= n; j++) {
                if (G[u][j] == 1 && chuaxet[j]) {
                    cuoiQ = cuoiQ + 1;
                    QUEUE[cuoiQ] = j;
                    chuaxet[j] = false;
                }
            }
            String queuetemp="";
            for (int i = dauQ; i <= cuoiQ; i++) {
                queuetemp = queuetemp+" "+Integer.toString(QUEUE[i]);
            }
            String queuechuaxet="";
            for (int i = 1; i <= n; i++) {
                if (chuaxet[i]==true) {
                    queuechuaxet = queuechuaxet +" "+ Integer.toString(i);
                }
            }
            listView.setDinhconlai(queuechuaxet);
            listView.setHangdoi(queuetemp);
            list.add(listView);
            if (inputCuoi==u) {
                break;
            }
        }
    }

    public void run(int inputDau,int inputCuoi,String file) {
        getData(file); 
        list = new ArrayList<ListView>();
        for (int i = 1; i <= n; i++) {
            chuaxet[i] = true;
        }
        BFS(inputDau,inputCuoi);
        System.out.println();
    }
}
