import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eevee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eevee extends Characters
{
    public static int EeveeX;
    public int EeveeY;
    public static int eHP = 55;
    
    public Eevee()
    {
        eHP = 65;
    }
    
    public void act()
    {
        int EeveeX = getX();
        int EeveeY = getY();
        removeTouching(NormalAttack.class);
    }
    
    
    
}
