import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Random;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
//        String[] name_array = {"1","2","3","4","5","6","7","8","9"};
        ArrayList<SlotMachine> label_array= new ArrayList<>();

        for (int i=0; i <3; i++){
            label_array.add(new SlotMachine());
        }

//        ○×を表示するHBoxを作成
        HBox stopBox = new HBox(20d);
        stopBox.setPadding(new Insets(10,10,10,10));
        stopBox.setAlignment(Pos.CENTER);

        stopBox.getChildren().addAll(label_array);

//        ○×を設定するボタンを作成
        Button start_bottun = new Button("Start");
        start_bottun.setPrefSize(100,50);
        start_bottun.setOnAction(event -> {
//            Random rand = new Random();
//            Timeline timer = new Timeline(new KeyFrame(Duration.millis(100), e ->{
////                0～配列の大きさの乱数を生成 100が0.1秒で決定される
//                int randomNumber = rand.nextInt(name_array.length);
////                name_arrayから乱数をもとに配列を値を取得　name_array[0]は0番目の数を取得
//
//                for (int i =0; i<3 ; i++){
//                    label_array.get(i).setText(name_array[randomNumber]);
//                }
//            }));
//            timer.setCycleCount(Timeline.INDEFINITE);
////            30回表示させる
//            timer.play();

            label_array.get(0).startSlot();
        });

        Button stopButton = new Button("Stop");

        stopButton.setOnAction(event ->{
//            Random rand = new Random();
//            Timeline timer = new Timeline();
//            Timeline timer = new Timeline(new KeyFrame(Duration.millis(100), e ->{
////                0～配列の大きさの乱数を生成 100が0.1秒で決定される
//                int randomNumber = rand.nextInt(name_array.length);
//                int randomNumber = 1;
////                name_arrayから乱数をもとに配列を値を取得　name_array[0]は0番目の数を取得
//
//                for (int i =0; i<3 ; i++){
//                    label_array.get(0).setText(name_array[1]);
//                }
//            }));
//            timer.setCycleCount(1);
////            30回表示させる
                    label_array.get(0).stopSlot();
//            timer.stop();
            }
        );

//                setMaru・setBatuボタンを纏めるHBoxを作成
        HBox setBox = new HBox(20d);
        setBox.setPadding(new Insets(10,10,10,10));
        setBox.setAlignment(Pos.CENTER);
        setBox.getChildren().add(start_bottun);
        setBox.getChildren().add(stopButton);

//                BorderPaneを作成

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(stopBox);
        borderPane.setBottom(setBox);

        Scene scene = new Scene(borderPane,400,120);
        stage.setScene(scene);
        stage.show();


    }
}
