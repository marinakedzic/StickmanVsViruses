/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacija;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public class World extends Application {

    public static int WIDTH = 1000;
    public static int HEIGHT = 562;
    long lastLoopTime;

    GScene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage theStage) throws InterruptedException {
        theStage.setTitle("Stickman vs Windows");
        
        scene = new GScene();
        scene.init();
        

        Group root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);

        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        lastLoopTime = System.nanoTime();

        new AnimationTimer() {
            @Override
            public void handle(long currentLoopTime) {
                double delta = (currentLoopTime - lastLoopTime) / 1000000000.0;
                lastLoopTime = currentLoopTime;


                scene.update(delta);
                scene.draw(gc);
            }
        }.start();

        theStage.show();
    }
}
