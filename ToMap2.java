import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class for the second to map button
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class ToMap2 extends NewLabelClass
{
    
    public static boolean click;
    
    public ToMap2()
    {
        setImage(new GreenfootImage("Tomap2.png"));
    }
    
    public void act()
    {
        click = Greenfoot.mouseClicked(this);
    }
}
