import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The start up button
 * 
 * @author Molly Wu 
 * @version May 2022
 */
public class StartLabel extends NewLabelClass
{
    
    public StartLabel()
    {
        setImage(new GreenfootImage("My First Board (2).jpg"));
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Transition transition = new Transition();
            Greenfoot.setWorld(transition);
        }
    }
}
