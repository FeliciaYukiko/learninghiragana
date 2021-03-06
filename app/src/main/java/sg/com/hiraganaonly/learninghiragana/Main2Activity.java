package sg.com.hiraganaonly.learninghiragana;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.github.pwittchen.swipe.library.rx2.SimpleSwipeListener;
import com.github.pwittchen.swipe.library.rx2.Swipe;

public class Main2Activity extends AppCompatActivity {

    private Swipe swipe;

    @Override public boolean dispatchTouchEvent(MotionEvent event) {
        swipe.dispatchTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button b = (Button) findViewById(R.id.aiueo);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.aiueo);
                mp.start();
            }
        });
        Button b1 = (Button) findViewById(R.id.kakikukeko);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.kakikukeko);
                mp.start();
            }
        });
        Button b2 = (Button) findViewById(R.id.sashisuseso);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.sashisuseso);
                mp.start();
            }
        });
        Button b3 = (Button) findViewById(R.id.tachitsuteto);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.tachitsuteto);
                mp.start();
            }
        });
        Button b4 = (Button) findViewById(R.id.naninuneno);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.naninuneno);
                mp.start();
            }
        });
        Button b5 = (Button) findViewById(R.id.hahifuheho);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.hahifuheho);
                mp.start();
            }
        });
        Button b6 = (Button) findViewById(R.id.mamimumemo);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.mamimumemo);
                mp.start();
            }
        });
        Button b7 = (Button) findViewById(R.id.yayuyo);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.yayuyo);
                mp.start();
            }
        });
        Button b8 = (Button) findViewById(R.id.rarirurero);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.rarirurero);
                mp.start();
            }
        });
        Button b9 = (Button) findViewById(R.id.waon);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Main2Activity.this, R.raw.waon);
                mp.start();
            }
        });
        Button b10 = findViewById(R.id.home);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
            }
        });
        swipe = new Swipe();
        swipe.setListener(new SimpleSwipeListener() {
            @Override
            public boolean onSwipedRight(MotionEvent event) {
                Intent i = new Intent (Main2Activity.this, MainActivity.class);
                startActivity(i);
                return super.onSwipedRight(event);
            }

            @Override
            public boolean onSwipedLeft(MotionEvent event) {
                Intent i = new Intent (Main2Activity.this, Main3Activity.class);
                startActivity(i);
                return super.onSwipedLeft(event);
    }});
    }}
