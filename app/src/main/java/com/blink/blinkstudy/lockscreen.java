package com.example.dsm2017.lockscreen;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.dsm2017.teamproject.R;

import java.util.Random;

public class lockscreen extends AppCompatActivity {

    TextView tv_question,btn_a1,btn_a2,btn_a3,btn_a4;
    TextView tv_advertisement;
    int [] answer_array = new int[4];
    String answer[]={"1","2","3","4"};
    String correct="1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lockscreen);
        Random random = new Random();

        tv_question= findViewById(R.id.tv_question);
        tv_advertisement=findViewById(R.id.tv_advertisement);
        btn_a1=findViewById(R.id.btn_a1);
        btn_a2=findViewById(R.id.btn_a2);
        btn_a3=findViewById(R.id.btn_a3);
        btn_a4=findViewById(R.id.btn_a4);



        tv_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Dialog 빌더 생성
                AlertDialog.Builder builder = new AlertDialog.Builder(lockscreen.this);
                //빌더 속성에서 타이틀 설정
                builder.setTitle("스킵하시겠습니까?");
                //빌더 속성에서 메세지 설정
                builder.setMessage("문제를 스킵하시겠습니까?\n" + "스킵 시 오답처리 됩니다.");

                //확인 버튼(긍정 버튼) 이름과 클릭 이벤트 처리
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                //취소 버튼(부정 버튼) 이름 설정 및 클릭 이벤트는 null로 설정
                builder.setNegativeButton("취소", null);
                //Dialog 보여주기
                builder.show();
            }
        });




        btn_a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        btn_a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    /*
    @Override
    public void onBackPressed() {
        //Dialog 빌더 생성
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //빌더 속성에서 타이틀 설정
        builder.setTitle("스킵하시겠습니까?");
        //빌더 속성에서 메세지 설정
        builder.setMessage("문제를 스킵하시겠습니까?\n" + "스킵 시 오답처리 됩니다.");

        //확인 버튼(긍정 버튼) 이름과 클릭 이벤트 처리
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });

        //취소 버튼(부정 버튼) 이름 설정 및 클릭 이벤트는 null로 설정
        builder.setNegativeButton("취소", null);
        //Dialog 보여주기
        builder.show();
    }
    */

}
