package com.example.studyhard.appworks_android_w1;

public class Human{
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
    private String name;
    private int weapon;

    public final static int FIRE_BOW = 1;
    public final static int ICE_BOW = 2;

    public Human(){

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setWeapon(int weapon)
    {
        this.weapon=weapon;
    }

    public int getWeapon()
    {
        return weapon;
    }

    public void attack(){
        System.out.println("Fist Attack!");
    }
}