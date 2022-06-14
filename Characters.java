import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Characters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Characters extends Actor
{
    
    
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void movementA(int x, int y)
    {
        
        if(isTouching(Forest.class))
        {
                
        }
        else if(!isTouching(Forest.class))
        {
            if(Greenfoot.isKeyDown("a"))
            {
                setRotation(270);
                setLocation(x -= 4, y);
            }
            
            if(Greenfoot.isKeyDown("d"))
            {
                setRotation(90);
                setLocation(x += 4, y);    
                    
            }
            
            if(Greenfoot.isKeyDown("w"))
            {
                setRotation(0);
                setLocation(x , y -= 4);
                    
            }
                
            if(Greenfoot.isKeyDown("s"))
            {
                setRotation(180);
                setLocation(x , y += 4);
                    
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
    
    public void movementB(int x, int y)
    {
        
        if(isTouching(Forest.class))
        {
                
        }
        else if(!isTouching(Forest.class))
        {
            if(Greenfoot.isKeyDown("left"))
            {
                setRotation(270);
                setLocation(x -= 4, y);
            }
            
            if(Greenfoot.isKeyDown("right"))
            {
                setRotation(90);
                setLocation(x += 4, y);    
                    
            }
            
            if(Greenfoot.isKeyDown("up"))
            {
                setRotation(0);
                setLocation(x , y -= 4);
                    
            }
                
            if(Greenfoot.isKeyDown("down"))
            {
                setRotation(180);
                setLocation(x , y += 4);
                    
            }
        
        
        }   
        
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("up"))
        {
            setRotation(-45);
        }
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("down"))
        {
            setRotation(-135);
        }
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("up"))
        {
            setRotation(45);
        }
        if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("down"))
        {
            setRotation(135);
        }
    
    }
    
    
}
