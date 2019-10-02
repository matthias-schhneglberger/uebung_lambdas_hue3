/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung1;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author matth
 */
public class Main {
    public static List<Weapon> weaponsList;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        ReadCSV csvReader = new ReadCSV();
        
        csvReader.read();
        
        weaponsList = csvReader.getWeapons();
        
        Comparator<Weapon> sortByDamageIncrease = 
            (Weapon w1, Weapon w2) -> w1.getDamage() - w2.getDamage();
        
        
        weaponsList.sort(sortByDamageIncrease);
        
    }
    
}
