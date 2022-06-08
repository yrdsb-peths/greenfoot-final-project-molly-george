import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Store3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store3 extends World
{
    private Squirtle s = new Squirtle();
    private Lapras l = new Lapras();
    private Bulbasaur b = new Bulbasaur();
    private Pikachu p = new Pikachu();
    private Charmander c = new Charmander();
    private UpGradeThird1 t1 = new UpGradeThird1();
    private UpGradeThird2 t2 = new UpGradeThird2();
    private Label toThirdLevel = new Label("click here go to Third level",30);
    
    public Store3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
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
        if(Greenfoot.mouseClicked(t1))
        {
            //enhance 
        }
        if(Greenfoot.mouseClicked(t2))
        {
            //enhance 
        }
        if(Greenfoot.mouseClicked(toThirdLevel))
        {
            ThirdLevel t = new ThirdLevel();
            Greenfoot.setWorld(t);
        }
    }
}
