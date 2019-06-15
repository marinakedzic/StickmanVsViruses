
package animacija;

import java.util.ArrayList;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class GScene {

    Image sky;
    ArrayList<Anim> objects;

    public GScene() {
        objects = new ArrayList<>();
    }
    
    public void animateFire(double delta) {
        
    }

    public void init() throws InterruptedException {
        sky = new Image("./res/pocetak.png");
        objects.add(new Stickman(-450, -150, 0, 1.));
        objects.add(new Virus(-300, -150, 0, 0.3));
        objects.add(new PadajuciObjekti(-450, 240, 0, 1., new GSprite("./res/PC.png")));
        objects.add(new PadajuciObjekti(450, -200, 0, 1., new GSprite("./res/kanta2.png")));
        objects.add(new PadajuciObjekti(-370, 240, 0, 1., new GSprite("./res/file.png")));
        objects.add(new PadajuciObjekti(450, 240, 0, 1., new GSprite("./res/Viber.png")));
        objects.add(new PadajuciObjekti(-450, 170, 0, 1., new GSprite("./res/excel.png")));
        objects.add(new Kraj(0,0,0,0));
        objects.add(new Cluster());
        objects.add(new Patrol(new GSprite("./res/2.png")));
    }
    
    public void update(double delta) {
        objects.stream().forEach((ob) -> {
            ob.update(delta);
        });
    }

    public void draw(GraphicsContext gc) {
        gc.drawImage(sky, 0, 0);
        objects.stream().forEach((ob) -> {
            ob.draw(gc);
        });
    }
}
