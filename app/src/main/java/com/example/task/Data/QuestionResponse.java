package com.example.task.Data;

import java.util.List;

public class QuestionResponse {
    private List<Items> items;

    private boolean has_more;

    private int quota_max;

    private int quota_remaining;

    public void setItems(List<Items> items){
        this.items = items;
    }
    public List<Items> getItems(){
        return this.items;
    }
    public void setHas_more(boolean has_more){
        this.has_more = has_more;
    }
    public boolean getHas_more(){
        return this.has_more;
    }
    public void setQuota_max(int quota_max){
        this.quota_max = quota_max;
    }
    public int getQuota_max(){
        return this.quota_max;
    }
    public void setQuota_remaining(int quota_remaining){
        this.quota_remaining = quota_remaining;
    }
    public int getQuota_remaining(){
        return this.quota_remaining;
    }
}
