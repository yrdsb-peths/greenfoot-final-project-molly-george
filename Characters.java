import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Characters here.
 * 
 * @author Molly Wu && George Lu 
 * @version June 2022
 */
public class Characters extends Actor
{
    public boolean touchLeft = false;
    public boolean touchRight = false;
    public boolean touchUp = false;
    public boolean touchDown = false;
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void movementA(int x, int y, int s)
    {
        
        if(isTouching(Blocker.class))
        {
            s = 1;
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(0);
            setLocation(x -= s, y);
        }
            
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            setLocation(x += s, y);    
                    
        }
            
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            setLocation(x , y -= s);
                    
        }
                
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            setLocation(x , y += s);
                
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("s"))
        {
            setRotation(45);
        }
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("s"))
        {
            setRotation(315);
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("w"))
        {
            setRotation(315);
        }
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("w"))
        {
            setRotation(45);
        }  
        
    }
    
    public void movementB(int x, int y, int s)
    {
        
        if(isTouching(Blocker.class))
        {
            s = 1;
            
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            setRotation(270);
            setLocation(x -= s, y);
        }
            
        if(Greenfoot.isKeyDown("right"))
        {
            setRotation(90);
            setLocation(x += s, y);    
                    
        }
            
        if(Greenfoot.isKeyDown("up"))
        {
            setRotation(0);
            setLocation(x , y -= s);
                    
        }
                
        if(Greenfoot.isKeyDown("down"))
        {
            setRotation(180);
            setLocation(x , y += s);
                    
        }
            
        
        
    } 

        
        
    

    
    public void movementC(int x, int y)
    {
        int randomX = (int)Math.random()*(2)+(-1);   
        int randomY = (int)Math.random()*(2)+(-1);  
        if( touchRight == false && touchLeft == false && touchUp == false && touchDown == false)
        {
            setLocation( randomX * 1 + x, randomY * 1 + y);
        }
        if( x >= 850 )
        {
             touchRight = true;
        }
        if( x <= 50)
        {
            touchLeft = true;
        }
        if( y >= 500)
        {
            touchDown = true;
        }
        if( y <= 100)
        {
            touchUp = true;
        }
        if(touchRight == true)
        {
            setLocation( x - 1, y);
            if( x <= 150)
            {
                touchRight = false;
            }
        }
        if(touchLeft == true)
        {
            setLocation( x + 1, y);
            if( x >= 750)
            {
                touchLeft = false;
            }
        }
        if(touchUp == true)
        {
            setLocation( x, y + 1);
            if( y >= 450)
            {
                touchUp = false;
            }
        }
        if(touchDown == true)
        {
            setLocation( x, y - 1);
            if( y <= 150)
            {
                touchDown = false;
            }
        }
    }
}
