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
    private SimpleTimer timer = new SimpleTimer();
    
    public Pikachu()
    {
        int PikachuHP = 65;
    }
    
    
    public void act()
    {
        pikachuX = getX();
        pikachuY = getY();
        movementA(pikachuX, pikachuY);
        removeTouching(EnemyAttack.class);
    }
    
    
    
    
    
}
