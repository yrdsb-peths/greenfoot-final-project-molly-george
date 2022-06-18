import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fail extends NewLabelClass
{
    public static boolean click;
    
    public Fail()
    {
        setImage(new GreenfootImage("toMap1.png"));
    }
    
    public void act()
    {
        click = Greenfoot.mouseClicked(this);
    }
}
