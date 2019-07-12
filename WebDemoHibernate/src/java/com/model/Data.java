
package com.model;

import com.Util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
public class Data {

    public Data() {
    }
    public void addUser(User user){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(user);
        s.getTransaction().commit();
        s.close();
    }
    public List<User> getAll(){
         Session session = HibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         List <User> users = session.createQuery("from User ORDER BY userId DESC").list();
         session.getTransaction().commit();
         session.close();
         return users;
    }
    // lay id thi: select max(ID) form User
    public int getLastID(){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        List<User> users = s.createQuery("from User where id = (select max(id) from User)").list();
        int id = users.get(0).getId();
        return id;
    }
}
