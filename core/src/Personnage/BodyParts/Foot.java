package Personnage.BodyParts;

import Personnage.BonhommeAllumette;
import com.badlogic.gdx.graphics.Color;

public class Foot extends BodyPart{
    public Foot(BonhommeAllumette owner, double width_unite, double height_unite, int sizeUnite, int x_o, int y_o, float angle, Color color) {
        super(owner, width_unite, height_unite, sizeUnite, x_o, y_o, angle, color, "body.png");
    }
}
