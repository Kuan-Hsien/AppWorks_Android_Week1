package com.example.studyhard.appworks_android_w1;

public class ​Human{
  ​/**
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
    private ​String ​name​;
    private int weapon;

    public final static int ​FIRE_BOW ​= ​1​;
    public final static int ​ICE_BOW ​= ​2​;

    public ​Human​(){

    }

    public void setWeapon(int weapon)
    {
        this.weapon=weapon;
    }

    public int getWeapon()
    {
        return weapon;
    }

    public void ​attack​(){
        System.​out​.println(​"Fist Attack!"​)​;
    }
}


public class ​Hunter extends Human {
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

    public ​Hunter(String name,int weapon=0)
    {
        this.name=name;
        this.weapon=weapon;
    }

    public void ​attack​()
    {
        if(getWeapon()==FIRE_BOW)
        {
            System.​out​.println(​"Fire Arrow!"​)​;
        }
        else if(getWeapon()==ICE_BOW)
        {
            System.​out​.println(​"Ice Arrow!"​)​;
        }
        else //Default
        {
            System.​out​.println(​"Arrow!"​)​;
        }
    }

}


public class ​Warrior extends Human {
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

    public ​Warrior(String name,int weapon=0)
    {
        this.name=name;
        this.weapon=weapon;
    }


    public void ​attack​()
    {
        if(getWeapon()==FIRE_BOW)
        {
            System.​out​.println(​"Fire Slash!"​)​;
        }
        else if(getWeapon()==ICE_BOW)
        {
            System.​out​.println(​"Ice Slash!"​)​;
        }
        else //Default
        {
            System.​out​.println(​"Slash!"​)​;
        }
    }
}

public class ​Mage extends Human {
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

    public ​Mage(String name,int weapon=0)
    {
        this.name=name;
        this.weapon=weapon;
    }

    public void ​attack​()
    {
        if(getWeapon()==FIRE_BOW)
        {
            System.​out​.println(​"Fireball!"​)​;
        }
        else if(getWeapon()==ICE_BOW)
        {
            System.​out​.println(​"Frostbolt!"​)​;
        }
        else //Default
        {
            System.​out​.println(​"Arcane Missiles!"​)​;
        }
    }

}