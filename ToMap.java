import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToMap extends Actor
{
    public boolean click;
    
    public void act()
    {
        click  = Greenfoot.mouseClicked(this);
    }
}
