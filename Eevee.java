import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eevee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eevee extends Characters
{
    public static int eeveeX;
    public static int eeveeY;
    public static int eHP = 55;
    
    public Eevee()
    {
        eHP = 65;
        setImage(new GreenfootImage("Eevee.png"));
    }
    
    public void act()
    {
        int eeveeX = getX();
        int eeveeY = getY();
        movementC(eeveeX, eeveeY);
        removeTouching(NormalAttack.class);
    }
    
    
    
}
