import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Charmander here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Charmander extends Characters
{
    public int CharmanderX;
    public int CharmanderY;
    public int CharmanderHP = 65;
    
    public void act()
    {
        int CharmanderX = getX();
        int CharmanderY = getY();
        movementB(CharmanderX,CharmanderY);
    }
    
    
}
