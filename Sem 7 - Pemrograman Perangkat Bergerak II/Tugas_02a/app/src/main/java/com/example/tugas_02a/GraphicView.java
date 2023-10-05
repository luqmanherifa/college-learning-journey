package com.example.tugas_02a;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public class GraphicView extends View {
    private RectF kotak = new RectF(100,250,300,450);
    Paint cat = new Paint();

    public GraphicView(Context context){
        super(context);
    }

    public void kotak(int xkia, int ykia, int xkib, int ykib, int xkab, int ykab, int xkaa, int ykaa, String color, Canvas canvas){
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

        cat.setColor(Color.BLACK);
        cat.setTextSize(50);
        c.drawText("3D Box shapes", 400, 100, cat);

        //polos
        cat.setColor(Color.BLACK);
        cat.setStyle(Paint.Style.STROKE);
        cat.setStrokeWidth(5);
        c.drawRect(kotak,cat);
        c.drawLine(100, 250, 150,200, cat);
        c.drawLine(150, 200, 350,200, cat);
        c.drawLine(300, 250, 350,200, cat);
        c.drawLine(350, 200, 350,400, cat);
        c.drawLine(300, 450, 350,400, cat);

        //coklat
        kotak(500, 350, 500, 550, 700, 550, 700, 350, "#783c00", c);
        kotak(550, 300, 500, 350, 700, 350, 750, 300, "#a94b00", c);
        kotak(700, 350, 700, 550, 750, 500, 750, 300, "#bc5e00", c);

        //biru
        kotak(100, 600, 200, 700, 300, 600, 200, 500, "#22a7f0", c);
        kotak(100, 600, 100, 700, 200, 800, 200, 700, "#2574a9", c);
        kotak(200, 700, 200, 800, 300, 700, 300, 600, "#2c3e50", c);

        //biru2
        kotak(400, 700, 400, 800, 500, 850, 500, 750, "#22a7f0", c);
        kotak(500, 750, 500, 850, 700, 800, 700, 700, "#2574a9", c);
        kotak(400, 700, 500, 750, 700, 700, 600, 650, "#2c3e50", c);

        //coklat 3d
        kotak(150, 1000, 150, 1100, 300, 1100, 300, 1000, "#fcb941", c);
        kotak(300, 1000, 300, 1100, 450, 1050, 450, 950, "#f9bf3b", c);
        kotak(300, 950, 150, 1000, 300, 1000, 450, 950, "#2c3e50", c);
        kotak(150, 1000, 125, 1050, 275, 1050, 300, 1000, "#fde3a7", c);
        kotak(300, 1000, 325, 1050, 475, 1000, 450, 950, "#fde3a7", c);
        kotak(325, 900, 300, 950, 450, 950, 475, 900, "#fde3a7", c);

    }
}
