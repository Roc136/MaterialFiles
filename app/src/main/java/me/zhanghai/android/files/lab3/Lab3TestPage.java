package me.zhanghai.android.files.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.Random;

import me.zhanghai.android.files.R;
import me.zhanghai.android.files.app.AppActivity;

public class Lab3TestPage extends AppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_test_page);
    }

    public void clickTestButton(View view) {
        Log.d("lab3", "Click Test Button:" + String.valueOf(view.getId()));
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        view.setBackgroundColor(Color.rgb(r, g, b));
    }

    public void clickBackButton(View view) {
        Log.d("lab3", "Click Back Button");
        finish();
    }
}