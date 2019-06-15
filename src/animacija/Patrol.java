
package animacija;

public class Patrol extends Anim {
    
    double rotSpeed = 270.;
    double speedx = 364;
    //double speedy = 48;
    double xrange = 200;
    //double yrange = 228;
    int state = 0;

    public Patrol(Visual object) {
        super(1000, 0, 36.6, 0.5, object);
    }

    private boolean updateRot(double delta, double desired) {
        if (angle >= desired) {
            angle -= rotSpeed * delta;
            if(angle <= desired) {
                angle = desired;
                return true;
            }
        } else {
            angle += rotSpeed * delta;
            if(angle >= desired) {
                angle = desired;
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(double delta) {
        switch (state) {
            case 0:
                xpos -= speedx * delta;
                //ypos += speedy * delta;
                if (xpos <= xrange) {
                    xpos = xrange;
                    //ypos = yrange;
                    state = 1;
                }
                break;
            case 1:
                if (updateRot(delta, -90)) {
                    state = 4;
                }
                break;
            case 4:
                xpos += speedx * delta;
            
    }

}
}
