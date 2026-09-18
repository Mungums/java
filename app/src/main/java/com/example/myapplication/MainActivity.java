package com.example.myapplication;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText editTextText1;
    Button button1;
    Button button2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        setContentView(R.layout.activity_main);
        Log.v("TAG", "Создание экрана");
        editTextText1 = findViewById(R.id.editTextText1);
        if (editTextText1 == null) {
            Log.e("TAG", "editTextText1 не найден");
        }
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);

        Log.i("TAG", "Экран успешно инициализирован");

        button1.setOnClickListener(v -> {
            textView.setText(editTextText1.getText().toString());
            Log.d("TAG", "Нажата кнопка 1");
            Log.d("TAG", "получен текст из editText1: " + editTextText1.getText().toString() + "перенесены в textView");
        });

        button2.setOnClickListener(v -> {
            String text = editTextText1.getText().toString();
            if (text.isEmpty()) {
                Log.w("TAG","Кнопка 2 нажата с пустым полем ввода");
                return;
            }
        });
    }
}