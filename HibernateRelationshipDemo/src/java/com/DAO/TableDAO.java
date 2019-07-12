/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.model.Table;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author LOC
 */
public class TableDAO {
    public List<Table> getAll(){
         Session session = HibernateUtil.getSessionFactory().openSession();
         session.beginTransaction();
         List <Table> tables = session.createQuery("FROM Table").list();
         session.getTransaction().commit();
         tables.forEach((t) -> {
             t.getSqlfile().getName();
         });
         
         session.close();
         return tables;
    }
    public void add(Table table,int idsqlfile){
        Session s = HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        Query query = s.createSQLQuery("INSERT INTO `table`(`name`, `sqlfile_id`) VALUES (:name,:sqlfile)");
        query.setParameter("name", table.getName());
        query.setParameter("sqlfile", idsqlfile);
        query.executeUpdate();
        s.getTransaction().commit();
        s.close();
    }

}
