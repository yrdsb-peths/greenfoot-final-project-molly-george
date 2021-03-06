import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * a label to start a new level of game on transition screen
 * 
 *  @author George Lu && Molly Wu 
 * @version June 2022
 */
public class TransitionStartLabel extends Actor
{
    public static boolean clicki;
    
    public TransitionStartLabel()
    {
        setImage(new GreenfootImage("startlabel.png"));
    }
    
    /**
     * Act - do whatever the TransitionStartLabel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        clicki = Greenfoot.mouseClicked(this);
    }
}
