import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introii here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerFirstLine extends Actor
{
    /**
     * Act - do whatever the Introii wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        IntroScreen i = (IntroScreen) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            i.removeObject(this);
            BackgroundInfo backgroundInfo = new BackgroundInfo();
            i.addObject(backgroundInfo, 400, 350);
        }
    }
}
