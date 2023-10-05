package com.example.logo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class GraphicView extends View {

    private RectF kotak = new RectF(254,554,454,754);
    private RectF kotak2 = new RectF(100,900,600,1200);
    private RectF kotak3 = new RectF(200,985,500,1185);
    private RectF kotak4 = new RectF(200,925,500,1125);
    Paint cat = new Paint();

    public GraphicView(Context context){
        super(context);
    }

    public void kubus(int xkia, int ykia, int xkib, int ykib, int xkab, int ykab, int xkaa, int ykaa, String color, Canvas canvas){
        cat.setColor(Color.parseColor(color));
        cat.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.moveTo(xkia,ykia); path.lineTo(xkib,ykib); path.lineTo(xkab,ykab); path.lineTo(xkaa,ykaa);
        path.close();
        canvas.drawPath(path, cat);
        cat.setColor(Color.parseColor("#000000"));
        cat.setStyle(Paint.Style.STROKE);
        cat.setStrokeWidth(2);
        canvas.drawPath(path, cat);
    }
    protected void onDraw(Canvas c){

        kubus(245, 960, 225, 980, 475, 980, 455, 960, "#00e640", c);
        cat.setColor(Color.parseColor("#19b5fe"));
        cat.setStyle(Paint.Style.FILL);
        cat.setTextSize(80);
        c.drawText("INDOSIAR", 175, 1075, cat);
        kubus(225, 1125, 245, 1145, 455, 1145, 475, 1125, "#00e640", c);


        //MITSUBISHI
        cat.setColor(Color.BLACK);
        cat.setStyle(Paint.Style.FILL);
        cat.setTextSize(60);
        c.drawText("MITSUBISHI", 175, 350, cat);
        c.drawText("MOTORS", 225, 400, cat);

        kubus(275, 100, 350, 200, 425, 100, 350, 0, "#cf000f", c);
        kubus(200, 200, 150, 300, 300, 300, 350, 200, "#cf000f", c);
        kubus(350, 200, 400, 300, 550, 300, 500, 200, "#cf000f", c);

        cat.setColor(Color.BLACK);
        cat.setStyle(Paint.Style.FILL);
        c.drawCircle(350,650,200, cat);
        cat.setColor(Color.WHITE);
        c.drawCircle(351,651,180, cat);
        cat.setColor(Color.BLACK);
        c.drawCircle(352,652,170, cat);
        cat.setColor(Color.WHITE);
        c.drawCircle(357,657,100, cat);
        cat.setColor(Color.parseColor("#81cfe0"));

        //BMW
        c.drawArc(kotak,0,90,true, cat);
        cat.setColor(Color.parseColor("#81cfe0"));
        c.drawArc(kotak,180,90,true, cat);
        int x = 110;
        int y = 300;
        cat.setColor(Color.WHITE);
        cat.setTextSize(60);
        String str2rotate = "B";

        Rect rect = new Rect();
        cat.getTextBounds(str2rotate, 0, str2rotate.length(), rect);
        c.translate(x, y);
        cat.setStyle(Paint.Style.FILL);
        c.rotate(-45, x + rect.exactCenterX(),
                y + rect.exactCenterY());
        c.drawText(str2rotate, x, y, cat);
        c.rotate(90, x + rect.exactCenterX(),
                y + rect.exactCenterY());
        cat.setColor(Color.WHITE);
        cat.setTextSize(60);
        c.drawText("M", 325, 545, cat);
        cat.setColor(Color.WHITE);
        cat.setTextSize(60);
        c.drawText("W", 275, 145, cat);
        cat.setColor(Color.WHITE);
        cat.setTextSize(60);


        //INDOSIAR


        cat.setColor(Color.BLACK);
        cat.setStyle(Paint.Style.STROKE);
        cat.setStrokeWidth(5);
        c.drawRoundRect(kotak2, 40,40, cat);

        cat.setColor(Color.parseColor("#00b5cc"));
        cat.setStyle(Paint.Style.FILL);
        c.drawArc(kotak3,45,90,false, cat);
        cat.setColor(Color.parseColor("#f03434"));
        cat.setStyle(Paint.Style.FILL);
        c.drawArc(kotak4,-45,-90,false, cat);
        cat.setStyle(Paint.Style.FILL);

    }
}
