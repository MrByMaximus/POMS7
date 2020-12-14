package com.example.poms7.view;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.poms7.R;
import com.example.poms7.viewmodel.HistoryProcessor;
import com.example.poms7.viewmodel.ProcessDB;

public class ShowDatabase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_database);

    }
    public void OnClickShow(View v){
        ProcessDB a=new ProcessDB(this);
        TextView textView=(TextView)findViewById(R.id.showDatabase_textView);
        textView.setText(a.getDb());

    }
}