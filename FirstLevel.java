import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the actual first level that the player battles in.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends World
{
    
    public Label nextMap = new Label("you passed this level, now click me get to the store!", 50); 

    /**
     * Constructor for objects of class FirstLevel.
     * 
     */
    public FirstLevel()
    {    
        super(1280, 720, 1); 
        
        Pikachu p = new Pikachu();
        addObject(p, 650, 650);
        
        Charmander c = new Charmander();
        addObject(c, 650, 650);
        
        Bulbasaur b = new Bulbasaur();
        addObject(b, 650, 650);
        
        Rowlet r = new Rowlet();
        addObject(r, 650, 650);
        
        Eevee e = new Eevee();
        addObject(e, 650, 650);
        
    }
    
    public void act()
    {
        
    }  
    
    public void changeBackground()
    {
        
    }
    
}
