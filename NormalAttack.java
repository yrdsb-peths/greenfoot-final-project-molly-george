import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NormalAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NormalAttack extends Damage
{
    public int damage1;
    
    public NormalAttack(GreenfootImage image, int damage)
    {
        setImage(image);
        damage1 = damage;
    }
    
    
    public void act()
    {
        move(4);
        damage();
        if(isTouching(EeveeAttack.class))
        {
            removeTouching(EeveeAttack.class);
        }
    }
    
    public void damage()
    {
        
        if(isTouching(Eevee.class))
        {
            Eevee.eHP -= damage1;
        }
        if(isTouching(Fennekin.class))
        {
            Fennekin.fHP -= damage1;
        }
        if(isTouching(Ninetales.class))
        {
            Ninetales.nHP -= damage1;
        }
        if(isTouching(Rowlet.class))
        {
            Rowlet.rHP -= damage1;
        }
        if(isTouching(Bulbasaur.class) && Bulbasaur.enemy == true)
        {
            Bulbasaur.bHP -= damage1;
        }
        if(isTouching(Torchic.class) && Torchic.enemy == true)
        {
            Torchic.tHP -= damage1;
        }
    }
    
    
}
