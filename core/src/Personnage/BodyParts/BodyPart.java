package Personnage.BodyParts;

import Personnage.BonhommeAllumette;
import Utile.Utile;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public abstract class BodyPart extends Actor {
    protected BonhommeAllumette owner;
    protected double width_unite;
    protected double height_unite;
    protected int sizeUnite;
    protected int x_o;
    protected int y_o;
    protected float angle;
    protected Texture texture;
    protected TextureRegion region;


    public BodyPart(BonhommeAllumette owner, double width_unite, double height_unite, int sizeUnite, int x_o, int y_o, float angle,Color color,String file) {
        super();
        this.owner = owner;
        this.width_unite = width_unite;
        this.height_unite = height_unite;
        this.sizeUnite = sizeUnite;
        this.x_o = x_o;
        this.y_o = y_o;
        this.angle = angle;
        this.texture = new Texture(file);
        this.region = new TextureRegion(texture);
        this.setSize((float)width_unite*sizeUnite,(float) height_unite*sizeUnite);
        this.setPosition(x_o,y_o);
        this.setOrigin(x_o,y_o);
        this.setRotation(angle);
        this.setColor(color);
    }


    public void augmentRotation(float delta){
        setAngle(angle+delta);
        setRotation(angle);
    }

    @Override
    public void draw(Batch batch, float parentAlpha){
        super.draw(batch,parentAlpha);
        if(!isVisible())
            return;
        batch.setColor(getColor());

        batch.draw(region,getX(),getY(),getOriginX(),getOriginY(),getWidth(),getHeight(),getScaleX(),getScaleY(),getRotation());

    }


    @Override
    public void act(float delta){
        super.act(delta);
    }

    public double get_r(){
        return Utile.norme2(getWidth(),getHeight());
    }

    public float get_x_t(){
        return (float) (getX()+Math.cos(getRotation())*get_r());
    }

    public float get_y_t(){
        return (float) (getY()+Math.sin(getRotation())*get_r());
    }

    public BonhommeAllumette getOwner() {
        return owner;
    }

    public double getWidth_unite() {
        return width_unite;
    }

    public void setWidth_unite(double width_unite) {
        this.width_unite = width_unite;
    }

    public double getHeight_unite() {
        return height_unite;
    }

    public void setHeight_unite(double height_unite) {
        this.height_unite = height_unite;
    }

    public int getSizeUnite() {
        return sizeUnite;
    }

    public void setSizeUnite(int sizeUnite) {
        this.sizeUnite = sizeUnite;
    }

    public int getX_o() {
        return x_o;
    }

    public void setX_o(int x_o) {
        this.x_o = x_o;
    }

    public int getY_o() {
        return y_o;
    }

    public void setY_o(int y_o) {
        this.y_o = y_o;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }


}
