import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EeveeAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EeveeAttack extends Damage
{
    private SimpleTimer timer = new SimpleTimer();
    
    public EeveeAttack(GreenfootImage image)
    {
        setImage(image);
    }
    
    
    public void act()
    {
        if(isTouching(Pikachu.class))
        {
            Pikachu.pHP -= 6;
            
        }
        if(isTouching(Charmander.class))
        {
            //Charmander.cHP -= 6;
        }
        if(isTouching(Bulbasaur.class) && Bulbasaur.enemy != true)
        {
            Bulbasaur.bHP -= 6;
        }
        if(isTouching(Torchic.class) && Torchic.enemy != true)
        {
            Torchic.tHP -= 6;
        }
    }
}
