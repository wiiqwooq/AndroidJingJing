package com.example.week1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

public class DrawableView extends View {


    public DrawableView(Context context) {
        super(context);
    }

    public DrawableView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawableView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        int a=10,b=200,i=0;

        Random rand=new Random();



        while (i<5){

            paint.setColor(Color.argb(255,rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
            canvas.drawRect(a,a,b,b,paint);
            a=a+10;
            b=b+10;
            i++;
        }


        //paint.setColor(Color.YELLOW);
        //canvas .drawArc(300,300,600,600,180,180,true,paint);
        //canvas .drawArc(200,500,500,800,240,60,true,paint);
        //canvas .drawArc(500,500,1000,1000,-45,-270,true,paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(200,375,900,900,0,180,true,paint);
        paint.setColor(Color.RED);
        canvas.drawArc(225,400,875,875,0,180,true,paint);
        paint.setColor(Color.BLACK);
        //canvas.drawCircle(550,750,25,paint);
        canvas.drawOval(350,700,400,775,paint);
        canvas.drawOval(525,725,575,800,paint);
        canvas.drawOval(700,700,750,775,paint);

    }
}
