import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ToMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToMap extends Actor
{
    /**
     * Act - do whatever the ToMap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            FirstLevel firstLevel = new FirstLevel();
            Greenfoot.setWorld(firstLevel);
        }
    }
}
