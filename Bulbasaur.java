import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulbasaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulbasaur extends Characters
{
    public static int bulbasaurX;
    public static int bulbasaurY;
    public static int bHP = 50;
    public static boolean enemy = true;
    public static int damage = 4;
    public static int speed = 4;
    public static boolean live = true;
    
    public Bulbasaur()
    {
        bHP = 50;
        setImage(new GreenfootImage("bulbasaur.png"));
    }
    
    public void act()
    {
        int bulbasaurX = getX();
        int bulbasaurY = getY();
        
        if(enemy == true)
        {
            removeTouching(NormalAttack.class);
            movementC(bulbasaurX, bulbasaurY);
        }
        if(enemy != true)
        {
            if(live == true)
            {
                movementA(bulbasaurX, bulbasaurY, speed);
                removeTouching(EnemyAttack.class);
            }
            if(bHP <= 0)
            {
                live = false;
                bHP = 0;
            }
        }
        
        
    }
    
    
    
    

}
