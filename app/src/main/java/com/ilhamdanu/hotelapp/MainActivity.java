package com.ilhamdanu.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://rodextrip.com/media/image_dynamic/WhatsApp%20Image%202022-05-11%20at%2009.17.08.jpeg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}