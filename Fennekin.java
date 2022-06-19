import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fennekin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        setImage(new GreenfootImage("Fennekin.jpg"));
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
