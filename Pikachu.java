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
                move(-4);
                f.pikachuX -= 4;
                setRotation(180);

            }
        
            if(Greenfoot.isKeyDown("d"))
            {
                move(4);
                f.pikachuX += 4;
                setRotation(0);
                
            }
        
            if(Greenfoot.isKeyDown("w"))
            {
                setLocation((int)f.pikachuX, (int)(f.pikachuY -= 4));
                setRotation(90);
                
            }
            
            if(Greenfoot.isKeyDown("s"))
            {
                setLocation((int)f.pikachuX, (int)(f.pikachuY += 4));
                setRotation(270);
                
            }
        }
    }
    
}
