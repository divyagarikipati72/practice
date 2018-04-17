/** CircleDemo.java
    @author Alice Fischer
    @version 1/1/15.
 */
package circle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.io.*;

// This demo introduces shapes.
public class CircleDemo extends Application {
    Color grayBlue = new Color( .4, .4, .8, 1 );

    Circle c1 = new Circle(100, 100, 50, grayBlue);
    Circle c2 = new Circle(100, 125, 25, Color.WHITE);
    Circle c3 = new Circle(91, 120, 5, Color.BLUE);
    Circle c4 = new Circle(109, 120, 5, Color.BLUE);

    Pane demo = new Pane();

    //@Override
    public void start( Stage st ){
        st.setTitle("Circle Demo");
        c1.setStroke(Color.BLACK);
        demo.getChildren().addAll( c1, c2, c3, c4 );

        Scene sn = new Scene( demo, 200, 200 );        // Set window size.
        st.setScene(sn);
        st.show();
    }
    
    /** This is required for the window to open in Eclipse but omit to use this in NetBeans */
    public static void main (String[] args){
    	launch(args);
    }
    
}