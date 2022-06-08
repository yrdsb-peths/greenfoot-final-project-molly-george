import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MapThirdLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MapThirdLevel extends World
{
    ToFirstBattle firstBattle = new ToFirstBattle();
    
    public MapThirdLevel()
    {    
        super(1280, 720, 1); 
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
