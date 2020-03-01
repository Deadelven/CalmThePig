package com.deadelven.spigot;

import org.bukkit.Bukkit;

public class extraStats
{
	//Calmness stat
	public int calmness = 100;

	//Getter and Setter values, Minimised to clean the look. also Values are unlikely to change.
	public void setCalmness(int value) {calmness = value;Bukkit.broadcastMessage("Calmness Set to : " +calmness);}

	public int getCalmness() {return calmness;}
	

}
