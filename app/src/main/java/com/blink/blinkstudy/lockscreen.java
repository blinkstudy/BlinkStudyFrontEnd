package com.example.dsm2017.lockscreen;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dsm2017.teamproject.ListActivity;
import com.example.dsm2017.teamproject.R;
import com.example.dsm2017.teamproject.writing;

import java.util.Random;

public class lockscreen extends AppCompatActivity {

    TextView tv_question,btn_a1,btn_a2,btn_a3,btn_a4;
    TextView tv_advertisement;
    int correct_c=0;
    int wrong_c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lockscreen);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
                | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);


        Random random = new Random();

        tv_question= findViewById(R.id.tv_question);
        tv_advertisement=findViewById(R.id.tv_advertisement);
        btn_a1=findViewById(R.id.btn_a1);
        btn_a2=findViewById(R.id.btn_a2);
        btn_a3=findViewById(R.id.btn_a3);
        btn_a4=findViewById(R.id.btn_a4);

        //정답체크를 위한 quest배열의 index 값
        final int index[]=new int[4];

        //문제와 정답을 파싱해오는 배열
        final String[] quest = getResources().getStringArray(R.array.q_answer1);

        //중복체크
        for(int i=0; i<4; i++) {
            index[i]=random.nextInt(4)+1;
        }
        int cnt=0;
        while (cnt == 0) {
            index[0] = random.nextInt(4)+1;
            index[1] = random.nextInt(4)+1;
            index[2] = random.nextInt(4)+1;
            index[3] = random.nextInt(4)+1;

            if (index[0] == index[1]) {
                index[1] = random.nextInt(4)+1;
                continue;
            }
            if (index[0] == index[2] || index[1] == index[2]) {
                index[2] = random.nextInt(4)+1;
                continue;
            }
            if (index[0] == index[3] || index[1] == index[3] || index[2] == index[3]) {
                index[3] = random.nextInt(4)+1;
                continue;
            }
            cnt++;
        }



        tv_question.setText(quest[0]);
        btn_a1.setText(quest[index[0]]);
        btn_a2.setText(quest[index[1]]);
        btn_a3.setText(quest[index[2]]);
        btn_a4.setText(quest[index[3]]);

        //틀린 문제 보내주기
        final String SendData[]=new String[5];

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
                if (quest[index[0]].equals(quest[1]) == true)
                {
                    correct_c++;
                    Toast.makeText(getApplicationContext(), "정답입니다!.", Toast.LENGTH_SHORT).show();
                    finish();
                }

                else
                {
                    wrong_c++;
                    Toast.makeText(getApplicationContext(), "오답입니다!.", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(lockscreen.this ,ListActivity.class);
                    SendData[0] = tv_question.getText().toString();
                    SendData[1] = btn_a1.getText().toString();
                    SendData[2] = btn_a2.getText().toString();
                    SendData[3] = btn_a3.getText().toString();
                    SendData[4] = btn_a4.getText().toString();
                    in.putExtra("tv_question",SendData[0]);
                    in.putExtra("btn_a1",SendData[1]);
                    in.putExtra("btn_a1",SendData[2]);
                    in.putExtra("btn_a1",SendData[3]);
                    in.putExtra("btn_a1",SendData[4]);
                    startActivity(in);
                    finish();
                }
            }
        });

        btn_a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quest[index[1]].equals(quest[1]) == true)
                {
                    correct_c++;
                    Toast.makeText(getApplicationContext(), "정답입니다!.", Toast.LENGTH_SHORT).show();
                    finish();
                }

                else
                {
                    wrong_c++;
                    Toast.makeText(getApplicationContext(), "오답입니다!.", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(lockscreen.this ,ListActivity.class);
                    SendData[0] = tv_question.getText().toString();
                    SendData[1] = btn_a1.getText().toString();
                    SendData[2] = btn_a2.getText().toString();
                    SendData[3] = btn_a3.getText().toString();
                    SendData[4] = btn_a4.getText().toString();
                    in.putExtra("tv_question",SendData[0]);
                    in.putExtra("btn_a1",SendData[1]);
                    in.putExtra("btn_a1",SendData[2]);
                    in.putExtra("btn_a1",SendData[3]);
                    in.putExtra("btn_a1",SendData[4]);
                    startActivity(in);
                    finish();
                }
            }
        });

        btn_a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quest[index[2]].equals(quest[1]) == true)
                {
                    correct_c++;
                    Toast.makeText(getApplicationContext(), "정답입니다!.", Toast.LENGTH_SHORT).show();
                    finish();
                }

                else
                {
                    wrong_c++;
                    Toast.makeText(getApplicationContext(), "오답입니다!.", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(lockscreen.this ,ListActivity.class);
                    SendData[0] = tv_question.getText().toString();
                    SendData[1] = btn_a1.getText().toString();
                    SendData[2] = btn_a2.getText().toString();
                    SendData[3] = btn_a3.getText().toString();
                    SendData[4] = btn_a4.getText().toString();
                    in.putExtra("tv_question",SendData[0]);
                    in.putExtra("btn_a1",SendData[1]);
                    in.putExtra("btn_a1",SendData[2]);
                    in.putExtra("btn_a1",SendData[3]);
                    in.putExtra("btn_a1",SendData[4]);
                    startActivity(in);
                    finish();
                }
            }
        });

        btn_a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quest[index[3]].equals(quest[1]) == true)
                {
                    correct_c++;
                    Toast.makeText(getApplicationContext(), "정답입니다!.", Toast.LENGTH_SHORT).show();
                    finish();
                }

                else
                {
                    wrong_c++;
                    Toast.makeText(getApplicationContext(), "오답입니다!.", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(lockscreen.this ,ListActivity.class);
                    SendData[0] = tv_question.getText().toString();
                    SendData[1] = btn_a1.getText().toString();
                    SendData[2] = btn_a2.getText().toString();
                    SendData[3] = btn_a3.getText().toString();
                    SendData[4] = btn_a4.getText().toString();
                    in.putExtra("tv_question",SendData[0]);
                    in.putExtra("btn_a1",SendData[1]);
                    in.putExtra("btn_a1",SendData[2]);
                    in.putExtra("btn_a1",SendData[3]);
                    in.putExtra("btn_a1",SendData[4]);
                    startActivity(in);
                    finish();
                }
            }
        });
    }

}
