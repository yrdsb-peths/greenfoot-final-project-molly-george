import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GeneralInformation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneralInformation extends Actor
{
    
    public static String[] character = new String[2];
    public int c = 1;
    public static boolean click;
    public static boolean pressSpace;
    
    public GeneralInformation()
    {
        setImage(new GreenfootImage("toMap1.png"));
    }
    
    
    public void act()
    {
        click = Greenfoot.mouseClicked(this);
        pressSpace = Greenfoot.isKeyDown("space");
    }
}
