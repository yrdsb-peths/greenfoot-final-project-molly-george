import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Torchic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Torchic extends Characters
{
    public int TorchicX;
    public int TorchicY;
    public static int tHP = 45;
    public static boolean enemy = true;
    public static int damage = 4;
    
    public Torchic()
    {
        tHP = 45;
    }
    
    
    public void act()
    {
        int TorchicX = getX();
        int TorchicY = getY();
        if(enemy == true)
        {
            removeTouching(NormalAttack.class);
        }
        if(enemy != true)
        {
            movementB(TorchicX, TorchicY);
            removeTouching(EnemyAttack.class);
            
        }
    }
    
    public void movement()
    {
        
        
    
    }
}
