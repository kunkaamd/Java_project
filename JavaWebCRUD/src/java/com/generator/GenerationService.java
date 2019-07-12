/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generator;

import com.model.Table;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.apache.struts2.ServletActionContext.getServletContext;

/**
 *
 * @author LOC
 */
public class GenerationService {
    private static final String realPath = getServletContext().getRealPath("/").replace("build\\", "");
    private static Configuration cfg = new Configuration();
    static {
        cfg.setServletContextForTemplateLoading(getServletContext(), "form");
    }
    public static void jsp(List<Table> tables) throws TemplateException{
        for (int i = 0; i < tables.size(); i++) {
            Table get = tables.get(i);
            generateCreateJsp(get);
            generateUpdateJsp(get);
            generateReadJsp(get);
        }
    }
    private static void generateCreateJsp(Table table) throws TemplateException{
        try {
            Template template = cfg.getTemplate("create.ftl");
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("name", table.getName());
            data.put("properties",table.getProperties());
            Writer file = new FileWriter (new File(FolderService.getLocalFolder()+"/jsp/admin/create"+table.getName()+".jsp"));
            template.process(data, file);
            file.flush();
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void generateUpdateJsp(Table table) throws TemplateException{
        try {
            Template template = cfg.getTemplate("update.ftl");
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("name", table.getName());
            data.put("properties",table.getProperties());
            Writer file = new FileWriter (new File(FolderService.getLocalFolder()+"/jsp/admin/update"+table.getName()+".jsp"));
            template.process(data, file);
            file.flush();
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static void generateReadJsp(Table table) throws TemplateException{
        try {
            Template template = cfg.getTemplate("read.ftl");
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("name", table.getName());
            data.put("properties",table.getProperties());
            Writer file = new FileWriter (new File(FolderService.getLocalFolder()+"/jsp/admin/read"+table.getName()+".jsp"));
            template.process(data, file);
            file.flush();
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**END JSP**/
    
    /**BEGIN DAO**/
    public static void generateDAO(List<Table> tables,String driver,String url,String user,String pass) throws TemplateException{
        generateConfigDB(driver, url, user, pass);
        for (int i = 0; i < tables.size(); i++) {
            Table get = tables.get(i);
            try {
                Template template = cfg.getTemplate("dao.ftl");
                Map<String, Object> data = new HashMap<String, Object>();
                data.put("name", get.getName());
                data.put("properties",get.getProperties());
                data.put("primary",get.getPrimarykey());
                Writer file = new FileWriter (new File(FolderService.getLocalFolder()+"/com.controller.admin/"+get.getName().substring(0, 1).toUpperCase()+get.getName().substring(1)+"DAO.java"));
                template.process(data, file);
                file.flush();
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(GenerationService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private static void generateConfigDB(String driver,String url,String user,String pass) throws TemplateException{
        try {
            Template template = cfg.getTemplate("configdb.ftl");
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("driver", driver);
            data.put("url", url);
            data.put("user", user);
            data.put("pass", pass);
            Writer file = new FileWriter (new File(FolderService.getLocalFolder()+"/com.controller.admin/ConfigDB.java"));
            template.process(data, file);
            file.flush();
            file.close();
        } catch (MalformedTemplateNameException ex) {
            Logger.getLogger(GenerationService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(GenerationService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GenerationService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
