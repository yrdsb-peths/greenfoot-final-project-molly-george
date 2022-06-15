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
    Eevee e = new Eevee();
    UpGrade u1 = new UpGrade();
    UpGrade u2 = new UpGrade();
    UpGrade u3 = new UpGrade();
    UpGrade u4 = new UpGrade();
    ToMap t = new ToMap();

    Label toSecondLevel = new Label("click here go to second level",30);

    public Store2()
    {    
        super(1280, 720, 1); 

        addObject(p,330,200);

        addObject(c,600,200);

        addObject(b,890,200);

        addObject(e,330,490);

        addObject(u1,330,320);

        addObject(u2,600,320);

        addObject(u3,890,320);

        addObject(u4,330,610);

        addObject(t, 1170, 675);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(p))
        {
            GeneralInformation.character[0] = "Pikachu";
        }
        if(Greenfoot.mouseClicked(b))
        {
            GeneralInformation.character[0] = "Bulbasaur";
        }
        if(Greenfoot.mouseClicked(c))
        {
            GeneralInformation.character[1] = "Charmander";
        }
        if(Greenfoot.mouseClicked(e))
        {
            GeneralInformation.character[1] = "Eevee";
        }
        //slect more than two will overwrite the second one

        if(t.click == true)
        {
            SecondLevel s = new SecondLevel();
            Greenfoot.setWorld(s);
        }
    }

    
    
}
