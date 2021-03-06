import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The third class for next label
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class NextLabel3 extends NewLabelClass
{
    public NextLabel3()
    {
        setImage(new GreenfootImage("Next.png"));
    }
    
    /**
     * Act - do whatever the NextLabel3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Map1 map1 = new Map1();
            Greenfoot.setWorld(map1);
        }
    }
}
