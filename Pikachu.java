import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Characters
{
    public int pikachuX;
    public int pikachuY;
    public int pHP = 65;
    
    public Pikachu()
    {
        int PikachuHP = 65;
    }
    
    
    public void act()
    {
        pikachuX = getX();
        pikachuY = getY();
        movementA(pikachuX, pikachuY);
        
    }
    
    
    
    
    
    
    
    public void lightning()
    {
        if(isTouching(Rowlet.class))
        {
            
        }
    }
    
}
