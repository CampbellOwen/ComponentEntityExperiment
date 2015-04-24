package com.campbellowen.spaceshooter;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.campbellowen.spaceshooter.systems.EntityManager;
import com.campbellowen.spaceshooter.systems.MovementSystem;

public class SpaceShooterGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture playerTexture;
	int player;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		playerTexture = new Texture("player.png");
		player = EntityManager.createEntity();
		EntityManager.entities.get(player).addTexture(playerTexture);
		EntityManager.entities.get(player).addSize(playerTexture.getWidth(), playerTexture.getHeight());
		EntityManager.entities.get(player).addPosition(800/2 - EntityManager.entities.get(player).size.getWidth(), 600/2 - EntityManager.entities.get(player).size.getHeight());
		EntityManager.entities.get(player).addVelocity(50, 0);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		EntityManager.entities.get(player).velocity.setY(EntityManager.entities.get(player).velocity.getY() + 1);
		MovementSystem.update(Gdx.graphics.getDeltaTime(), EntityManager.entityIds);
		batch.begin();
		batch.draw(EntityManager.entities.get(player).texture.getTexture(), EntityManager.entities.get(player).position.getX(), EntityManager.entities.get(player).position.getY(), EntityManager.entities.get(player).size.getWidth(), EntityManager.entities.get(player).size.getHeight());
		batch.end();
	}
}
