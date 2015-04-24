package com.campbellowen.spaceshooter.components;

import com.badlogic.gdx.graphics.Texture;
import com.campbellowen.spaceshooter.systems.EntityManager;

public class Entity {
	private int id;
	public Health health;
	public Player player;
	public Position position;
	public Velocity velocity;
	public EntityTexture texture;
	public Size size;
	
	public Entity(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void addHealth(int health){
		this.health = new Health();
		this.health.setHealth(health);
		EntityManager.healthIds.add(id);
	}
	
	public void addPlayer(){
		this.player = new Player();
		EntityManager.playerIds.add(id);
	}
	
	public void addPosition(int x, int y){
		this.position = new Position();
		this.position.setPosition(x, y);
		EntityManager.positionIds.add(id);
	}
	
	public void addVelocity(int x, int y){
		this.velocity = new Velocity();
		this.velocity.setVelocity(x, y);
		EntityManager.velocityIds.add(id);
	}
	
	public void addTexture(Texture texture){
		this.texture = new EntityTexture();
		this.texture.setTexture(texture);
		EntityManager.textureIds.add(id);
	}
	
	public void addSize(int width, int height){
		this.size = new Size();
		this.size.setSize(width, height);
		EntityManager.sizeIds.add(id);
	}

}
