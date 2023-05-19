package sg.edu.rp.c346.id22020383.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    TextView tvAnswer;
    String value;
    String value1;
    String value2;
    String value3;
    String value4;
    String value5;

    String output;
    Button returnbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvAnswer = findViewById(R.id.textView2);
        returnbtn = findViewById(R.id.button);

        value = getIntent().getStringExtra("Module_code");


        if (value.equalsIgnoreCase("C203")) {
            String[] content = getIntent().getStringArrayExtra("detail1");
            value1 = content[1];
            value2 = content[2];
            value3 = content[3];
            value4 = content[4];
            value5 = content[5];

        } else if (value.equalsIgnoreCase("C206")) {
            String[] content = getIntent().getStringArrayExtra("detail2");
            value1 = content[1];
            value2 = content[2];
            value3 = content[3];
            value4 = content[4];
            value5 = content[5];

        } else if (value.equalsIgnoreCase("C218")) {
            String[] content = getIntent().getStringArrayExtra("detail3");
            value1 = content[1];
            value2 = content[2];
            value3 = content[3];
            value4 = content[4];
            value5 = content[5];

        } else if (value.equalsIgnoreCase("C235")) {
            String[] content = getIntent().getStringArrayExtra("detail4");
            value1 = content[1];
            value2 = content[2];
            value3 = content[3];
            value4 = content[4];
            value5 = content[5];

        } else if (value.equalsIgnoreCase("C346")) {
            String[] content = getIntent().getStringArrayExtra("detail5");
            value1 = content[1];
            value2 = content[2];
            value3 = content[3];
            value4 = content[4];
            value5 = content[5];
        }
        String output = "Module Code: " + value
                + "\nModule Name: " + value1
                + "\nAcademic Year: 2023" + value2
                + "\nSemester: 1" + value3
                + "\nModule Credit: " + value4
                + "\nVenue: " + value5;
        tvAnswer.setText(output);


        returnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}









