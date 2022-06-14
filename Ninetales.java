import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninetales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninetales extends Characters
{
    public int NinetalesX;
    public int NinetalesY;
    
    public void act()
    {
        int NinetalesX = getX();
        int NinetalesY = getY();
        movementA(NinetalesX, NinetalesY);
    }
    
    
}
