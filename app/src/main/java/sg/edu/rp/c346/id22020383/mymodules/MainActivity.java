package sg.edu.rp.c346.id22020383.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;

    String[] M_C203 = {"C203", "Web Appln Development in php", "2023", "1", "4", "W65D"};
    String[] M_C206 = {"C206", "Software Development Process", "2023", "1", "4", "W65D"};
    String[] M_C218 = {"C218", "UI/UX Design For Apps", "2023", "1", "4", "W65D"};
    String[] M_C235 = {"C235", "IT security and Management", "2023", "1", "4", "W65D"};
    String[] M_C346 = {"C346", "Mobile App Development", "2023", "1", "4", "E63A"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC203 = findViewById(R.id.tvC203);
        tvC206 = findViewById(R.id.tvC206);
        tvC218 = findViewById(R.id.tvC218);
        tvC235 = findViewById(R.id.tvC235);
        tvC346 = findViewById(R.id.tvC346);


        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Module_code", "C203");
                intent.putExtra("detail1", M_C203);
                startActivity(intent);
                ;
            }
        });
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Module_code", "C206");
                intent.putExtra("detail2", M_C203);
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_code = new Intent(MainActivity.this, MainActivity2.class);
                intent_code.putExtra("Module_code", "C218");
                intent_code.putExtra("detail3", M_C218);
                startActivity(intent_code);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_code = new Intent(MainActivity.this, MainActivity2.class);
                intent_code.putExtra("Module_code", "C235");
                intent_code.putExtra("detail4", M_C203);
                startActivity(intent_code);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_code = new Intent(MainActivity.this, MainActivity2.class);
                intent_code.putExtra("Module_code", "C346");
                intent_code.putExtra("detail5", M_C203);
                startActivity(intent_code);
            }
        });


    }
}