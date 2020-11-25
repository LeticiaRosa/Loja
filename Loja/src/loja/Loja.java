/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import connection.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author letic
 */
public class Loja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" OLA ");
        
       connection.Connection con = new Connection();
       con.getConnection();
        
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
       LocalTime time = LocalTime.now();
       // System.out.println(time.format(formatter));
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm"); 
        System.out.println(sdf.format(new Date()));
        System.out.println("Gabriel");
        System.out.println("Gabriel");


       
    }
    
}
