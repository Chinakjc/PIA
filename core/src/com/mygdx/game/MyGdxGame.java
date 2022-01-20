package com.mygdx.game;

import Menu.Menu;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends Game {
	public static int width_current;
	public static int height_current;

	@Override
	public void create() {
		setScreen(new Menu(this));
	}

	@Override
	public void render(){
		super.render();
	}

	@Override
	public void resize(int width,int height){
	}

}

	/*
	SpriteBatch batch;
	Texture img;*/
	
	/*@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
*/