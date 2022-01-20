package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		int width = 1920;
		int height = 1080;
		int fps = 60;

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="ProjetIA";
		config.foregroundFPS = fps;
		config.width = width;
		config.height = height;
		config.resizable=false;
		new LwjglApplication(new MyGdxGame(), config);
	}
}
