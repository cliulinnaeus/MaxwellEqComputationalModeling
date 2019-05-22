package Physics;

import MathUtils.*;
import com.sun.javafx.stage.FocusUngrabEvent;
import javafx.scene.effect.Effect;

public class EField extends VectorField {

   public EField(Function f) {
       super(f);
   }

    @Override
    public Vector vectorAt(Vector v) {
        double mag = func.apply(v);
        return new Vector(mag * v.x(), mag * v.y(), mag * v.z());
    }
}
