import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NormalAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NormalAttack extends Actor
{
    public NormalAttack(GreenfootImage image, int x)
    {
        setImage(image);
        setRotation(x);
    }
    
    
    public void act()
    {
        move(4);
    }
    
    
}
