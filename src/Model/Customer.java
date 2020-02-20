/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.ApplicationObj;
import Controller.DDL_Interface;
import Controller.DDL_Queries;
import Controller.DML_Interface;
import Controller.DML_Queries;
import Controller.StatusObj;

/**
 *
 * @author manas
 */
public class Customer {

    
    
    String name;
    String userName;
    String emailId;
    String password;
    String mobile;
    int applicationid;
    
    DDL_Interface ddl = (DDL_Interface) new DDL_Queries();
    DML_Interface dml = (DML_Interface) new DML_Queries();
    
    public String login(String userName)
     {
        password = ddl.login(userName);
        return password;
    }
     public String getName(String userName)
     {
       name= ddl.getName(userName);
       return name;
    }
     
    
       public String getMobileNumber(String userName){
       mobile= ddl.getMobileNumber(userName);
       return mobile;
        }
       
       public String getEmailID(String userName){
       emailId = ddl.getEmailID(userName);
       return emailId;
    }
       



public  void register(String name, String username, String email, String mobile, String password) {
        //To change body of generated methods, choose Tools | Templates.\
        dml.register(name, username, email, mobile, password);
    }

    public void ApplicationStatus(String applicationid, String username, String status) {
         //To change body of generated methods, choose Tools | Templates.
         dml.applicationStatus(applicationid,username,status);
         
    }

    public StatusObj getAllStatus(String username){
        StatusObj statusobj;
        statusobj = ddl.allStatus(username);
        return statusobj;
    }


    
}
