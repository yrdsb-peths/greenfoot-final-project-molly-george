import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroLine extends Actor
{
    /**
     * Act - do whatever the Introi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        IntroScreen is = (IntroScreen) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            is.removeObject(this);
            IntroLine introii = new IntroLine();
            is.addObject(introii, 70, 600);
        }
    }
}
