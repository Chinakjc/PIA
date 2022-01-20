package Menu;

import Personnage.BonhommeAllumette;
import Personnage.Brave;
import Weapons.Sword;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.MyGdxGame;

public class Menu implements Screen {
    MyGdxGame game;
    Stage stage;
    //MenuActor actor;
    Actor actor;

    public Menu(MyGdxGame game){
        this.game = game;
        //this.stage = new Stage(new StretchViewport(MyGdxGame.width_current,MyGdxGame.height_current));
        this.stage = new Stage();
        //this.actor = new MenuActor();
        this.actor = new Brave("breve",1,100,100,100,new Sword("sword"));
        stage.addActor(actor);
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.7f,0.6f,0.5f,1);
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
