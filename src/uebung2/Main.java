/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung2;

import java.util.Arrays;

/**
 *
 * @author matth
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] randomNumbers = getRandomNums(10000);
        
        System.out.println("Durchschnitt: " + average(randomNumbers));
        
        String[] randomString = getRandomStrings(10, 10);
        
        for(String i : randomString){
            System.out.println(i);
        }
    }
    
    private static int[] getRandomNums(int nums){
        int[] numbers = new int[nums];
        
        for(int i = 0; i < nums; i++){
            numbers[i] = (int)(Math.random()*100);
        }
        
        return numbers;
    }
    
    private static String[] getRandomStrings(int howMany, int targetStringLength){
        int leftLimit = 97;
        int rightLimit = 122;
        
        String[] strings = new String[howMany];
        
        for(int i = 0; i < howMany; i++){
            
            String tempString = "";
            
            for(int o = 0; o < targetStringLength; o++){
                String tempChar = "" + (char) ((int)(Math.random()*(rightLimit-leftLimit)+leftLimit));
                
                tempString += tempChar;
            }
            
            strings[i] = tempString;
            
        }
        
        return strings;
    }
    
    
    
    public static double average(int[] numbers){
        return Arrays.stream(numbers).average().getAsDouble();
    }
    
}
