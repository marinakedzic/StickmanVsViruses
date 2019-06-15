
package animacija;
import javafx.scene.canvas.GraphicsContext;

public class Cluster extends Anim {
    
    Visual cosmo;
    Visual laika;
    
    double crad = 1;
    double prad = 50;
    double cangle = 80;
    double pangle = 0;
    double cosmoangle = 0;
    double laikaangle = 0;
    double crotSpeed = 200.5;
    double protSpeed = 200.;
    double laikaRotSpeed = 500.;
    double cosmoRotSpeed = -500.;

    public Cluster() {
        super(-200, 0, -180, 1, null);
        cosmo = new GSprite("./res/3.png");
        laika = new GSprite("./res/4.png");
    }

    @Override
    public void update(double delta) {
        cangle += crotSpeed * delta;
        pangle += protSpeed * delta;
        cosmoangle += cosmoRotSpeed * delta;
        laikaangle += laikaRotSpeed * delta;
        Cluster.super.scale = scale * 0.98;
        
        
    }
    
    @Override
   public void draw(GraphicsContext gc) {
        
        double cx = prad * Math.cos(Math.toRadians(pangle));
        double cy = prad * Math.sin(Math.toRadians(pangle));
        double lx = prad * Math.cos(Math.toRadians(pangle + 180));
        double ly = prad * Math.sin(Math.toRadians(pangle + 180));
        cosmo.draw(gc, cx, cy, cosmoangle, scale);
        laika.draw(gc, lx, ly, laikaangle, scale);
        
    }
}
