package Personnage.BodyParts;

import Personnage.BonhommeAllumette;
import com.badlogic.gdx.scenes.scene2d.Actor;

public abstract class BodyPart extends Actor {
    protected BonhommeAllumette owner;
    protected int width;
    protected int height;
    protected int sizeUnite;
    protected double percentageWidth;
    protected double percentageHeight;
    protected int position_x;
    protected int position_y;


}
