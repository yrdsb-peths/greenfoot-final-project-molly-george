import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bulbasaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bulbasaur extends Characters
{
    public int BulbasaurX;
    public int BulbasaurY;
    public static int bHP = 50;
    public static boolean enemy = true;
    
    public Bulbasaur()
    {
        bHP = 50;
    }
    
    public void act()
    {
        int BulbasaurX = getX();
        int BulbasaurY = getY();
        movementA(BulbasaurX, BulbasaurY);
    }
    
    
    
    public void movement()
    {
        
        if(isTouching(Forest.class))
        {
                
        }
        else if(!isTouching(Forest.class))
        {
            if(Greenfoot.isKeyDown("a"))
            {
                setRotation(270);
                setLocation(BulbasaurX -= 4, BulbasaurY);
            }
            
            if(Greenfoot.isKeyDown("d"))
            {
                setRotation(90);
                setLocation(BulbasaurX += 4, BulbasaurY);    
                    
            }
            
            if(Greenfoot.isKeyDown("w"))
            {
                setRotation(0);
                setLocation(BulbasaurX , BulbasaurY -= 4);
                    
            }
                
            if(Greenfoot.isKeyDown("s"))
            {
                setRotation(180);
                setLocation(BulbasaurX , BulbasaurY += 4);
                    
            }
        
        
        }   
        
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("w"))
        {
            setRotation(-45);
        }
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("s"))
        {
            setRotation(-135);
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("w"))
        {
            setRotation(45);
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("s"))
        {
            setRotation(135);
        }
    
    }
}
