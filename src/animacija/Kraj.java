
package animacija;

public class Kraj extends Anim{
    
    
    int state = 0;
    int wait = 0;
    public Kraj(double xpos, double ypos, double angle, double scale) {
        super(xpos, ypos, angle, scale, new GSprite("./res/kraj.jpg"));
    }

    @Override
    public void update(double delta) {
        switch (state) {
            case 0:
                wait +=1;
                if (wait<=170) {
                    
                }
                if(wait>170 && wait<950){  
                scale(.0007);
                break;
                }
                
                
    }
     
    }
    
}
