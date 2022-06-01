import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartLabel extends Actor
{
    
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Introscreen introscreen = new Introscreen();
            Greenfoot.setWorld(introscreen);
        }
    }
}
