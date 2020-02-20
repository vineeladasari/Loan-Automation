/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Controller.Bankobj;
import Controller.DDL_Interface;
import Controller.DDL_Queries;
import Controller.DML_Interface;
import Controller.DML_Queries;
/**
 *
 * @author manas
 */
public class Bank {

   
    
    String bankid;
    String bankname;
    String emailId;
    String address;
    String mobile;
    
    DDL_Interface ddl = (DDL_Interface) new DDL_Queries();
    DML_Interface dml = (DML_Interface) new DML_Queries();
    
    public String getBankname(String bankid)
     {
       bankname= ddl.getBankName(bankid);
       return bankname;
    }
      public Object getbankid() {
          bankid = ddl.getBankid();
          return bankid;
        
    }
    
       public String getBankMobileNumber(String bankid){
       mobile= ddl.getBankMobileNumber(bankid);
       return mobile;
        }
       
       public String getBankEmailID(String bankid){
       emailId = ddl.getBankEmailID(bankid);
       return emailId;
    }
      

    public void addBank(String bankid, String bankname, String email, String mobile, String address, String type) {
       dml.addbank(bankid, bankname, email, mobile, address,type);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public Bankobj allBanks(){
        Bankobj bank;
        bank = ddl.allBanks();
        return bank;
    }
    
    
    public void deleteBank(String bankid) {
        dml.deleteBank(bankid) ;//To change body of generated methods, choose Tools | Templates.
    }

    public void updateBank(String bankid, String bankname, String email, String mobile, String address,String type) {
         //To change body of generated methods, choose Tools | Templates.
         dml.updateBank(bankid,bankname,email,mobile,address,type);
    }

   
    
    
    
    
}
