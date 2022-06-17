import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Characters
{
    public static int pikachuX;
    public static int pikachuY;
    public static int pHP = 65;
    public static int damage = 4;
    public static int speed = 4;
    private SimpleTimer timer = new SimpleTimer();
    
    public Pikachu()
    {
        int PikachuHP = 65;
    }
    
    
    public void act()
    {
        pikachuX = getX();
        pikachuY = getY();
        movementA(pikachuX, pikachuY, speed);
        removeTouching(EnemyAttack.class);
        if(isTouching(EeveeAttack.class))
        {
            Pikachu.pHP -= 6;
        }
        removeTouching(EeveeAttack.class);
        if(isTouching(RowletAttack.class))
        {
            speed = 0;
        }
        else
        {
            speed = 4;
        }
        removeTouching(BulbasaurAttack.class);
        removeTouching(FennekinAttack.class);
    }
    
    
    
    
    
}
