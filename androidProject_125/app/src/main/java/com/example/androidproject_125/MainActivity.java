package com.example.androidproject_125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView roll, roll2;
    TextView num;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = (ImageView) findViewById(R.id.roll);
        roll2 = (ImageView) findViewById(R.id.roll2);
        num = (TextView) findViewById(R.id.textv);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            Random random = new Random();

            @Override
            public void onClick(View view) {
                int ran = random.nextInt(6);
                int ran2 = random.nextInt(6);
                String s = (ran+1)+(ran2+1)+"";

                DiceRoller diceRoller = new DiceRoller(roll, roll2, num);
                diceRoller.randomNum(ran, ran2, s);

            }
        });
    }

    public class DiceRoller {
        private ImageView roll;
        private ImageView roll2;
        private TextView num;

        public DiceRoller(ImageView roll, ImageView roll2, TextView num) {
            this.roll = roll;
            this.roll2 = roll2;
            this.num = num;
        }

        public void randomNum(int ran, int ran2, String s) {
            num.setText(s);
            setDiceImage(roll, ran);
            setDiceImage(roll2, ran2);
        }

        private void setDiceImage(ImageView imageView, int value) {
            int[] diceImages = {
                    R.drawable.one,
                    R.drawable.two,
                    R.drawable.three,
                    R.drawable.four,
                    R.drawable.five,
                    R.drawable.six
            };

            if (value >= 0 && value < diceImages.length) {
                imageView.setImageResource(diceImages[value]);
            }
        }
    }

}

//    public void randomNum(int ran, int ran2, String s){
//        if (ran == 0) {
//            MainActivity.this.num.setText(s);
//            roll.setImageResource(R.drawable.one);
//        } else if (ran == 1) {
//            MainActivity.this.num.setText(s);
//            roll.setImageResource(R.drawable.two);
//        } else if (ran == 2) {
//            MainActivity.this.num.setText(s);
//            roll.setImageResource(R.drawable.three);
//        } else if (ran == 3) {
//            MainActivity.this.num.setText(s);
//            roll.setImageResource(R.drawable.four);
//        } else if (ran == 4) {
//            MainActivity.this.num.setText(s);
//            roll.setImageResource(R.drawable.five);
//        } else if (ran == 5) {
//            MainActivity.this.num.setText(s);
//            roll.setImageResource(R.drawable.six);
//        }if (ran2 == 0) {
//            MainActivity.this.num.setText(s);
//            roll2.setImageResource(R.drawable.one);
//        } else if (ran2 == 1) {
//            MainActivity.this.num.setText(s);
//            roll2.setImageResource(R.drawable.two);
//        } else if (ran2 == 2) {
//            MainActivity.this.num.setText(s);
//            roll2.setImageResource(R.drawable.three);
//        } else if (ran2 == 3) {
//            MainActivity.this.num.setText(s);
//            roll2.setImageResource(R.drawable.four);
//        } else if (ran2 == 4) {
//            MainActivity.this.num.setText(s);
//            roll2.setImageResource(R.drawable.five);
//        } else if (ran2 == 5) {
//            MainActivity.this.num.setText(s);
//            roll2.setImageResource(R.drawable.six);
//        }
//    }
