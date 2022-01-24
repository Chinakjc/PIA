package Personnage.BodyParts;

import Personnage.BonhommeAllumette;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Head extends BodyPart {
    public Head(BonhommeAllumette owner, double width_unite, double height_unite, int sizeUnite, int x_o, int y_o, float angle, Color color) {
        super(owner, width_unite, height_unite, sizeUnite, x_o, y_o, angle, color,"head.png");
    }
}
