/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.*;



/**
 *
 * @author manas
 */
public class Application {

   
    public Integer applicationid;
    public String bankname;
    private String type;
    private String amount;
    public int nextapplicationid;
    DDL_Interface ddl = (DDL_Interface) new DDL_Queries();
    DML_Interface dml = (DML_Interface) new DML_Queries();
    
     
   

   
    
     public void addApplication(String bankname, String type, String amount, int applicationid,String username) {
         //To change body of generated methods, choose Tools | Templates.
          dml.addApplication(bankname,type,amount,applicationid,username);
    }
     
     
     public ApplicationObj getAllApplications(){
        ApplicationObj appobj;
        appobj = ddl.allApplications();
        return appobj;
    }

    public int getNextApplicationID() {
        nextapplicationid = ddl.retrieveNextApplicationID();
        return nextapplicationid; //To change body of generated methods, choose Tools | Templates.
    }
    
}
