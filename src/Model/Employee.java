/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.DDL_Interface;
import Controller.DDL_Queries;
import Controller.DML_Interface;
import Controller.DML_Queries;

/**
 *
 * @author manas
 */
public class Employee {
    String name;
    
    String emailId;
    String password;
    String mobile;
    String address;
    DDL_Interface ddl = (DDL_Interface) new DDL_Queries();
    DML_Interface dml = (DML_Interface) new DML_Queries();
    
    public String employeelogin(String userName)
     {
        password = ddl.Employeelogin(userName);
        return password;
    }
     
    public String getEmployeeAddress(String userName)
     {
       address = ddl.getEmployeeAddress(userName);
       return address;
    }
       public String getEmployeeMobileNumber(String userName){
       mobile= ddl.getEmployeeMobileNumber(userName);
       return mobile;
        }
       
       public String getEmployeeEmailID(String userName){
       emailId = ddl.getEmployeeEmailID(userName);
       return emailId;
    }
       



public  void employeeRegister(String name, String password, String email, String mobile, String address) {
        //To change body of generated methods, choose Tools | Templates.\
        dml.employeeRegister(name, password, email, mobile, address);
    }

    public void updateEmployee(String name, String password, String email, String mobile, String address) {
         //To change body of generated methods, choose Tools | Templates.
         dml.updateEmployee(name, password, email, mobile, address);
    }

    public void deleteEmployee(String name) {
         //To change body of generated methods, choose Tools | Templates.
         dml.deleteEmployee(name);
    }

    
}
