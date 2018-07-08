package com.example.studyhard.appworks_android_w1;


public class Warrior extends Human {
    /**
     * *************** Tips ****************
     * Jobs: Hunter, Warrior, Mage
     * Weapons and Skills:
     * -----------------------------------
     * | Default Blade | Slash           |
     * | Fire Blade    | Fire Slash      |
     * | Ice Blade     | Ice Slash       |
     * -----------------------------------
     * | Default Bow   | Arrow           |
     * | Fire Bow      | Fire Arrow      |
     * | Ice Bow       | Ice Arrow       |
     * -----------------------------------
     * | Default Staff | Arcane Missiles |
     * | Fire Staff    | Fireball        |
     * | Ice Staff     | Frostbolt       |
     * -----------------------------------
     */

    public Warrior(String inputName,int inputWeapon)
    {
        setName(inputName);
        setWeapon(inputWeapon);
    }


    public void attack()
    {
        if(getWeapon()==FIRE_BOW)
        {
            System.out.println("Fire Slash!");
        }
        else if(getWeapon()==ICE_BOW)
        {
            System.out.println("Ice Slash!");
        }
        else //Default
        {
            System.out.println("Slash!");
        }
    }
}