import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLabel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLabel2 extends NewLabelClass
{
    
    public NextLabel2()
    {
        setImage(new GreenfootImage("Next.png"));
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            IntroScreen introScreen = new IntroScreen();
            Greenfoot.setWorld(introScreen);
        }
    }
}
