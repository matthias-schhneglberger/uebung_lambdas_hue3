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
        Printable printerSimple = (list) -> list.forEach(w -> {
            System.out.println(w.toString(" || "));
        });
        
        
        
        Printable printerHard = (list) -> 
            list
            .stream()
            
            .forEach(w -> {
                int tabellenbreite = 17;
                
                for(int i = 0; i <= 6; i++){
                    
                    System.out.print("+");
                    for(int o = 0; o <= tabellenbreite; o++){
                        System.out.print("-");
                    }
                }
                System.out.print("+");
                System.out.println("");
                System.out.print("|");
                
                
                int zusaetzlicheLeer = tabellenbreite - w.getName().length();
                System.out.print(w.getName());
                for(int i = 0; i <= zusaetzlicheLeer; i++){
                    System.out.print(" ");
                }
                System.out.print("|");
                
                
                zusaetzlicheLeer = tabellenbreite - w.getCombatType().toString().length();
                System.out.print(w.getCombatType().toString());
                for(int i = 0; i <= zusaetzlicheLeer; i++){
                    System.out.print(" ");
                }
                System.out.print("|");
                
                zusaetzlicheLeer = tabellenbreite - w.getDamageType().toString().length();
                System.out.print(w.getDamageType().toString());
                for(int i = 0; i <= zusaetzlicheLeer; i++){
                    System.out.print(" ");
                }
                System.out.print("|");
                
                zusaetzlicheLeer = tabellenbreite - String.valueOf(w.getDamage()).length();
                System.out.print(String.valueOf(w.getDamage()));
                for(int i = 0; i <= zusaetzlicheLeer; i++){
                    System.out.print(" ");
                }
                System.out.print("|");
                
                zusaetzlicheLeer = tabellenbreite - String.valueOf(w.getSpeed()).length();
                System.out.print(String.valueOf(w.getSpeed()));
                for(int i = 0; i <= zusaetzlicheLeer; i++){
                    System.out.print(" ");
                }
                System.out.print("|");
                
                
                zusaetzlicheLeer = tabellenbreite - String.valueOf(w.getStrength()).length();
                System.out.print(String.valueOf(w.getStrength()));
                for(int i = 0; i <= zusaetzlicheLeer; i++){
                    System.out.print(" ");
                }
                System.out.print("|");
                
                zusaetzlicheLeer = tabellenbreite - String.valueOf(w.getValue()).length();
                System.out.print(String.valueOf(w.getValue()));
                for(int i = 0; i <= zusaetzlicheLeer; i++){
                    System.out.print(" ");
                }
                System.out.print("|");
                
                
                
                
                System.out.println("");
        });
        
        
        
        ReadCSV csvReader = new ReadCSV();
        
        csvReader.readWithLambda();
        
        weaponsList = csvReader.getWeapons();
        
        printerHard.print(sortByCombatTypeDamageTypeName(weaponsList));
        
        
        
        
        
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
