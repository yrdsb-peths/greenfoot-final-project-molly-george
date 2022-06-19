import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rowlet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rowlet extends Characters
{
    public static int rowletX;
    public static int rowletY;
    public static int rHP = 60;
    GreenfootSound ds = new GreenfootSound("damage.wav");
    
    public Rowlet()
    {
        rHP = 60;
        setImage(new GreenfootImage("Rowlet.png"));
    }
    
    
    public void act()
    {
        int RowletX = getX();
        int RowletY = getY();
        
        if(isTouching(NormalAttack.class))
        {
            ds.play();
            removeTouching(NormalAttack.class);
        }

    }
    
    
    
}
