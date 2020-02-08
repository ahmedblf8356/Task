package com.example.task.Data;

public class Answers {
    private String is_accepted;

    private String last_activity_date;

    private String creation_date;

    private String title;

    private String body;

    private String answer_id;

    private String question_id;

    public String getIs_accepted ()
    {
        return is_accepted;
    }

    public void setIs_accepted (String is_accepted)
    {
        this.is_accepted = is_accepted;
    }

    public String getLast_activity_date ()
    {
        return last_activity_date;
    }

    public void setLast_activity_date (String last_activity_date)
    {
        this.last_activity_date = last_activity_date;
    }

    public String getCreation_date ()
    {
        return creation_date;
    }

    public void setCreation_date (String creation_date)
    {
        this.creation_date = creation_date;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getBody ()
    {
        return body;
    }

    public void setBody (String body)
    {
        this.body = body;
    }

    public String getAnswer_id ()
    {
        return answer_id;
    }

    public void setAnswer_id (String answer_id)
    {
        this.answer_id = answer_id;
    }

    public String getQuestion_id ()
    {
        return question_id;
    }

    public void setQuestion_id (String question_id)
    {
        this.question_id = question_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [is_accepted = "+is_accepted+", last_activity_date = "+last_activity_date+", creation_date = "+creation_date+", title = "+title+", body = "+body+", answer_id = "+answer_id+", question_id = "+question_id+"]";
    }
}