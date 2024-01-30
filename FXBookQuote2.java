import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

public class FXBookQuote2 extends Application {

    @Override
    public void start(Stage stage) throws Exception 
    {
        Label label = new Label();
        label.setText("Charles Dickens, A Tale of two Cities!");
        label.setVisible(false);
        label.setTextFill(Paint.valueOf("blue"));

        Button btn = new Button();
        btn.setText("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness.");
        btn.setOnAction(
            new EventHandler<ActionEvent>() 
            {
                @Override
                public void handle(ActionEvent event) 
                {
                        btn.setDisable(true);
                        label.setVisible(true);
                    }
                }
            });
            VBox content = new VBox();
            content.setAlignment(POS.CENTER);
            content.setSpacing(20);
            content.getChildren().addAll(label, btn);

            StackPane root = new StackPane();
            root.getChildren().addAll(content);

            Scene scene = new Scene(root, 400, 400);

            primaryStage.setScene(scene);
            primaryStage.show();
        }

    }
