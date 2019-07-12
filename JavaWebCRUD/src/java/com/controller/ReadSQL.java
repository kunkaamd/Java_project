/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Properties;
import com.model.Table;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 *
 * @author LOC
 */
public class ReadSQL extends ActionSupport {
    
    private File myFile;
    private String myFileContentType;
    private String myFileFileName;
    private List<Table> listTable;
    public void validate(){
        if(!myFileFileName.contains(".sql")){
            addFieldError("myFile","The file is not sql!");
        }
    }
    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getMyFileContentType() {
        return myFileContentType;
    }

    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }

    public String getMyFileFileName() {
        return myFileFileName;
    }

    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

    public List<Table> getListTable() {
        return listTable;
    }

    public void setListTable(List<Table> listTable) {
        this.listTable = listTable;
    }
    
    public String execute() throws Exception {
        readSQL();
        //put to session
        Map session = ActionContext.getContext().getSession();
        session.put("table", listTable);
        return "success";
    }
    
    private void readSQL() throws FileNotFoundException, IOException{
        FileReader reader = new FileReader(myFile);
        BufferedReader br = new BufferedReader(reader);
        String line;
        listTable = new ArrayList<Table>();
        while ((line = br.readLine()) != null) {
            if (!line.isEmpty()) {
                if (line.charAt(0) == 'C') {
                    if (line.contains("CREATE TABLE")) {
                        Table table = new Table();
                        List<Properties> propertieses = new ArrayList<Properties>();
                        table.setName(line.substring(14, line.length()-3));//table set name
                        while (!(line = br.readLine()).isEmpty()) {
                            if (line.charAt(2)=='`') {
                                Properties properties = new Properties();
                                String[] slipt = line.substring(2).split(" ");
                                properties.setName(slipt[0].replace("`", ""));
                                properties.setType(slipt[1]);
                                if (line.contains("NOT NULL")) {
                                    properties.setRequired(true);
                                }
                                else{
                                    properties.setRequired(false);
                                }
                                propertieses.add(properties);
                            }
                        }
                        table.setProperties(propertieses);
                        listTable.add(table);
                    }
                }
                else if(line.length()>2){
                    if (line.charAt(3)=='I') {
                        if (line.contains("Indexes for table")) {
                            String nametable = line.substring(22, line.length()-1);
                            br.readLine();
                            br.readLine();
                            while (!(line = br.readLine()).isEmpty()) {
                                String[] split = line.substring(2).split(" ");
                                if (split[1].equals("PRIMARY")) {
                                    for (int i = 0; i < listTable.size(); i++) {
                                        Table get = listTable.get(i);
                                        if (get.getName().equals(nametable)) {
                                            get.setPrimarykey(split[split.length-1].substring(2, split[split.length-1].length()-3));
                                        }
                                    }
                                }
                                else if (split[1].equals("UNIQUE")) {
                                    for (int i = 0; i < listTable.size(); i++) {
                                        Table get = listTable.get(i);
                                        if (get.getName().equals(nametable)) {
                                            for (int j = 0; j < get.getProperties().size(); j++) {
                                                Properties get1 = get.getProperties().get(j);
                                                if (get1.getName().equals(split[split.length-1].substring(2, split[split.length-1].length()-3))) {
                                                    get1.setUnique(true);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if (line.charAt(3)=='C') {
                        if (line.contains("Constraints for table")){
                            String nametable = line.substring(26, line.length()-1);
                            br.readLine();
                            br.readLine();
                            while (!(line = br.readLine()).isEmpty()) {
                                String[] split = line.trim().split(" ");
                                if (split[1].equals("CONSTRAINT")) {
                                    for (int i = 0; i < listTable.size(); i++) {
                                        Table get = listTable.get(i);
                                        if (get.getName().equals(nametable)) {
                                            get.setForeignKey(split[5].substring(2, split[5].length()-2));
                                            get.setReferencesTable(split[7].replace("`", ""));
                                            get.setReferencesKey(split[8].substring(2,split[8].length()-2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
//        for (int i = 0; i < listTable.size(); i++) {
//            Table get = listTable.get(i);
//            System.out.println("---------------"+get.getName()+"--------------------------");
//            System.out.println("FOREIGN KEY:"+get.getForeignKey());
//            System.out.println("REFERENCES:"+get.getReferencesTable());
//            System.out.println("REFERENCES KEY:"+get.getReferencesKey());
//            System.out.println("PRIMARY KEY:"+get.getPrimarykey());
//            System.out.println("-------Properties ---------");
//            for (int j = 0; j < get.getProperties().size(); j++) {
//                Properties get1 = get.getProperties().get(j);
//                System.out.print("name : "+get1.getName()+"\t");
//                System.out.print("type : "+get1.getType()+"\t");
//                System.out.print("required : "+get1.isRequired()+"\t");
//                System.out.print("unique : "+get1.isUnique()+"\t");
//                
//            }
//            System.out.println("-\n-\n-------END"+get.getName()+"---------\n\n");
//        }
    }

}
