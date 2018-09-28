package com.example.dsm2017.advice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dsm2017.teamproject.R;
import com.example.dsm2017.teamproject.writing;

public class advice extends AppCompatActivity {
    private Button btn_help;
    private Button btn_set;
    private TextView tex_interestarea;
    private TextView tex_setq;
    private TextView tex_managementa;
    private TextView tex_enquire;
    private TextView tex_reportbug;
    private TextView tex_terms;
    Intent intent=new Intent();//xml요소 변수 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);

        btn_help=(Button)findViewById(R.id.btn_help);
        btn_set=(Button)findViewById(R.id.btn_set);
        tex_interestarea=(TextView)findViewById(R.id.tex_interestarea);
        tex_setq=(TextView)findViewById(R.id.tex_setq);
        tex_managementa=(TextView)findViewById(R.id.tex_managementa);
        tex_enquire=(TextView)findViewById(R.id.tex_enquire);
        tex_reportbug=(TextView)findViewById(R.id.tex_reportbug);
        tex_terms=(TextView)findViewById(R.id.tex_terms);

        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               intent=new Intent(advice.this, help.class);
               startActivity(intent);
            }
        });

        tex_setq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(advice.this, writing.class);
                startActivity(intent);
            }
        });

        tex_enquire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(advice.this, writing.class);
                startActivity(intent);
            }
        });

        tex_managementa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(advice.this, mypage.class);
                startActivity(intent);
            }
        });
    }
}
