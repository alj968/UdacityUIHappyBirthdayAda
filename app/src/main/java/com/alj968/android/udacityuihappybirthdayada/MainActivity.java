package com.alj968.android.udacityuihappybirthdayada;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView faceImageView = (ImageView) findViewById(R.id.image_view_face);
        Bitmap faceBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.my_face);
        RoundedBitmapDrawable circularBitmapDrawable =
                RoundedBitmapDrawableFactory.create(getResources(), faceBitmap);
        circularBitmapDrawable.setCircular(true);
        faceImageView.setImageDrawable(circularBitmapDrawable);
    }
}
