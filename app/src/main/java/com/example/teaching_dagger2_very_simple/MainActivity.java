package com.example.teaching_dagger2_very_simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.teaching_dagger2_very_simple.DaggerComponent.DaggerGameComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public GameSession session;

    public TextView textView1;
    public TextView textView2;
    public TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.tv1);
        textView2 = (TextView) findViewById(R.id.tv2);
        textView3 = (TextView) findViewById(R.id.tv3);

        assignTextFromInjection();
        textView1.setText(session.data.firstString);
        textView2.setText(session.data.secondString);
        textView3.setText(session.data.thirdString);

    }

    public void assignTextFromInjection() {
            session = new GameSession();
            DaggerGameComponent.create().inject(session);
    }

}
