import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Squirtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squirtle extends Characters
{
    public int SquirtleX;
    public int SquirtleY;
    public static int sHP = 55;
    public static boolean enemy = true;
    
    public Squirtle()
    {
        sHP = 55;
    }
    
    
    public void act()
    {
        int SquirtleX = getX();
        int SquirtleY = getY();
        if(enemy != true)
        {
            movementB(SquirtleX, SquirtleY);
        }
        else
        {
            if(isTouching(Attack1.class))
            {
                removeTouching(Attack1.class);
                sHP -= 4;
            }
        }
    }
    
    
}
