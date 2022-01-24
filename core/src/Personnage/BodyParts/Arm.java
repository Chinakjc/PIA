package Personnage.BodyParts;

import Personnage.BonhommeAllumette;
import com.badlogic.gdx.graphics.Color;

public class Arm extends BodyPart{
    protected int x_t;
    protected int y_t;

    public Arm(BonhommeAllumette owner, double width_unite, double height_unite, int sizeUnite, int x_o, int y_o, float angle, Color color) {
        super(owner, width_unite, height_unite, sizeUnite, x_o, y_o, angle, color,"body.png");
        this.x_t =0;
        this.y_t=0;
    }


}
