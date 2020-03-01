package com.deadelven.spigot;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener{
	
	static extraStats stats = new extraStats();
	 // Fired when plugin is first enabled
    @Override
    public void onEnable() 
    {
    	//Spawn pig with saddle and give player carrot on a stick
    	this.getCommand("spawnPig").setExecutor(new spawnPig());
    	
    	//Set a timer to spawn a mob every 30 seconds at the player
    	this.getCommand("SpawnMobs").setExecutor(new spawnMobsAtPlayer());
    	
    	//Allows user to set calmness value
    	this.getCommand("setCalmness").setExecutor(new setcalmness());
    	
    	//Event listener. on player attacked, removes calmness. also prevents actual damage dealing.
    	Bukkit.getPluginManager().registerEvents(this, this);
    	
    	
    }
    

	@Override
    public void onDisable() {}
    
    //Connects to extra Stats class allowing modification of Calmness values
    public static extraStats getStatClass()
    {
		return stats;
    }
    
    //Handles On-Hit event. making damage to player reduce calmness value instead of health Reduces calmness by 10 for each hit.
	@EventHandler
    public void onHit(EntityDamageEvent event)
	{
        if (event.getEntity() instanceof Player)
        {
            event.setCancelled(true);
            stats.setCalmness(stats.calmness - 10);
            System.out.println(stats.calmness);
            Bukkit.broadcastMessage("Calmness: " + stats.getCalmness());
        }
    }
    
	
	
}
