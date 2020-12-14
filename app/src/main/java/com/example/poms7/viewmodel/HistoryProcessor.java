package com.example.poms7.viewmodel;

import com.example.poms7.view.historyItem;
import com.example.poms7.model.HistoryModel;

import java.util.ArrayList;
import java.util.Collection;

public class HistoryProcessor {
    public static ArrayList<historyItem> getList(){
        return HistoryModel.getList();
    }
    public static void push(historyItem e){
        HistoryModel.push(e);
    }
    public static void addAll(Collection<historyItem>e){
        HistoryModel.addAll(e);
    }
}
