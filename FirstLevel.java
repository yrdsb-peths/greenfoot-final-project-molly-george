import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the actual first level that the player battles in.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstLevel extends World
{
    public int pikachuX = 650;
    public int pikachuY = 650;
    public int pikachuHP = 40;
    public int enemy1HP = 60;
    public int enemy2HP = 60;
    public int enemy3HP = 60;
    public Label nextMap = new Label("you passed this level, now click me get to the store!", 50); 

    /**
     * Constructor for objects of class FirstLevel.
     * 
     */
    public FirstLevel()
    {    
        super(1280, 720, 1); 
        
        
        Pikachu pikachu = new Pikachu();
        addObject(pikachu, pikachuX, pikachuY);
    }
    
    public void act()
    {
        if(pikachuHP == 0)
        {
            //connect back to another world
        }
        if(enemy1HP == 0)
        {
            //send out the point to next map
            
        }
        if(enemy1HP == 0 && enemy2HP == 0)
        {
              //send out point to next map  
        }
        if(enemy1HP == 0 && enemy2HP == 0 && enemy3HP == 0)
        {
              //send out you win  and click to move to store
        }  
        
    }
}
