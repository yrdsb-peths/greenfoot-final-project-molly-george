import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackgroundInfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundInfo extends Actor
{
    /**
     * Act - do whatever the BackgroundInfo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        IntroScreen ii = (IntroScreen) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            ii.removeObject(this);
            PlayerSecondLine playerSecondLine = new PlayerSecondLine();
            ii.addObject(playerSecondLine, 200, 450);
        }
    }
}
