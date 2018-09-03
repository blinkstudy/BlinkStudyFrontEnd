package com.example.dsm2017.teamproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.AdapterView.*;

public class writing extends AppCompatActivity {

    private Spinner spinner;
    private  EditText title, content;
    private Button button;//xml요소 변수 선언

    private String Type;//글의 종류 값을 넘기기 위한 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writing);//레이아웃 속성 가져오기

        title=(EditText) findViewById(R.id.title);
        content=(EditText) findViewById(R.id.content);
        button =(Button) findViewById(R.id.button);
        spinner = (Spinner)findViewById(R.id.sp_List);//

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.List,R.layout.support_simple_spinner_dropdown_item);//리스트 가져오기
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);//스피너 형식
        spinner.setAdapter(adapter);//스피너 어뎁터 연결

        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {//글 형식 스피너 클릭 이벤트
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"선택된 속성 : " + parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show();
                Type = (String) spinner.getItemAtPosition(position);//선택한 속성값 변수 처리
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "속성이 선택되지 않았습니다", Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnClickListener(new Button.OnClickListener() {//글 제출하기 버튼 클릭 이벤트
            @Override
            public void onClick(View v) {
            //데이터 이동 테스트 - 나중에 없애고 다른 이벤트를 적용해야함.
                if(title!=null && content!=null && Type!=null) {
                    Intent in = new Intent(writing.this ,ListActivity.class);
                    String Title = title.getText().toString();
                    String Content = content.getText().toString();
                    in.putExtra("Title",Title);
                    in.putExtra("Content",Content);
                    in.putExtra("Type",Type);
                    startActivity(in);
                }
                else {
                    Toast.makeText(getApplicationContext(), "입력되지 않은 요소가 있습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
