import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class for Ninetales, contain all the information needed for Ninetales
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class Ninetales extends Characters
{
    public static int ninetalesX;
    public static int ninetalesY;
    public static int nHP = 200;
    GreenfootSound ds = new GreenfootSound("damage.wav");
    
    public Ninetales()
    {
        nHP = 200;
        setImage(new GreenfootImage("Ninetales.png"));
    }
    
    //This class let ninetales do what enemy should do, like get damage when player attacks it
    public void act()
    {
        int NinetalesX = getX();
        int NinetalesY = getY();
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
