/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author manas
 */
public interface DML_Interface {

    

    public void register(String name, String username, String email, String mobile, String password);

    public void employeeRegister(String username, String password, String name, String mobile, String email);

    public void addbank(String bankid, String bankname, String email, String mobile, String address, String type);

    public void viewbank();

    public void deleteBank(String bankid);

    public void updateBank(String bankid, String bankname, String email, String mobile, String address,String type);

    public void updateEmployee(String name, String password, String email, String mobile, String address);

    public void deleteEmployee(String name);

    //public void application(String bankname, String type, String amount,int applicationid,String username);

    public void addApplication(String bankname, String type, String amount, int applicationid,String username);

    public void applicationStatus(String applicationid, String username, String status);
    
}
