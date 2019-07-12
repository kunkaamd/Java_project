/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generator;

import java.io.File;

/**
 *
 * @author LOC
 */
public class FolderService {
    private static String localFolder;

    public static String getLocalFolder() {
        return localFolder;
    }

    public static void setLocalFolder(String localFolder) {
        FolderService.localFolder = localFolder;
    }
    

    
    public static void createFolder() {
        new File(localFolder).mkdirs();
        new File(localFolder + "/jsp/admin").mkdirs();
        new File(localFolder + "/com.controller.admin").mkdirs();
    }
}
