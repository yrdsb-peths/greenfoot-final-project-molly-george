import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the second normal attack class for the player
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class NormalAttack1 extends Damage
{
    public int damage2;
    
    
    public NormalAttack1(GreenfootImage image, int damage)
    {
        setImage(image);
        damage2 = damage;
        //Check the player's direction
        if(Battle.right1 == true)
        {
            setRotation(0);
        }
        if(Battle.left1 == true)
        {
            setRotation(180);
        }
        if(Battle.up1 == true)
        {
            setRotation(270);
        }
        if(Battle.down1 == true)
        {
            setRotation(90);
        }
        if(Battle.up1 && Battle.left1)
        {
            setRotation(225);
        }
        if(Battle.down1 && Battle.left1)
        {
            setRotation(135);
        }
        if(Battle.down1 && Battle.right1)
        {
            setRotation(45);
        }
        if(Battle.up1 && Battle.right1)
        {
            setRotation(315);
        }
        
    }
    
    
    public void act()
    {
        move(4);
        damage();
        if(isTouching(EeveeAttack.class))
        {
            removeTouching(EeveeAttack.class);
        }
        if(isTouching(RowletAttack.class))
        {
            removeTouching(RowletAttack.class);
        }
        
    }
    
    public void damage()
    {
        if(isTouching(Eevee.class))
        {
            Eevee.eHP -= damage2;
        }
        if(isTouching(Fennekin.class))
        {
            Fennekin.fHP -= damage2;
        }
        if(isTouching(Ninetales.class))
        {
            Ninetales.nHP -= damage2;
        }
        if(isTouching(Rowlet.class))
        {
            Rowlet.rHP -= damage2;
        }
        if(isTouching(Bulbasaur.class) && Bulbasaur.enemy == true)
        {
            Bulbasaur.bHP -= damage2;
        }
        if(isTouching(Torchic.class) && Torchic.enemy == true)
        {
            Torchic.tHP -= damage2;
        }
    }
}
