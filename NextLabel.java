import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLabel extends Actor
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
