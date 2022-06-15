import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack1 extends Characters
{
    /**
     * Act - do whatever the Attack1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(isTouching(Torchic.class))
        {
            Torchic.tHP -= 4;
        }
        if(isTouching(Fennekin.class))
        {
            Fennekin.fHP -= 4;
        }
        if(isTouching(Lapras.class))
        {
            Lapras.lHP -= 4;
        }
        if(isTouching(Magikarp.class))
        {
            Magikarp.mHP -= 4;
        }
        if(isTouching(Rowlet.class))
        {
            Rowlet.rHP -= 4;
        }
        if(Bulbasaur.enemy == true && isTouching(Bulbasaur.class))
        {
            Bulbasaur.bHP -= 4;
        }
        if(Eevee.enemy == true && isTouching(Eevee.class))
        {
            Eevee.eHP -= 4;
        }
        if(Ninetales.enemy == true && isTouching(Ninetales.class))
        {
            Ninetales.nHP -= 4;
        }
        if(Rowlet.enemy == true && isTouching(Rowlet.class))
        {
            Rowlet.rHP -= 4;
        }
        
        move(4);
    }
}
