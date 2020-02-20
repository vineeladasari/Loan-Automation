/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import static Controller.DataBaseConnection.DRIVER;
import static Controller.DataBaseConnection.PASSWORD;
import static Controller.DataBaseConnection.URL;
import static Controller.DataBaseConnection.USER_NAME;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DML_Queries implements DML_Interface{
Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
         private static DML_Queries inst;

    public static DML_Queries getInst() {
        if (inst == null) {
            inst = new DML_Queries();
        }
        return inst;
    }
        
        
    @Override
  
    public void register(String name, String username, String email, String mobile, String password) {
         //To change body of generated methods, choose Tools | Templates.
         try 
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("insert into CUSTOMER(name,username,email,mobile,password) values(?,?,?,?,?)");
                    pst.setString(1,name);
                   pst.setString(2,username);
                   pst.setString(3, email);
                    pst.setString(4,mobile);
                   pst.setString(5,password);
                  
                  
                   
                   pst.execute();
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } 
            catch(Exception ex){}
        }
    }

    @Override
    public void employeeRegister(String name, String password, String email, String mobile , String address) {
         //To change body of generated methods, choose Tools | Templates.
         
          try 
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("insert into Employee(name,password,email,mobile,address) values(?,?,?,?,?)");
                   pst.setString(1,name);
                   pst.setString(2,password);
                   pst.setString(3,email);
                   pst.setString(4,mobile);
                   pst.setString(5, address);
                   pst.execute();
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } 
            catch(Exception ex){}
        }
         
         
    }

    @Override
    public void addbank(String bankid, String bankname, String email, String mobile, String address,String type) {
        
       //To change body of generated methods, choose Tools | Templates.
       try 
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("insert into bank(bankid,bankname,email,mobile,address,typeOfLoan) values(?,?,?,?,?,?)");
                   pst.setString(1,bankid);
                   pst.setString(2,bankname);
                   pst.setString(3,email);
                   pst.setString(4,mobile);
                   pst.setString(5, address);
                   pst.setString(6, type);
                   pst.execute();
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } 
            catch(Exception ex){}
        }
         
       
    }

    @Override
    public void viewbank() {
         //To change body of generated methods, choose Tools | Templates.
          try 
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("select * from  bank") ;
                  
                   pst.execute();
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } 
            catch(Exception ex){}
        }
         
    }

    @Override
    public void deleteBank(String bankid) {
    //To change body of generated methods, choose Tools | Templates.
     try 
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("delete from  bank where bankid='" + bankid + "'") ;
                  
                   pst.execute();
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } 
            catch(Exception ex){}
        }
         
       
    }

    @Override
    public void updateBank(String bankid, String bankname, String email, String mobile, String address,String type) {
         //To change body of generated methods, choose Tools | Templates.
         
         
          try 
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("update bank set  bankname='" + bankname + "', email='" + email+ "',mobile='" + mobile + "',address='" + address + "',typeOfLoan='" + type + "' where bankid = '" + bankid + "'");
                  
                   pst.execute();
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } 
            catch(Exception ex){}
        }
         
         
         
    }

    @Override
    public void updateEmployee(String name, String password, String email, String mobile, String address) {
         //To change body of generated methods, choose Tools | Templates.
         
       
          try 
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            String query = "update employee set password='" + password + "', email='" + email + "', mobile='" + mobile + "',address='" + address + "' where name = '" + name + "'";
            stmt.executeUpdate(query);
            //Class.forName(DRIVER);
            //con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            //stmt = con.createStatement();
                  // PreparedStatement pst=con.prepareStatement("update employee set  password='" + password + "', email='" + email+ "',mobile='" + mobile + "',address='" + address + "', where name= '" + name + "'");
                  
                  // pst.execute();
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } 
            catch(Exception ex){}
        }
         
    }

    @Override
    public void deleteEmployee(String name) {
         //To change body of generated methods, choose Tools | Templates.
          try 
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("delete from employee where name = '" + name + "'") ;
                  
                   pst.execute();
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } 
            catch(Exception ex){}
        }
         
    }


    @Override
    public void addApplication(String bankname, String type, String amount, int applicationid, String username) {
         //To change body of generated methods, choose Tools | Templates.
         try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("insert into applications values(?,?,?,?,?)");
                   pst.setInt(4,applicationid);
                   pst.setString(1,bankname);
                   pst.setString(2,type);
                   pst.setString(3,amount);
                   pst.setString(5,username);
                  
                   
                   pst.executeUpdate();
                  
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
             
         
    }

    @Override
    public void applicationStatus(String applicationid, String username, String status) {
        //To change body of generated methods, choose Tools | Templates.
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
                   PreparedStatement pst=con.prepareStatement("insert into applicationStatus values(?,?,?)");
                   pst.setString(1,applicationid);
                   pst.setString(2,username);
                   pst.setString(3,status);
                   
                   pst.executeUpdate();
                  
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(stmt != null) stmt.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
             
        
        
        
        
    }

   
    
    
    
    
    
}
