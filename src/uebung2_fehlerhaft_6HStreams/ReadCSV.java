/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung2_fehlerhaft_6HStreams;

import uebung1.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author matth
 */
public class ReadCSV {
    public static String path = "weapons.csv";
    private static List<Weapon> weapons = new ArrayList<Weapon>();
    
    public static void readWithoutLambda(){
        try (
            
            FileReader reader = new FileReader(path);
            BufferedReader br = new BufferedReader(reader);)
            {
                
                
            br.readLine();
            
            String line = br.readLine();
            while (line != null){
                
                Weapon currentWeapon = new Weapon();
                
                String[] parts = line.split(";");
                
                currentWeapon.setName(parts[0]);
                currentWeapon.setCombatType(CombatType.valueOf(parts[1]));
                currentWeapon.setDamageType(DamageType.valueOf(parts[2]));
                currentWeapon.setDamage(Integer.valueOf(parts[3]));
                currentWeapon.setSpeed(Integer.valueOf(parts[4]));
                currentWeapon.setStrength(Integer.valueOf(parts[5]));
                currentWeapon.setValue(Integer.valueOf(parts[6]));
                
                weapons.add(currentWeapon);
                
                line = br.readLine();
            }
            
            
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(ReadCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(ReadCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readWithLambda(){
        String fileName = "weapons.csv";
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

                
                list = br.lines().skip(1).collect(Collectors.toList());

        } catch (IOException e) {
                e.printStackTrace();
        }
        
        for(String s : list){
            weapons.add(new Weapon(s));
        }

    }
    
    public static List<Weapon> getWeapons(){
        
        return weapons;
        
    }
}
