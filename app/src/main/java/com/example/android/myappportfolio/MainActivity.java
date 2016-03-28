package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Button transitioning user to spotify app activity
    public void spotifyButton(View view) {
        Button _spotifyButton = (Button)findViewById(R.id.spotifyButton);

        _spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch Spotify App";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    public void footballScores(View view) {
        Button _footballScores = (Button)findViewById(R.id.scoresButton);

        _footballScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch football scores app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    public void libraryButton(View view) {
        Button _libraryButton = (Button)findViewById(R.id.libraryApp);

        _libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch library app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    public void buildBiggerButton(View view) {
        Button _buildBiggerButton = (Button)findViewById(R.id.buildBiggerButton);

        _buildBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch the build it bigger app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    public void xyzButton(View view) {
        Button _xyzButton = (Button)findViewById(R.id.readerButton);

        _xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will launch the XYZ app";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

    public void capstoneButton(View view) {
        Button _capstoneButton = (Button)findViewById(R.id.capstoneButton);

        _capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "This button will open the capstone app";
                int duratioin = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duratioin);
                toast.show();
            }
        });
    }
}
