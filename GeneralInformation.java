import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GeneralInformation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneralInformation extends Actor
{
    public static GreenfootImage[] changeBackground = new GreenfootImage[9];
    public static String[] character = new String[2];
    public int c = 1;
    
    public void act()
    {
        for(c = 1; c < 10; c++)
        {
            changeBackground[c] = new GreenfootImage(c + ".png");
        }
    }
}
