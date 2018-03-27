import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Random;

public class SlotMachine extends Label {
    Timeline timer;
    public SlotMachine(){
        super();
        this.setText("1");
//        MyLabel myLabel = new MyLabel();
//          myLabel.setPrefSize(50,50); と同じ意味
        this.setPrefSize(50,50);
    }


    public void startSlot(){

        String[] name_array = {"1","2","3","4","5","6","7","8","9"};
        ArrayList<SlotMachine> label_array= new ArrayList<>();
        Random rand = new Random();
        Timeline timer = new Timeline(new KeyFrame(Duration.millis(100), e ->{
//                0～配列の大きさの乱数を生成 100が0.1秒で決定される
            int randomNumber = rand.nextInt(name_array.length);
//                name_arrayから乱数をもとに配列を値を取得　name_array[0]は0番目の数を取得

//            for (int i =0; i<3 ; i++){
//                label_array.get(i).setText(name_array[randomNumber]);
            this.setText(String.valueOf(randomNumber));
//            }
        }));
        timer.setCycleCount(Timeline.INDEFINITE);
//            30回表示させる

        timer.play();
    }

    public  void stopSlot(){
            timer.stop();


    }

}