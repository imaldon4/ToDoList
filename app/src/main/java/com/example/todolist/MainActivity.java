package com.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEnterText;
    private TextView mTextItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextItemList = findViewById(R.id.text_item_list);
        if(mTextItemList.getVisibility() == View.VISIBLE){
            mTextItemList.setText(mEnterText.getText().toString());
            mTextItemList.setVisibility(View.VISIBLE);
        }
    }

    public void enterItem(View view) {
        
    }
}
