package com.hongx.glide;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv = findViewById(R.id.imgv);


    }


    public void getBitmap(View view) {
        //创建10x10的位图
        Bitmap bmp = Bitmap.createBitmap(10,10,Bitmap.Config.RGB_565);
        //背景填充白色
        bmp.eraseColor(Color.WHITE);
        //创建存储像素的数组
        int pixels[] = new int[bmp.getWidth() * bmp.getHeight()];
        //取得像素数据
        bmp.getPixels(pixels, 0, bmp.getWidth(), 0, 0, bmp.getWidth(), bmp.getHeight());
        for (int i = 0; i < pixels.length; i++) {
            int a = Color.alpha(pixels[i]);
            int r = Color.red(pixels[i]);
            int g = Color.green(pixels[i]);
            int b = Color.blue(pixels[i]);
            Log.i("MainActivity i = ", i+"");
            Log.i("MainActivity a = ", a+"");
            Log.i("MainActivity r = ", r+"");
            Log.i("MainActivity g = ", g+"");
            Log.i("MainActivity b = ", b+"");
        }
    }


    public void createBitmap(View view) {
        int width = 10;
        int height = 10;
        int pixels[] = new int[width * height];
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = Color.argb(255, 0, 0, 0);
        }
        Bitmap bmp = Bitmap.createBitmap(pixels, 0, width, width, height, Bitmap.Config.ARGB_8888);
        imgv.setImageBitmap(bmp);
    }
}
