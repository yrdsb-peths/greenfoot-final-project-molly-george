import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class for Fennekin, contain all the information needed for Fennekin
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class Fennekin extends Characters
{
    public static int fennekinX;
    public static int fennekinY;
    public static int fHP = 45;
    GreenfootSound ds = new GreenfootSound("damage.wav");
    
    public Fennekin()
    {
        fHP = 90;
        setImage(new GreenfootImage("Fennekin.png"));
    }
    
    //This act method let Fennekin do what a enemy should do, like getting hurt from player's attack
    public void act()
    {
        fennekinX = getX();
        fennekinY = getY();
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
