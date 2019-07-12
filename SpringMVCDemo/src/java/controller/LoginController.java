/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HibernateUtil;
import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author LOC
 */
public class LoginController extends AbstractController {
    
    public LoginController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("login");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List <User> users = session.createQuery("from User").list();
        session.getTransaction().commit();
        session.close();
        mv.addObject("users", users);
        mv.addObject("messege", "ALL USERS");
        return mv;
    }
    
}
