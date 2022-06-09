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
    public int PikachuHP = 65;
    
    public Pikachu()
    {
        setImage(new GreenfootImage("arrow.png"));
        int PikachuHP = 65;
    }
    
    
    public void act()
    {
        pikachuX = getX();
        pikachuY = getY();
        movement();
        
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
                setLocation(pikachuX -= 4, pikachuY);
            }
            
            if(Greenfoot.isKeyDown("d"))
            {
                setRotation(90);
                setLocation(pikachuX += 4, pikachuY);    
                    
            }
            
            if(Greenfoot.isKeyDown("w"))
            {
                setRotation(0);
                setLocation(pikachuX , pikachuY -= 4);
                    
            }
                
            if(Greenfoot.isKeyDown("s"))
            {
                setRotation(180);
                setLocation(pikachuX , pikachuY += 4);
                    
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
    
    public void lightning()
    {
        if(isTouching(Rowlet.class))
        {
            
        }
    }
    
}
