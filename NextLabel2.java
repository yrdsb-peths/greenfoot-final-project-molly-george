import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLabel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLabel2 extends Actor
{
    /**
     * Act - do whatever the NextLabel2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            IntroScreen introScreen = new IntroScreen();
            Greenfoot.setWorld(introScreen);
        }
    }
}
