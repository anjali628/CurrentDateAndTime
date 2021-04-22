package com.example.currentdateandtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    Calendar calender;
    SimpleDateFormat simpledateformat;
    String Date;
    TextView GetDateAndTime;
    Button BtnGetDateAndtime;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetDateAndTime=findViewById(R.id.getDateAndtime);
        BtnGetDateAndtime=findViewById(R.id.btngetdateandtime);
        calender=Calendar.getInstance();
        simpledateformat=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date=simpledateformat.format(calender.getTime());

        BtnGetDateAndtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GetDateAndTime.setText(Date);
            }
        });


    }
}