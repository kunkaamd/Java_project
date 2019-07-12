/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author LOC
 */
public class ${name?cap_first}DAO extends ConfigDB{
    
    
    public void create${name?cap_first}(<#list properties as item>String ${item.name}<#sep>, </#sep></#list>){
        String insertSQL = "INSERT INTO `${name}`(<#list properties as item>`${item.name}`<#sep>, </#sep></#list>) VALUES(<#list properties as item>?<#sep>, </#sep></#list>)";
        try {
            openConnection();
            PreparedStatement preparedStatement = cnn.prepareStatement(insertSQL);
            <#list properties as item>
            preparedStatement.setString( ${item?counter},${item.name});
            </#list>
            
            preparedStatement.executeUpdate();
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(${name?cap_first}DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    <#if (primary)??>
        public void delete${name?cap_first}(String ${primary}){
            try {
                String deleteSQL = "DELETE FROM `${name}` WHERE `${primary}`=?";
                openConnection();
                PreparedStatement preparedStatement = cnn.prepareStatement(deleteSQL);
                preparedStatement.setString(1, ${primary});
                preparedStatement.executeUpdate();
                closeConnection();
            } catch (SQLException ex) {
                Logger.getLogger(${name?cap_first}DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    </#if>
    public ArrayList getAll${name?cap_first}(){
        ArrayList<String> arrayList = new ArrayList<>();
        String getALlSQL = "SELECT * FROM `${name}`";
        try {
            openConnection();
            PreparedStatement preparedStatement = cnn.prepareStatement(getALlSQL);
            rs = preparedStatement.executeQuery();
            while(rs.next()){
                arrayList.add(<#list properties as item>rs.getString("${item.name}")<#sep>+","+</#sep></#list>);
            }
            closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(${name?cap_first}DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayList;
    }
}