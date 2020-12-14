package com.example.poms7.view;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.poms7.R;
import com.example.poms7.model.History;
import com.example.poms7.viewmodel.FragmentsProcessor;
import com.example.poms7.viewmodel.ProcessDB;

public class SecondFragment extends Fragment {
    View view;
    private EditText input3;
    private EditText input4;
    public TextView Result;
    public String TextResult;
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_second, container, false);

        input3=view.findViewById(R.id.input3);
        input4=view.findViewById(R.id.input4);
        Result=view.findViewById(R.id.textResult2);
        button1=view.findViewById(R.id.button1);
        button2=view.findViewById(R.id.button5);
        button3=view.findViewById(R.id.button6);
        button4=view.findViewById(R.id.button4);

        if (TextResult!=null){
            Result.setText(TextResult);
        }
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (input3.getText().toString().equals("") || input4.getText().toString().equals("")) {
                            Result.setText("Данные не введены");
                            Toast.makeText(getActivity(),Result.getText(),Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Integer A=Integer.parseInt(input3.getText().toString());
                            Integer B=Integer.parseInt(input4.getText().toString());
                            TextResult=Integer.toString(A+B);

                            ProcessDB a=new ProcessDB(getActivity());
                            History historyDB = new History(2,TextResult);
                            a.insert(historyDB);

                            Result.setText(TextResult);
                            MainActivity parent = (MainActivity)getActivity();
                            historyItem history=new historyItem("Результат 2 фрагмента\n"+TextResult);
                            parent.addHistory(history);
                            Toast.makeText(getActivity(),Result.getText(),Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (input3.getText().toString().equals("") || input4.getText().toString().equals("")) {
                            Result.setText("Данные не введены");
                            Toast.makeText(getActivity(),Result.getText(),Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Integer A=Integer.parseInt(input3.getText().toString());
                            Integer B=Integer.parseInt(input4.getText().toString());
                            TextResult=Integer.toString(A-B);

                            ProcessDB a=new ProcessDB(getActivity());
                            History historyDB = new History(2,TextResult);
                            a.insert(historyDB);

                            Result.setText(TextResult);
                            MainActivity parent = (MainActivity)getActivity();
                            historyItem history=new historyItem("Результат 2 фрагмента\n"+TextResult);
                            parent.addHistory(history);
                            Toast.makeText(getActivity(),Result.getText(),Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (input3.getText().toString().equals("") || input4.getText().toString().equals("")) {
                            Result.setText("Данные не введены");
                            Toast.makeText(getActivity(),Result.getText(),Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Integer A=Integer.parseInt(input3.getText().toString());
                            Integer B=Integer.parseInt(input4.getText().toString());
                            TextResult=Integer.toString(A*B);

                            ProcessDB a=new ProcessDB(getActivity());
                            History historyDB = new History(2,TextResult);
                            a.insert(historyDB);

                            Result.setText(TextResult);
                            MainActivity parent = (MainActivity)getActivity();
                            historyItem history=new historyItem("Результат 2 фрагмента\n"+TextResult);
                            parent.addHistory(history);
                            Toast.makeText(getActivity(),Result.getText(),Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (input3.getText().toString().equals("") || input4.getText().toString().equals("")) {
                            Result.setText("Данные не введены");
                            Toast.makeText(getActivity(),Result.getText(),Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Integer A=Integer.parseInt(input3.getText().toString());
                            Integer B=Integer.parseInt(input4.getText().toString());
                            TextResult=Integer.toString(A/B);

                            ProcessDB a=new ProcessDB(getActivity());
                            History historyDB = new History(2,TextResult);
                            a.insert(historyDB);

                            Result.setText(TextResult);
                            MainActivity parent = (MainActivity)getActivity();
                            historyItem history=new historyItem("Результат 2 фрагмента\n"+TextResult);
                            parent.addHistory(history);
                            Toast.makeText(getActivity(),Result.getText(),Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

        return view;
    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("result2",TextResult);
    }
}