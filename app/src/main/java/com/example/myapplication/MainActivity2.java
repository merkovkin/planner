package com.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private Button button;

    private EditText edit1;
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private EditText edit2;
    private EditText edit3;
    private EditText edit4;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button1;
    private SharedPreferences pref;
    private final String save_key = "save_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = findViewById(R.id.save);
        edit1 = findViewById(R.id.editTextText);
        edit2 = findViewById(R.id.editTextText2);
        edit3 = findViewById(R.id.editTextText3);
        edit4 = findViewById(R.id.editTextText4);
        text1 = findViewById(R.id.textView2);
        text2 = findViewById(R.id.textView3);
        text3 = findViewById(R.id.textView4);
        text4 = findViewById(R.id.textView5);
        button1 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);
        button4 = findViewById(R.id.button5);

        Button button2 = (Button) findViewById(R.id.to_activity3);
        Button buttonactivity4 = (Button) findViewById(R.id.to_activity4);
        Button buttonactivity5 = (Button)findViewById(R.id.to_activity5);
        Button buttonactivity6 = (Button)findViewById(R.id.to_activity6);

        readDataFromSharedPreferences();
        readDataFromSharedPreferences2();
        readDataFromSharedPreferences3();
        readDataFromSharedPreferences4();

        button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {

                saveDataInsSharedPrefrences(edit1.getText().toString().trim());

            }
        });
        button1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                saveDataInsSharedPrefrences2(edit2.getText().toString().trim());

            }


        });
        button3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                saveDataInsSharedPrefrences3(edit3.getText().toString().trim());

            }


        });
        button4.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                saveDataInsSharedPrefrences4(edit4.getText().toString().trim());

            }


        });

        //кнопачки для перехода

        View.OnClickListener SecScreen2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }
        };
        buttonactivity4.setOnClickListener(SecScreen2);

        View.OnClickListener SecScreen3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity(intent);
            }
        };
        buttonactivity5.setOnClickListener(SecScreen3);

        View.OnClickListener SecScreen4 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity6.class);
                startActivity(intent);
            }
        };
        buttonactivity6.setOnClickListener(SecScreen4);


        View.OnClickListener SecScreen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(SecScreen);
    }


//первая строка

    private void readDataFromSharedPreferences() {
        SharedPreferences sh=getSharedPreferences("Shared", MODE_PRIVATE);
        String name= sh.getString("NAME", "");
        if(name.isEmpty()){
            text1.setText("Стандартное");
            button.setText("Сохранить");

        }else {
            text1.setText(name);
            button.setText("Сохранить");


        }
    }

    private void saveDataInsSharedPrefrences(String name){
        SharedPreferences sharedPreferences = getSharedPreferences("Shared", MODE_PRIVATE);
        SharedPreferences.Editor Edit=sharedPreferences.edit();
        Edit.putString("NAME", name);
        Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
        Edit.commit();
        edit1.setText(null);
        text1.setText(name);


    }

    //втроая строка

    private void saveDataInsSharedPrefrences2(String name2) {
        SharedPreferences sharedPreferences2 = getSharedPreferences("Shared2", MODE_PRIVATE);
        SharedPreferences.Editor Edit2=sharedPreferences2.edit();
        Edit2.putString("NAME", name2);
        Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
        Edit2.commit();
        edit2.setText(null);
        text2.setText(name2);

    }
    private void readDataFromSharedPreferences2() {
        SharedPreferences sh2=getSharedPreferences("Shared2", MODE_PRIVATE);
        String name2= sh2.getString("NAME", "");
        if(name2.isEmpty()){
            text2.setText("Стандартное");
            button1.setText("Сохранить");

        }else {
            text2.setText(name2);
            button1.setText("Сохранить");


        }
    }

    //третья строка

    private void saveDataInsSharedPrefrences3(String name3) {
        SharedPreferences sharedPreferences3 = getSharedPreferences("Shared3", MODE_PRIVATE);
        SharedPreferences.Editor Edit3=sharedPreferences3.edit();
        Edit3.putString("NAME", name3);
        Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
        Edit3.commit();
        edit3.setText(null);
        text3.setText(name3);

    }
    private void readDataFromSharedPreferences3() {
        SharedPreferences sh3=getSharedPreferences("Shared3", MODE_PRIVATE);
        String name3= sh3.getString("NAME", "");
        if(name3.isEmpty()){
            text3.setText("Стандартное");
            button3.setText("Сохранить");

        }else {
            text3.setText(name3);
            button3.setText("Сохранить");


        }
    }

    //четвертая строка

    private void saveDataInsSharedPrefrences4(String name4) {
        SharedPreferences sharedPreferences4 = getSharedPreferences("Shared4", MODE_PRIVATE);
        SharedPreferences.Editor Edit4=sharedPreferences4.edit();
        Edit4.putString("NAME", name4);
        Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
        Edit4.commit();
        edit4.setText(null);
        text4.setText(name4);

    }
    private void readDataFromSharedPreferences4() {
        SharedPreferences sh4=getSharedPreferences("Shared4", MODE_PRIVATE);
        String name4= sh4.getString("NAME", "");
        if(name4.isEmpty()){
            text4.setText("Стандартное");
            button4.setText("Сохранить");

        }else {
            text4.setText(name4);
            button4.setText("Сохранить");


        }
    }

}

