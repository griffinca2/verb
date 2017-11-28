package com.example.mbikism.verb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class np2 extends AppCompatActivity {
    Button questionOneP, questionOneA, questionOneE, questionOneY, questionOneS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_np2);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        questionOneA = (Button) findViewById(R.id.NP1);
        questionOneA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Count.npCount = Count.npCount + 1;
                Intent intent = new Intent(np2.this, nq3.class);
                startActivity(intent);
            }
        });
        questionOneY = (Button) findViewById(R.id.NP2);
        questionOneY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Count.npCount = Count.npCount + 4;
                Intent intent = new Intent(np2.this, nq3.class);
                startActivity(intent);
            }
        });
        questionOneE = (Button) findViewById(R.id.NP3);
        questionOneE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Count.npCount = Count.npCount + 2;
                Intent intent = new Intent(np2.this, nq3.class);
                startActivity(intent);
            }
        });

        questionOneP = (Button) findViewById(R.id.NP4);
        questionOneP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Count.npCount = Count.npCount + 3;
                Intent intent = new Intent(np2.this, nq3.class);
                startActivity(intent);
            }
        });
        questionOneS = (Button) findViewById(R.id.NP5);
        questionOneS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Count.npCount = Count.npCount + 5;
                Intent intent = new Intent(np2.this, nq3.class);
                startActivity(intent);
            }
        });
    }
}