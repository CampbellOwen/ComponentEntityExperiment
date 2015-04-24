package com.campbellowen.spaceshooter.systems;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

import com.campbellowen.spaceshooter.components.Entity;

public class EntityManager {
	
	public static Dictionary<Integer, Entity> entities = new Hashtable<Integer, Entity>();
	public static ArrayList<Integer> entityIds = new ArrayList<Integer>();
	public static ArrayList<Integer> healthIds = new ArrayList<Integer>();
	public static ArrayList<Integer> playerIds = new ArrayList<Integer>();
	public static ArrayList<Integer> positionIds = new ArrayList<Integer>();
	public static ArrayList<Integer> velocityIds = new ArrayList<Integer>();
	public static ArrayList<Integer> textureIds = new ArrayList<Integer>();
	public static ArrayList<Integer> sizeIds = new ArrayList<Integer>();
	
	public enum Component {
		HEALTH, PLAYER, POSITION, VELOCITY, TEXTURE, SIZE
	}
	
	Entity entity;
	
	public static int createEntity(){
		int i = 0;
		while(entityIds.contains(i)){
			i++;
		}
		entities.put(i, new Entity(i));
		entityIds.add(i);
		return i;
	}
	
	public static void addComponent(Component component, int id){
		switch(component){
		case HEALTH:
			healthIds.add(id); 
			break;
		case PLAYER:
			playerIds.add(id);
			break;
		case POSITION:
			positionIds.add(id);
			break;
		case VELOCITY:
			velocityIds.add(id);
			break;
		case TEXTURE:
			textureIds.add(id);
			break;
		case SIZE:
			sizeIds.add(id);
			break;
		}
	}

}
