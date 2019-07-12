/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LOC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        List<User> users = userDAO.getAll();
        for(User user : users){
            System.out.println(user.getUserId());         
        }
    }
    
}
