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
    public static int nHP = 60;
    public static boolean enemy = true;
    
    public Ninetales()
    {
        nHP = 60;
    }
    
    public void act()
    {
        int NinetalesX = getX();
        int NinetalesY = getY();
        removeTouching(NormalAttack.class);
    }
    
    
}
