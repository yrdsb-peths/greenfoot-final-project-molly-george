import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The second class for next label
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
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
