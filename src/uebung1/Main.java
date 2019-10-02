/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung1;

import java.util.Collections;
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
        
//        for(Weapon e : weaponsList){
//            System.out.println(e.getName());
//        }
        
        
        
        
        
    }
    
    public static List<Weapon> sortByDamageIncrease(List<Weapon> listToSort){
        Comparator<Weapon> sortByDamageIncrease = 
            (Weapon w1, Weapon w2) -> w1.getDamage() - w2.getDamage();
        
        listToSort.sort(sortByDamageIncrease);

        return listToSort;
    }
    
    public static List<Weapon> sortByCombatTypeDamageTypeName(List<Weapon> listToSort){
        Comparator<Weapon> sortByCombatType = (Weapon w1, Weapon w2) -> w1.getCombatType().toString().compareTo(w2.getCombatType().toString());
        Comparator<Weapon> sortByDamageType = (Weapon w1, Weapon w2) -> w1.getDamageType().toString().compareTo(w2.getDamageType().toString());
        Comparator<Weapon> sortByName = (Weapon w1, Weapon w2) -> w1.getName().compareTo(w2.getName());

        Collections.sort(listToSort, sortByCombatType.thenComparing(sortByDamageType).thenComparing(sortByName));
        
        return listToSort;
    }
    
}
