/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung5_hue2;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 *
 * @author matth
 */
public class BiConsumerBiPredicateUndBiFunction {
    
    
    public static void main(String[] args){
        boolean result1 = biVergleich((a,b) -> a == b*2,10,5);
        
        biAnzeige((Integer i1, Integer i2) -> System.out.println("Das Ergebnis des Testes " + i2 + " *2 == " + i1 + " mit BiPredicate ist " + result1),10,5);
        
        Integer result6 = biBerechnung((Integer i1, Integer i2) -> i1 + i2 ,5,10);
        
        biAnzeige((Integer i1, Integer i2) -> System.out.println("Der Wert der BiFunction mit den Agrumenten " + i1 + " und " + i2 + " ist " + result6),5,10);
    
    
        
        boolean result11 = vergleich(n -> n%2==0, 5);
        
        anzeige((Integer i) -> System.out.println("Das ERgebnis des Testes " + i + "%2==0 ist " + result11), 5);
        
        Integer result61 = berechnung((Integer n) -> n*2, 5);
        
        anzeige((Integer i) -> System.out.println("Der Wert der Function mit den Argumenten " + i + " ist " + result61),5);
        
        
        
        boolean result12 = berechnungmitBinaryOperator((Integer i1, Integer i2) -> i1+i2 == 0, 15,20);
        
        biAnzeige((Integer i1, Integer i2) -> System.out.println("Das Ergebnis des Testes " + i2 + " *2 == " + i1 + " mit BiPredicate ist " + result12), 15,20);
        
        
        UnaryOperator test = n -> String.valueOf(n).toUpperCase();
        
        System.out.println(test.apply("tEsT"));
        
        
        }
    
    
    public static boolean vergleich(Predicate<Integer> predicate, Integer i){
        return predicate.test(i);
    }
    
    public static void anzeige(Consumer<Integer> consumer, Integer i){
        consumer.accept(i);
    }
    
    //
    public static boolean biVergleich(BiPredicate<Integer, Integer> biPredicate, Integer i1, Integer i2){
        return biPredicate.test(i2, i2);
    }
    
    //
    public static void biAnzeige(BiConsumer<Integer, Integer> biConsumer, Integer i1, Integer i2){
        biConsumer.accept(i2, i2);
    }
    
    public static Integer berechnung(Function<Integer, Integer> function, Integer i){
        return function.apply(i);
    }
    
    //
    public static Integer biBerechnung(BiFunction<Integer, Integer, Integer> biFunction, Integer i1, Integer i2){
        return biFunction.apply(i2, i2);
    }
    
    
    public static Integer berechnungmitBinaryOperator(BinaryOperator<Integer> binaryOperator, Integer i1, Integer i2){
        return binaryOperator.apply(i2, i2);
    }
    
    
    
    
}
