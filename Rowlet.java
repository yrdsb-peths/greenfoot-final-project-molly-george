import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class for Rowlet, contain all the information needed
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class Rowlet extends Characters
{
    public static int rowletX;
    public static int rowletY;
    public static int rHP = 60;
    GreenfootSound ds = new GreenfootSound("damage.wav");
    
    public Rowlet()
    {
        rHP = 60;
        setImage(new GreenfootImage("Rowlet.png"));
    }
    
    //This act method let Rowlet do what a enemy should do, like get damage when the player attack
    public void act()
    {
        rowletX = getX();
        rowletY = getY();
        
        if(isTouching(NormalAttack.class))
        {
            ds.play();
            removeTouching(NormalAttack.class);
        }
        if(isTouching(NormalAttack1.class))
        {
            ds.play();
            removeTouching(NormalAttack1.class);
        }

    }
    
    
    
}
