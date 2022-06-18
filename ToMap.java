import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToMap extends NewLabelClass
{
    public boolean click;
    
    public ToMap()
    {
        setImage(new GreenfootImage("toMap.png"));
    }
    
    public void act()
    {
        click  = Greenfoot.mouseClicked(this);
    }
}
