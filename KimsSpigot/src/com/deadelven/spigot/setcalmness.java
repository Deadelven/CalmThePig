package com.deadelven.spigot;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class setcalmness implements CommandExecutor
{
	//Link to seperate Extra Stats class that contains Calmness value and getters/setters
	extraStats stats = main.getStatClass();
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		//command takes first argument and uses it to set calmness value  e.g (/setcalmness 100) will set calmness to 100
		stats.setCalmness(Integer.parseInt(args[0]));
		return false;
	}

	
	
}
