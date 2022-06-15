import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eevee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eevee extends Characters
{
    public int EeveeX;
    public int EeveeY;
    public static int eHP = 55;
    public static boolean enemy = true;
    
    public Eevee()
    {
        eHP = 65;
    }
    
    public void act()
    {
        int EeveeX = getX();
        int EeveeY = getY();
        if(enemy != true)
        {
            movementB(EeveeX, EeveeY);
        }
        else
        {
            if(isTouching(Attack1.class))
            {
                removeTouching(Attack1.class);
                eHP -= 4;
            }
        }
        
    }
    
    
    
}
