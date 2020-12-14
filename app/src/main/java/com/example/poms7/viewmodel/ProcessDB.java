package com.example.poms7.viewmodel;

import android.content.Context;

import androidx.room.Room;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.poms7.model.AppDatabase;
import com.example.poms7.model.History;
import com.example.poms7.model.HistoryDAO;

import java.util.List;

public class ProcessDB {
    public HistoryDAO historyDao;
    public ProcessDB(Context e){


        AppDatabase db =  Room.databaseBuilder(e.getApplicationContext(),
                AppDatabase.class, "HISTORY2")
                .allowMainThreadQueries()
                .build();
        historyDao=db.historyDAO();

    }

    public void insert(History e){
        historyDao.addHistory(e);
    }
    public String getDb(){
        List<History> historys = historyDao.getHistory();
        String result="";
        for(History obj:historys){
            result+= "Фрагмент:"+Integer.toString(obj.programs)+" Результат:"+obj.result+"\n";
        }
        return result;

    }

}
