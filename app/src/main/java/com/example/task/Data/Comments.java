package com.example.task.Data;

public class Comments {
    private String creation_date;

    private String comment_id;

    private String body;

    public String getCreation_date ()
    {
        return creation_date;
    }

    public void setCreation_date (String creation_date)
    {
        this.creation_date = creation_date;
    }

    public String getComment_id ()
    {
        return comment_id;
    }

    public void setComment_id (String comment_id)
    {
        this.comment_id = comment_id;
    }

    public String getBody ()
    {
        return body;
    }

    public void setBody (String body)
    {
        this.body = body;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [creation_date = "+creation_date+", comment_id = "+comment_id+", body = "+body+"]";
    }
}