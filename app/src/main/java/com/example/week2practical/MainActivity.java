package com.example.week2practical;

import static android.provider.MediaStore.MediaColumns.TITLE;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final String TITLE = "Main Activity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "On Create!");

        User testUser1 = new User("A-Train","Fastest man alive");
        testUser1.setId(1);
        testUser1.setFollowed(false);

        Button myButton = findViewById(R.id.followbutton);


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!testUser1.isFollowed()) {
                    myButton.setText("Unfollow");
                    testUser1.setFollowed(true);
                } else if (testUser1.isFollowed()) {
                    myButton.setText("Follow");
                    testUser1.setFollowed(false);
                }
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE, "On Start!");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TITLE, "On Pause!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TITLE, "On Resume!");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TITLE, "On Stop!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TITLE, "On Destroy!");
    }
}