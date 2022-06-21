import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class for Ninetales to attack
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class NinetalesAttack extends Damage
{
    public NinetalesAttack()
    {
        setImage(new GreenfootImage("fireball.png"));
        
    }
    
    public void act()
    {
        move(4);
        
    }
}
