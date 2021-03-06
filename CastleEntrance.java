import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class acts as a trigger for entering the Castle
 * 
 * @author (Benjamin Presley) 
 * @version (04/30/18)
 */
public class CastleEntrance extends Entrances
{
     public CastleEntrance()
    {
         GreenfootImage g = new GreenfootImage("world/Barrier2.png"); 
         g.scale(g.getWidth() + 10, g.getHeight() + 10);
         setImage(g); 
    }
    /**
     * Act - do whatever the Barrier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
