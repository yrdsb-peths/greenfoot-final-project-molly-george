import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartLabel here.
 * 
 * @author Molly Wu 
 * @version May 2022
 */
public class StartLabel extends Actor
{
    /**
     * Act - do whatever the StartLabel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * when the player clicks start, the title screen will transfer to the intro screen
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Transition transition = new Transition();
            Greenfoot.setWorld(transition);
        }
    }
}
