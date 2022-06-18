import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToMap2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToMap2 extends NewLabelClass
{
    
    public static boolean click;
    
    public ToMap2()
    {
        setImage(new GreenfootImage("Tomap2.png"));
    }
    
    public void act()
    {
        click = Greenfoot.mouseClicked(this);
    }
}
