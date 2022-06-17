import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Charmander here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Charmander extends Characters
{
    public int CharmanderX;
    public int CharmanderY;
    public static int cHP = 65;
    public static int damage = 4;
    public static int speed = 4;
    
    public Charmander()
    {
        cHP = 65;
        setImage(new GreenfootImage("Charmander.png"));
    }
    
    public void act()
    {
        int CharmanderX = getX();
        int CharmanderY = getY();
        movementB(CharmanderX,CharmanderY, speed);
        removeTouching(EnemyAttack.class);
        if(isTouching(EeveeAttack.class))
        {
            Charmander.cHP -= 6;
        }
        if(isTouching(RowletAttack.class))
        {
            speed = 0;
        }
        else
        {
            speed = 4;
        }
        removeTouching(EeveeAttack.class);
        removeTouching(BulbasaurAttack.class);
    }
    
    
}
