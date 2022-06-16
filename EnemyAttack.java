import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyAttack extends Damage
{
    /**
     * Act - do whatever the EnemyAttack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public EnemyAttack(GreenfootImage image)
    {
        setImage(image);
    }
    
    public void act()
    {
        move(6);
        damage();
    }
    
    public void damage()
    {
        if(isTouching(Pikachu.class))
        {
            Pikachu.pHP -= 4;
        }
        if(isTouching(Charmander.class))
        {
            Charmander.cHP -= 4;
        }
        if(Torchic.enemy != true && isTouching(Torchic.class))
        {
            Torchic.tHP -= 4;
        }
        if(Bulbasaur.enemy != true && isTouching(Bulbasaur.class))
        {
            Bulbasaur.bHP -= 4;
        }
    }
}
