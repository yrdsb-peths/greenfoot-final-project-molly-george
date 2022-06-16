import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rowlet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rowlet extends Characters
{
    public int RowletX;
    public int RowletY;
    public static int rHP = 60;
    public static boolean enemy = true;
    
    public Rowlet()
    {
        rHP = 60;
    }
    
    
    public void act()
    {
        int RowletX = getX();
        int RowletY = getY();
        removeTouching(NormalAttack.class);
    }
    
    
    
}
