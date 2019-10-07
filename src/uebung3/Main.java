/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung3;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author matth
 */



@FunctionalInterface
interface Mapper<S, T> {
    T map(S from);
    
    List<T> mapAll(List<S> from);
}





public class Main implements Mapper{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final List<String> names = Arrays.asList("Tim", "Andi", "Michael");
        
        final Mapper<String, Integer> intMapper = String::length;
        System.out.println(intMapper.mapAll(names));
        final Mapper<String, String> stringMapper = str -> ">> " + str.toUpperCase() + "<< ";
        
        final List<String> uppercasesNames = stringMapper.mapAll(names);
        System.out.println(uppercasesNames);
    }

    @Override
    public Object map(Object from) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List mapAll(List from) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
