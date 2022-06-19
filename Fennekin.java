import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fennekin here.
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class Fennekin extends Characters
{
    public static int fennekinX;
    public static int fennekinY;
    public static int fHP = 45;
    GreenfootSound ds = new GreenfootSound("damage.wav");
    
    public Fennekin()
    {
        fHP = 45;
        setImage(new GreenfootImage("Fennekin.png"));
    }
    
    public void act()
    {
        int FennekinX = getX();
        int FennekinY = getY();
        if(isTouching(NormalAttack.class))
        {
            ds.play();
            removeTouching(NormalAttack.class);
        }
    }
    
    public void movement()
    {
        
        
    
    }
}
