/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung2;

import uebung1.*;

/**
 *
 * @author matth
 */
public class Weapon {
    public Weapon(){}
    public Weapon(String csvString){
        String[] parts = csvString.split(";");
        
        setName(parts[0]);
        setCombatType(CombatType.valueOf(parts[1]));
        setDamageType(DamageType.valueOf(parts[2]));
        setDamage(Integer.valueOf(parts[3]));
        setSpeed(Integer.valueOf(parts[4]));
        setStrength(Integer.valueOf(parts[5]));
        setValue(Integer.valueOf(parts[6]));
    }
    String name;
    CombatType combatType;
    DamageType	damageType;
    int damage;
    int speed;
    int strength;
    int value;


    public String toString(String seperator) {
        return name + seperator + combatType + seperator + damageType + seperator + damage + seperator + speed + seperator + strength + seperator + value;
    }
    
    public String toString(String begin, String seperator, String end) {
        return begin + name + seperator + combatType + seperator + damageType + seperator + damage + seperator + speed + seperator + strength + seperator + value + end;
    }
    



    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public void setCombatType(CombatType combatType) {
        this.combatType = combatType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    
    
    

}
