package com.example.cj.videoeditor.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cj.videoeditor.R;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置button透明度
        Button recordBtn = (Button) findViewById(R.id.record_activity);
        recordBtn.setOnClickListener(this);
        Button selectBtn = (Button) findViewById(R.id.select_activity);
        selectBtn.setOnClickListener(this);
        Button audioBtn = (Button) findViewById(R.id.audio_activity);
        audioBtn.setOnClickListener(this);
        recordBtn.getBackground().setAlpha(80);
        selectBtn.getBackground().setAlpha(80);
        audioBtn.getBackground().setAlpha(80);
        //设置textview字体
        Typeface typeFace = Typeface.createFromAsset(getAssets(),"fonts/Pacifico-Regular.ttf");
        TextView txtshow=(TextView) findViewById(R.id.show);
        txtshow.setTypeface(typeFace);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.record_activity:
                startActivity(new Intent(MainActivity.this , RecordedActivity.class));
                break;
            case R.id.select_activity:
                startActivity(new Intent(MainActivity.this , VideoSelectActivity.class));
                break;
            case R.id.audio_activity:
                startActivity(new Intent(MainActivity.this , AudioEditorActivity.class));
                break;
        }
    }
}
