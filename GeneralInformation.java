import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GeneralInformation here.
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class GeneralInformation extends Actor
{
    
    public static String[] character = new String[2];
    public int c = 1;
    public static boolean click;
    public static boolean pressSpace;
    
    public GeneralInformation()
    {
        setImage(new GreenfootImage("toMap1.png"));
    }
    
    /**
     * Act - do whatever the GeneralInformation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        click = Greenfoot.mouseClicked(this);
        pressSpace = Greenfoot.isKeyDown("space");
    }
}
