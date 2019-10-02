/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matth
 */
public class ReadCSV {
    public static String path = "weapons.csv";
    
    public static void read(){
        try {
            
            FileReader reader = new FileReader(path);
            BufferedReader br = new BufferedReader(reader);
            
            
            
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ReadCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
