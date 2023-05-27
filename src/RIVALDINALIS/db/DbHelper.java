/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RIVALDINALIS.db;

import RIVALDINALIS.model.*;
import RIVALDINALIS.dao.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author RIVAL DINALIS
 */
public class DbHelper {
    private static Connection connection;
    
    public static Connection getConectoin() throws SQLException{
        if(connection==null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost/pbo_2211082028");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    public static void main (String[] args){
        try{
            connection = DbHelper.getConectoin();
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            Anggota angggota = new Anggota("A002", "ali", "Padang", "L");
            dao.insert(angggota);
            
            JOptionPane.showMessageDialog(null,"koneksi ok");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    } 
}
