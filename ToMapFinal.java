import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToMapFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToMapFinal extends NewLabelClass
{
    public static boolean click;
    
    public ToMapFinal()
    {
        setImage(new GreenfootImage("Tomapfinal.png"));
    }
    
    public void act()
    {
        click = Greenfoot.mouseClicked(this);
    }
}
