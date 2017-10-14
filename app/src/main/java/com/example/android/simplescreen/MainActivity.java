package com.example.android.simplescreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

//        In this project, the Java file is not very important.
//        I've just added a photo and text carousel, to the basic that comes with Hello World.
//        Here most of the work comes in the layout, which are LineaLayouts chained and weighted.

public class MainActivity extends AppCompatActivity {
    ImageView photo;
    TextView text;
    int cont = 0;

    int[] photoId = {R.drawable.photo01, R.drawable.photo02, R.drawable.photo03, R.drawable.photo04, R.drawable.photo05, R.drawable.photo06, R.drawable.photo07, R.drawable.photo08, R.drawable.photo09, R.drawable.photo10};
    int[] textId = {R.string.sara_ruesga, R.string.string1, R.string.string2, R.string.string3, R.string.string4, R.string.string5, R.string.string6, R.string.string7, R.string.string8, R.string.string9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void carousel(View view) {

        photo = (ImageView) findViewById(R.id.image_set);
        text = (TextView) findViewById(R.id.text_set);
        if (cont < 9) {
            cont += 1;

        } else {
            cont = 0;

        }
        photo.setImageResource(photoId[cont]);
        text.setText(textId[cont]);

    }


}
