import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerSecondLine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerSecondLine extends Actor
{
    /**
     * Act - do whatever the PlayerSecondLine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        IntroScreen in = (IntroScreen) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            in.removeObject(this);
            BackgroundInfo2 backgroundInfo2 = new BackgroundInfo2();
            in.addObject(backgroundInfo2, 300, 80);
        }
    }
}
