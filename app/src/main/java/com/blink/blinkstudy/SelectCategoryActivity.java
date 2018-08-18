package com.blink.blinkstudy;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class SelectCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_category);

        ListView listview ;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.category_list);
        listview.setAdapter(adapter);

        // TODO:아이템 추가 필요. 현재는 테스트 용도
        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.moon),
                "Box", "Account Box Black 36dp") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.moon),
                "Circle", "Account Circle Black 36dp") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.moon),
                "Ind", "Assignment Ind Black 36dp") ;
    }
}
