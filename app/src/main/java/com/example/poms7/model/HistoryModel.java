package com.example.poms7.model;

import com.example.poms7.view.historyItem;

import java.util.ArrayList;
import java.util.Collection;

public class HistoryModel {
    private static ArrayList<historyItem> historyList=new ArrayList();
    public static ArrayList<historyItem> getList(){
        return historyList;

    }
    public static void push(historyItem e){
        historyList.add(e);
    }
    public static void addAll(Collection<historyItem>e){
        historyList.addAll(e);
    }
}
