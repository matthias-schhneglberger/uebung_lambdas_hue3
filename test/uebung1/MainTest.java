/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung1;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matth
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Main.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testSortByDamageIncrease(){
        System.out.println("Testing sort Weapons by damage increase");
        
        Main.main(null);
        List<Weapon> weapons = Main.sortByDamageIncrease(Main.weaponsList);
        boolean richtig = true;
        for(int i = weapons.size()-1; i > 0; i--){
            if(!  (weapons.get(i).getDamage() >= weapons.get(i-1).getDamage())  ){
                richtig = false;
            }
        }
        
        assertTrue("nicht Richtig sortiert", richtig);
        
    }
    
}
