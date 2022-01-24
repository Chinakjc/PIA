package Personnage.BodyParts;

import Personnage.BonhommeAllumette;
import Utile.Utile;
import com.badlogic.gdx.graphics.Color;
import Utile.*;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Body extends BodyPart {

    public Body(BonhommeAllumette owner, double width_unite, double height_unite, int sizeUnite, int x_o, int y_o, float angle, Color color) {
        super(owner, width_unite, height_unite, sizeUnite, x_o, y_o, angle, color,"body.png");
    }


}
