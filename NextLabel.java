import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The first class for next label
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class NextLabel extends NewLabelClass
{
    public NextLabel()
    {
        setImage(new GreenfootImage("Next.png"));
    }
    
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Transition2 transition2 = new Transition2();
            Greenfoot.setWorld(transition2);
        }
    }
}
