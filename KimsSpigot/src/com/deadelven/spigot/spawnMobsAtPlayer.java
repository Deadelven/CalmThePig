package com.deadelven.spigot;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class spawnMobsAtPlayer implements CommandExecutor
{
	Player player = null;
	World w = null;
	Location loc = null;
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		//Get player Data including location and world and spawn skeleton at player
		player = (Player) sender;
		w = player.getWorld();
		loc = player.getLocation();
		w.spawnEntity(loc, EntityType.SKELETON);
		
		return false;
	}



}
