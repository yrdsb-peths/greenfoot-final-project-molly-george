import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eevee here.
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class Eevee extends Characters
{
    public static int eeveeX;
    public static int eeveeY;
    public static int eHP = 55;
    GreenfootSound ds = new GreenfootSound("damage.wav");
    
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
        if(isTouching(NormalAttack.class))
        {
            ds.play();
            removeTouching(NormalAttack.class);
        }
    }
    
    
    
}
