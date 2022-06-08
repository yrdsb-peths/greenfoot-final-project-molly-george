import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalStore extends World
{
    private Squirtle s = new Squirtle();
    private Lapras l = new Lapras();
    private Bulbasaur b = new Bulbasaur();
    private Pikachu p = new Pikachu();
    private Charmander c = new Charmander();
    private Ninetales n = new Ninetales();
    private UpGradeThird1 t1 = new UpGradeThird1();
    private UpGradeThird2 t2 = new UpGradeThird2();
    private UpGradeSecond1 s1 = new UpGradeSecond1();
    private UpGradeSecond2 s2 = new UpGradeSecond2();
    private UpGradeSecond3 s3 = new UpGradeSecond3();
    private UpGradeFinal f = new UpGradeFinal();
    private Label tofinalLevel = new Label("click here go to final level",30);
    
    public FinalStore()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        
        if(Greenfoot.mouseClicked(b))
        {
            GeneralInformation.character[0] = "Pikachu";
        }
        if(Greenfoot.mouseClicked(p))
        {
            GeneralInformation.character[1] = "Bulbasaur";
        }
        if(Greenfoot.mouseClicked(c))
        {
            GeneralInformation.character[1] = "Charmander";
        }
        //slect more than two will overwrite the second one
        if(Greenfoot.mouseClicked(l))
        {
            GeneralInformation.character[1] = "Lapras";
        }
        if(Greenfoot.mouseClicked(s))
        {
            GeneralInformation.character[1] = "Squirtle";
        }
        if(Greenfoot.mouseClicked(n))
        {
            GeneralInformation.character[1] = "Ninetales";
        }
        if(Greenfoot.mouseClicked(s1))
        {
            //enhance 
        }
        if(Greenfoot.mouseClicked(s2))
        {
            //enhance 
        }
        if(Greenfoot.mouseClicked(s3))
        {
            //enhance 
        }
        if(Greenfoot.mouseClicked(t1))
        {
            //enhance 
        }
        if(Greenfoot.mouseClicked(t2))
        {
            //enhance 
        }
        if(Greenfoot.mouseClicked(f))
        {
            //enhance 
        }
        if(Greenfoot.mouseClicked(tofinalLevel))
        {
            Boss b = new Boss();
            Greenfoot.setWorld(b);
        }
    }
}
