package com.blink.blinkstudy;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends Activity{

    private EditText id;
    private EditText password;
    private EditText passwordConfirm;
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regist);

        id = (EditText)findViewById(R.id.registID);
        password = (EditText)findViewById(R.id.registPassword);
        passwordConfirm = (EditText)findViewById(R.id.PasswordConfirm);
        nextBtn = (Button)findViewById(R.id.nextBtn);

        /// 비밀번호 일치 검사 ///
        passwordConfirm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String original = password.getText().toString();
                String confirm = passwordConfirm.getText().toString();

                if(original.equals(confirm)) {
                    password.setTextColor(Color.GREEN);
                    passwordConfirm.setTextColor(Color.GREEN);
                } else {
                    password.setTextColor(Color.RED);
                    passwordConfirm.setTextColor(Color.RED);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        /// 입력 여부 확인 ///
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( id.getText().toString().length() == 0 ) {
                    Toast.makeText(RegistrationActivity.this, "ID를 입력하세요", Toast.LENGTH_SHORT).show();
                    id.requestFocus();
                    return;
                }

                if( password.getText().toString().length() == 0 ) {
                    Toast.makeText(RegistrationActivity.this, "비밀번호를 입력하세요", Toast.LENGTH_SHORT).show();
                    password.requestFocus();
                    return;
                }

                if( passwordConfirm.getText().toString().length() == 0 ) {
                    Toast.makeText(RegistrationActivity.this, "비밀번호 확인을 입력하세요", Toast.LENGTH_SHORT).show();
                    passwordConfirm.requestFocus();
                    return;
                }
            }
        });
    }
}
