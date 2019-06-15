
package animacija;

public class Stickman extends Anim {

    double speedx = 120;
    double xrange = 0;
    double speedy = 800;
    double yrange = -80;
    int state = 0;
    

    public Stickman(double xpos, double ypos, double angle, double scale) {
        super(xpos, ypos, angle, scale, new GSprite("./res/hoda_1.gif"));
    }
    
    @Override
    public void update(double delta) {
        switch (state) {
            case 0:
                xpos += speedx * delta;
                if (xpos >= xrange) {
                    xpos = 0;
                    state = 3;
                }
                break;
            case 3:
                ypos += speedy * delta;
                if (ypos >= yrange) {
                    ypos = yrange;
                    state = 5;
                }
                break;
            case 5:
                ypos -= speedy * delta;
                if (ypos <= -150) {
                    state = 6;
                }
                break;
             case 6:
                ypos = -150;
                state = 4;
            case 4:
                xpos -= speedx * delta;
                if (xpos <= -450) {
                    state = 2;
                }
                break;
            case 2:
                xpos = -450;
                
            
        }
        
    }
}
