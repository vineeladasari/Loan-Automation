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
public interface DataBaseConnection {
    
    public static final String USER_NAME = "loan";
    public static final String PASSWORD = "password";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    
    
}
