import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Cow walks around just doing their own thing.
 * 
 * @author Anthony Neeser 
 * @version 5/7/18
 */
public class Cow extends Animals
{
    //Set image change delay to pass to FriendlyNPC.
    private int imgChangeDelay = 15;

    //Set step delay (Higher means a slower walk speed in world).
    private int stepDelay = 2;

    //Set direction change delay
    private int dirSwitch = 200;

    //Set range in which NPC notices main character
    private int mcRange = 200;
    private int mcTouching = 64;

    //Shadow specifications
    private int shadowImageWidth = 64*2;
    private int shadowImageHeight = 128*2;
    private int shadowX = 17*3-7;
    private int shadowY = 82*2-28;
    private int shadowWidth = 40;
    private int shadowHeight = 25;

    //Set if enemy will shoot, what ammo to use, speed of the ammo, and how often to reload.  
    private String classType = "archer"; //"archer", "spearman", "melee"
    private String projectile = "arrow"; // "arrow", "spear"
    private int projectileWidth = 18;
    private int projectileHeight = 7;
    private int shotSpeed = 10;
    private int removalCount = 25;
    private int reloadDelay = Greenfoot.getRandomNumber(100)+100; //Adds delay to reload so that each enemy is different.

    //Angry?
    public boolean angry = false;

    public Cow()
    {
        //Cow
        setImage("/char/Cow/Cow_Front.png");
    }

    /**
     * Act - do whatever the Villager1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        variablePass("/char/Cow/Cow_", imgChangeDelay, shadowImageWidth, shadowImageHeight, shadowX, shadowY, shadowWidth, shadowHeight, 
            stepDelay, dirSwitch, mcRange, angry, classType, projectile, projectileWidth, projectileHeight, shotSpeed, removalCount, reloadDelay);
    }    
}