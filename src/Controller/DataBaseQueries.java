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
public class DataBaseQueries {
    
    public static DDL_Queries DDL() {
        return DDL_Queries.getInst();
    }

    public static DML_Queries DML() {
        return DML_Queries.getInst();
    }
}
