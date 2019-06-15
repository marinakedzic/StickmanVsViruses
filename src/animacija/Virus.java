
package animacija;

public class Virus extends Anim {

    public Virus(double xpos, double ypos, double angle, double scale) {
        super(xpos, ypos, angle, scale, new GSprite("./res/1.png"));
    }
    
    @Override
    public void update(double delta) {
        translate(4,0);
}}
