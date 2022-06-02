import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackgroundInfo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundInfo2 extends Actor
{
    /**
     * Act - do whatever the BackgroundInfo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        IntroScreen ii = (IntroScreen) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            ii.removeObject(this);
            PlayerThirdLine playerThirdLine = new PlayerThirdLine();
            ii.addObject(playerThirdLine, 500, 400);
        }
    }
}
