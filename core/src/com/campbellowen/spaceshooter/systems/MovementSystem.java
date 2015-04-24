package com.campbellowen.spaceshooter.systems;

import java.util.ArrayList;
import com.campbellowen.spaceshooter.components.Entity;


public class MovementSystem {

	public static void update(float deltaTime, ArrayList<Integer> entityIdList){

		for (int id : entityIdList){
			Entity entity = EntityManager.entities.get(id);
			if (entity.position != null && entity.velocity != null) {
				entity.position.setX(entity.position.getX() + (entity.velocity.getX() * deltaTime));
				entity.position.setY(entity.position.getY() + (entity.velocity.getY() * deltaTime));
			}
		}
		
	}
}
