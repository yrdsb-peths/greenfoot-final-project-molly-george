import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToMap3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToMap3 extends NewLabelClass
{
    public static boolean click;
    
    public ToMap3()
    {
        setImage(new GreenfootImage("Tomap3.png"));
    }
    
    public void act()
    {
        click = Greenfoot.mouseClicked(this);
    }
}