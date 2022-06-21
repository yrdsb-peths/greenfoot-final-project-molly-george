import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the class for normal enemy attack
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
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
            Pikachu.pHP -= 5;
        }
        if(isTouching(Charmander.class))
        {
            Charmander.cHP -= 5;
        }
        if(Torchic.enemy != true && isTouching(Torchic.class))
        {
            Torchic.tHP -= 5;
        }
        if(Bulbasaur.enemy != true && isTouching(Bulbasaur.class))
        {
            Bulbasaur.bHP -= 5;
        }
    }
}
