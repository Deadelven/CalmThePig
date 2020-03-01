package com.deadelven.spigot;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class spawnPig implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		//pig hasSaddle = True, spawn at playe location, 
		Player player = (Player) sender;
		World w = player.getWorld();
		Location loc = player.getLocation();
		Pig pig = (Pig)w.spawnEntity(loc, EntityType.PIG);
		pig.setSaddle(true);
		//w.spawnCreature(loc,pig)
		
		ItemStack carrotOnAStick = new ItemStack(Material.CARROT_ON_A_STICK);
		player.getInventory().addItem(carrotOnAStick);
		return false;
	}

}
