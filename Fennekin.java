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
    public static boolean enemy = true;
    
    public Fennekin()
    {
        fHP = 45;
        setImage(new GreenfootImage("Fennekin.png"));
    }
    
    public void act()
    {
        int FennekinX = getX();
        int FennekinY = getY();
        removeTouching(NormalAttack.class);
    }
    
    public void movement()
    {
        
        
    
    }
}
