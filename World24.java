import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * This world is one of many in this game.
 * 
 * @author (Ben Presley), Anthony Neeser
 * @version (5/8/2018)
 */
public class World24 extends World
{
    private boolean angry;
    private int bX;
    private int bY;
    public static int archerCount = 2;
    public static int spearmanCount = 2;
    public static int blackKnightCount = 0;
    public static int fighterCount = 0;
    /**
     * Constructor for objects of class World24.
     * 
     */
    public World24()
    {    
        super(1080, 920, 1); 
        
        //IDs of surrounding Worlds
        MainWorld.topWorldID = 19;
        MainWorld.leftWorldID = 23;
        MainWorld.rightWorldID = 25;
        MainWorld.bottomWorldID = 99;
        prepare();
        setup();
        spawnPlayer();
        setPaintOrder(/*Barrier.class,*/ InstructionParts.class, Icons.class, DialogParts.class, MusicButton.class, Treetop.class, Player.class, 
            JimboSubSystem.class, MattsSubSystem.class, Loot.class, Treebase.class, Shadow.class, BG.class, Barrier.class, ShopDoorExit.class);
    }
    
    /**
     * Controls the spawning position of player when transfering worlds.
     */
    public void spawnPlayer()
    {
        if (MainWorld.spawn == 24)
        {
            Player hawthorne = new Player();
            addObject(hawthorne, MainWorld.playerX,MainWorld.playerY);
        }
        MainWorld.state = 1;
    }
    
    /**
     * Upon starting the game, or if Player dies, this handles resetting the world to the starting zone. States are also set to initial values.
     */
    public void reset()
    {
        if(MainWorld.start == 0)
        {
            Greenfoot.setWorld(new World6());
        }
    }
    
    /**
     * Monitor world state.
     */
    public void act()
    {
        reset();
        archerCount = getObjects(Archer.class).size();
        spearmanCount = getObjects(Spearman.class).size();
        blackKnightCount = getObjects(BlackKnight.class).size();
        fighterCount = getObjects(Fighter.class).size();
    }
    
    /**
     * Setup handles enemy generation away from barriers.
     * @author Anthony Neeser
     */
    private void setup()
    {
        List<Barrier> barriers = getObjects(Barrier.class);
        for(Barrier boundary : barriers)
        {
            bX = boundary.getX();
            bY = boundary.getY();
        }
        int a = 0;
        while(a < archerCount)
        {
            if(getObjectsAt(bX, bY, Barrier.class) != null)
            {
                if(Greenfoot.getRandomNumber(6) <= 2)
                {
                    angry = true;
                }
                int x = Greenfoot.getRandomNumber(450);
                int y = Greenfoot.getRandomNumber(450);
                addObject(new Archer(angry), x, y);
                a++;
            }
        }
        int b = 0;
        while(b < spearmanCount)
        {
            if(getObjectsAt(bX, bY, Barrier.class) != null)
            {
                if(Greenfoot.getRandomNumber(6) <= 2)
                {
                    angry = true;
                }
                int x = Greenfoot.getRandomNumber(450);
                int y = Greenfoot.getRandomNumber(450);
                addObject(new Spearman(angry), x, y);
                b++;
            }
        }
        int c = 0;
        while(c < blackKnightCount)
        {
            if(getObjectsAt(bX, bY, Barrier.class) != null)
            {
                if(Greenfoot.getRandomNumber(6) <= 2)
                {
                    angry = true;
                }
                int x = Greenfoot.getRandomNumber(450);
                int y = Greenfoot.getRandomNumber(450);
                addObject(new BlackKnight(angry), x, y);
                c++;
            }
        }
        int d = 0;
        while(d < fighterCount)
        {
            if(getObjectsAt(bX, bY, Barrier.class) != null)
            {
                if(Greenfoot.getRandomNumber(6) <= 2)
                {
                    angry = true;
                }
                int x = Greenfoot.getRandomNumber(450);
                int y = Greenfoot.getRandomNumber(450);
                addObject(new Fighter(angry), x, y);
                d++;
            }
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TemplateBG templatebg2 = new TemplateBG();
        addObject(templatebg2,531,444);
        templatebg2.setLocation(541,461);
    }
}
