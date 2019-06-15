
package animacija;
public class PadajuciObjekti extends Anim {
    double rotSpeed = 500.;
    double cenralRotSpeed = 5.4;
    int state = 0;
    
    public PadajuciObjekti(double xpos, double ypos, double angle, double scale, Visual object) {
        super(xpos, ypos, angle, scale, object);
    }

    @Override
    public void update(double delta) {
        switch (state) {
            case 0:
                cenralRotSpeed +=1;
                if (cenralRotSpeed<=225) {
                    angle += rotSpeed * delta;
                }
                else{
                angle=0;
                state = 1;
                }
                break;
                
            case 1:
                translate(0,-5);
    }
}
}
