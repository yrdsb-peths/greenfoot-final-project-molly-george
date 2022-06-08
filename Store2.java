import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Store2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store2 extends World
{
    Label select = new Label("This two Pokemons will be the Pokemons you start with!",50);
    Label money = new Label("Now you have 50 coins to ",50);
    Bulbasaur b = new Bulbasaur();
    Pikachu p = new Pikachu();
    Charmander c = new Charmander();
    UpGradeSecond1 s1 = new UpGradeSecond1();
    UpGradeSecond2 s2 = new UpGradeSecond2();
    UpGradeSecond3 s3 = new UpGradeSecond3();
    Label toSecondLevel = new Label("click here go to second level",30);
    
    public Store2()
    {    
        super(1280, 720, 1); 
        
        
        
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
        if(Greenfoot.mouseClicked(toSecondLevel))
        {
            SecondLevel s = new SecondLevel();
            Greenfoot.setWorld(s);
        }
    }
    
    
    
    
}
