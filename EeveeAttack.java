import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class for the attack of Eevee
 * 
 * @author George Lu && Molly Wu 
 * @version June 2022
 */
public class EeveeAttack extends Damage
{
    private SimpleTimer timer = new SimpleTimer();
    
    public EeveeAttack(GreenfootImage image)
    {
        setImage(image);
    }
}
