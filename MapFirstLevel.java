import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This will be the place for the player to choose the level they go to, in
 * this case, it is the first level.
 * 
 * @George Lu && Molly Wu 
 * @version (a version number or a date)
 */
public class MapFirstLevel extends World
{
    ToFirstBattle firstBattle = new ToFirstBattle();
    
    public MapFirstLevel()
    {    
        super(1280, 720, 1); 
        setBackground("pokemon map 1.jpg");
        
        
        addObject(firstBattle, 250, 400);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(firstBattle))
        {
            Store1 store = new Store1();
            Greenfoot.setWorld(store);
        }
    }
}
