/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Application;

import java.util.ArrayList;

/**
 *
 * @author manas
 */
public interface DDL_Interface {

    public String login(String userName);

    public String getName(String userName);

    public String getMobileNumber(String userName);

    public String getEmailID(String userName);

    public String getAddress(String userName);

    public String Employeelogin(String userName);

    
   

   // public String getEmployeename(String userName);

    public String getEmployeeAddress(String userName);

    public String getEmployeeMobileNumber(String userName);

    public String getEmployeeEmailID(String userName);

    public String getBankName(String bankid);

    public String getBankMobileNumber(String bankid);

    public String getBankEmailID(String bankid);

    public String getBankid();
    public abstract ApplicationObj allApplications();
    
   // public abstract ArrayList<Application> selectAllApplications();

    public int retrieveNextApplicationID();

    public StatusObj allStatus(String username);
    public Bankobj allBanks();

    
    
}
