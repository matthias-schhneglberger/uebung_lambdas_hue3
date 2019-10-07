/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author matth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Predicate<Integer> isEven = (Integer t) -> t%2 == 0;
        Predicate<Integer> isPositive = (Integer n) -> n > 0;
        Predicate<Integer> isNull = (Integer i) -> i == null;
        Predicate<Object> objectIsNull = (Object i) -> i == null;
        Predicate<String> isShortWord = (String s) -> s.length() < 4;
        
        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");
        
        System.out.println("Integer eingeben: ");
        int eingabe = console.nextInt();
        
        System.out.println("Ist positiv und gerade: ");
        System.out.println(!Arrays.asList(Stream.of(eingabe).filter(isPositive.and(isEven)).toArray()).isEmpty());
        
        System.out.println("Ist positiv und ungerade: ");
        System.out.println(!Arrays.asList(Stream.of(eingabe).filter(isPositive.and(isEven.negate())).toArray()).isEmpty());
    }
    
}
