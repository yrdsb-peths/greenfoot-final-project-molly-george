import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class of the first map, player use this map to select the level they go to
 * 
 * @George Lu && Molly Wu 
 * @version June 2022
 */
public class Map1 extends World
{
    BulbLogo b = new BulbLogo();
    Arrow a =  new Arrow();
    
    public Map1()
    {    
        // Create a new world with 900x506 cells with a cell size of 1x1 pixels.
        super(900, 506, 1); 
        setBackground("pokemon map 1.jpg");
        
        addObject(b, 180, 270);
        addObject(a, 180, 170);
        
    }

    
    public void act()
    {
        if(Greenfoot.mouseClicked(b))
        {
            Store1 store = new Store1();
            Greenfoot.setWorld(store);
        }
    }
}
