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
import Model.Application;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author manas
 */
public class DDL_Queries implements DDL_Interface {
    private static DDL_Queries inst;
    public static DDL_Queries getInst() {
        if (inst == null) {
            inst = new DDL_Queries();
        }
        return inst;
    }

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    @Override
    public String login(String userName) {
String password = null;
        try 
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select password from customer where username='" + userName + "'");
            while(rs.next()) 
            {
               password = rs.getString(1);
            }
        
        }
        catch(ClassNotFoundException e)
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
        
        return password;
    }

    @Override
    public String getName(String userName) {
        //To change body of generated methods, choose Tools | Templates.
        String name = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select name from customer where username = '" + userName + "'");
            while(rs.next()) 
            {
               name = rs.getString(1);          
            }
        
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e) 
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
        
        return name;
        
    }

    @Override
    public String getMobileNumber(String userName) {
         //To change body of generated methods, choose Tools | Templates.
         
         String phone = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select mobileno from customer where username = '" + userName + "'");
            while(rs.next())
            {
               phone = rs.getString(1);          
            }
        
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
        
        return phone;
    }

    @Override
    public String getEmailID(String userName) {
        //To change body of generated methods, choose Tools | Templates.
        String emailID = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select emailid from customer where username = '" + userName + "'");
            while(rs.next()) 
            {
               emailID = rs.getString(1);          
            }
        
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
        
        return emailID;
    }

    @Override
    public String getAddress(String userName) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String address = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select address from customer where username = '" + userName + "'");
            while(rs.next()) 
            {
               address = rs.getString(1);          
            }
        
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
        
        return address;
    }

    @Override
    public String Employeelogin(String userName) {
         //To change body of generated methods, choose Tools | Templates.
         String password = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select password from employee where name = '" + userName + "'");
            while(rs.next()) 
            {
               password = rs.getString(1);          
            }
        
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
        
        return password;
    }

   

    @Override
    public String getEmployeeAddress(String userName) {
       
//To change body of generated methods, choose Tools | Templates.
String emailID = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select emailid from customer where name = '" + userName + "'");
            while(rs.next()) 
            {
               emailID = rs.getString(1);          
            }
        
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
        
        return emailID;
    }

    @Override
    public String getEmployeeMobileNumber(String userName) {
         //To change body of generated methods, choose Tools | Templates.
         String mobile = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select mobile from employee where name = '" + userName + "'");
            while(rs.next()) 
            {
               mobile = rs.getString(1);          
            }
        
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
        
        return mobile;
    }

    @Override
    public String getEmployeeEmailID(String userName) {
        //To change body of generated methods, choose Tools | Templates.
        String emailID = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select emailid from employee where name = '" + userName + "'");
            while(rs.next()) 
            {
               emailID = rs.getString(1);          
            }
        
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
        
        return emailID;
    }

    @Override
    public String getBankName(String bankid) {
         //To change body of generated methods, choose Tools | Templates.
         String name = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select name from bank where id = '" + bankid + "'");
            while(rs.next()) 
            {
               name = rs.getString(1);          
            }
        
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
        
        return name;
         
    }

    @Override
    public String getBankMobileNumber(String bankid) {
         //To change body of generated methods, choose Tools | Templates.
         String mobile = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select mobile from bank where bankid = '" + bankid + "'");
            while(rs.next()) 
            {
               mobile = rs.getString(1);          
            }
        
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
        
        return mobile;
    }

    @Override
    public String getBankEmailID(String bankid) {
         //To change body of generated methods, choose Tools | Templates.
         String emailID = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select emailid from bank where bankid = '" + bankid + "'");
            while(rs.next()) 
            {
               emailID = rs.getString(1);          
            }
        
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
        
        return emailID;
    }

    @Override
    public String getBankid() {
        String bankid = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select bankid from bank ");
            while(rs.next()) 
            {
               bankid = rs.getString(1);          
            }
        
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
        
        return bankid;
    }

   
    @Override
    
   
   
    public int retrieveNextApplicationID() {
         //To change body of generated methods, choose Tools | Templates.
         int rid = 0;
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select max(applicationid)+1 as applicationid from applications");
            while(rs.next()) {
               rid = rs.getInt(1);
            }
        
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
        
        return rid;
    }

    @Override
    public ApplicationObj allApplications() {
         //To change body of generated methods, choose Tools | Templates.
         ApplicationObj appobj = new ApplicationObj();
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from applications order by applicationid");
            while(rs.next()) {
               
               appobj.applicationid.add(rs.getInt(4));
               appobj.bankname.add(rs.getString(1));
               appobj.type.add(rs.getString(2));
               appobj.amount.add(rs.getString(3));
               appobj.username.add(rs.getString(5));
               
            }
        
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
        
        return appobj;
    }

    @Override
    public StatusObj allStatus( String username) {
         //To change body of generated methods, choose Tools | Templates.\
         StatusObj obj = new StatusObj();
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from applicationstatus where username = '" + username + "'");
            while(rs.next()) {
               
               obj.applicationid.add(rs.getString(1));
               obj.username.add(rs.getString(2));
               obj.status.add(rs.getString(3));
               
               
            }
        
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
        
        return obj;
         
    }

    @Override
    public Bankobj allBanks() {
         //To change body of generated methods, choose Tools | Templates.
         Bankobj obj = new Bankobj();
        
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select bankid,bankname,typeOfLoan,address,mobile from bank");
            while(rs.next()) {
               obj.bankid.add(rs.getInt(1));
               obj.bankname.add(rs.getString(2));
               obj.typeOfLoan.add(rs.getString(3));
               obj.address.add(rs.getString(4));
               obj.mobile.add(rs.getString(5));
               
               
            }
        
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
        
        return obj;
         
    }

   

    
    
}
