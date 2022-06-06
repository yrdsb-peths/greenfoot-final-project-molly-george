import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Actor
{
    
    private double angle;
    private int angleInt;
    
    
    public Pikachu()
    {
        setImage(new GreenfootImage("arrow.png"));
        
    
    }
    
    
    public void act()
    {
        movement();
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
    
    
    
    public void movement()
    {
        FirstLevel f = (FirstLevel)getWorld();
        
        
        if(isTouching(Forest.class))
        {
            
        }
        else if(!isTouching(Forest.class))
        {
            if(Greenfoot.isKeyDown("a"))
            {
                setRotation(270);
                setLocation(f.pikachuX -= 4, f.pikachuY );
            }
        
            if(Greenfoot.isKeyDown("d"))
            {
                setRotation(90);
                setLocation(f.pikachuX += 4, f.pikachuY );
                
                
            }
        
            if(Greenfoot.isKeyDown("w"))
            {
                setRotation(0);
                setLocation(f.pikachuX, f.pikachuY -=4);
                
            }
            
            if(Greenfoot.isKeyDown("s"))
            {
                setRotation(180);
                setLocation(f.pikachuX , f.pikachuY += 4);
                
            }
        }
    }
    
}
