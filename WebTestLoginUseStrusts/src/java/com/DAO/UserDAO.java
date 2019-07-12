/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.util.HibernateUtil;
import com.model.User;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;

/**
 *
 * @author LOC
 */
public class UserDAO {
    public void addUser(User user){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }
    public List<User> getAll(){
         Session session = HibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         List <User> users = session.createQuery("from User ORDER BY userId DESC").list();
         session.getTransaction().commit();
         session.close();
         return users;
    }
    public long lastId(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        List<User> users = s.createQuery("from User where id = (select max(id) from User)").list();
        int id = users.get(0).getUserId();
        return id;
    }
}
