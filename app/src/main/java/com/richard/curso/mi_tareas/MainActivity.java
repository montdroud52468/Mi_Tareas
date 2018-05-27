package com.richard.curso.mi_tareas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;

public class MainActivity extends AppCompatActivity {
    private PieChart pieChar;
    private BarChart barChar;
    private String[]months=new String[]{"Enero","Febrero","Marzo","Abril","Mayo"};
    private int[]sale=new int[]{25,20,30,10,15};
    private int[]colors=new int[]{Color.BLACK,Color.RED,Color.GREEN,Color.BLUE,Color.GRAY,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        barChar=(BarChart)findViewById(R.id.barChart);
        barChar=(BarChart)findViewById(R.id.pieChart);
    }
    private Chart getSameChart(Chart chart,String description,int textColor,int background,int animateY) {
        char.getDescription().setText(description);
        char.getDescription().setTextSize(15);
        char.getBackgroudColor(background);
        char.animateY(animateY);

        return chart;
    }

}
