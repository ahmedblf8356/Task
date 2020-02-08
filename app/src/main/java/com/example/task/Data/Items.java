package com.example.task.Data;

import java.util.List;

public class Items {
    private Owner owner;

    private List<Comments> comments;

    private List<Answers> answers;

    private String link;

    private String last_activity_date;

    private boolean is_answered;

    private String creation_date;

    private String answer_count;

    private String title;

    private String body;

    private String question_id;

    private String view_count;

    private String last_edit_date;

    public Owner getOwner ()
    {
        return owner;
    }

    public void setOwner (Owner owner)
    {
        this.owner = owner;
    }

    public List<Comments> getComments ()
    {
        return comments;
    }

    public void setComments (List<Comments> comments)
    {
        this.comments = comments;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public String getLast_activity_date ()
    {
        return last_activity_date;
    }

    public void setLast_activity_date (String last_activity_date)
    {
        this.last_activity_date = last_activity_date;
    }

    public boolean getIs_answered ()
    {
        return is_answered;
    }

    public void setIs_answered (boolean is_answered)
    {
        this.is_answered = is_answered;
    }

    public String getCreation_date ()
    {
        return creation_date;
    }

    public void setCreation_date (String creation_date)
    {
        this.creation_date = creation_date;
    }

    public String getAnswer_count ()
    {
        return answer_count;
    }

    public void setAnswer_count (String answer_count)
    {
        this.answer_count = answer_count;
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

    public String getQuestion_id ()
    {
        return question_id;
    }

    public void setQuestion_id (String question_id)
    {
        this.question_id = question_id;
    }

    public String getView_count ()
    {
        return view_count;
    }

    public void setView_count (String view_count)
    {
        this.view_count = view_count;
    }

    public String getLast_edit_date ()
    {
        return last_edit_date;
    }

    public void setLast_edit_date (String last_edit_date)
    {
        this.last_edit_date = last_edit_date;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [owner = "+owner+", comments = "+comments+", link = "+link+", last_activity_date = "+last_activity_date+", is_answered = "+is_answered+", creation_date = "+creation_date+", answer_count = "+answer_count+", title = "+title+", body = "+body+", question_id = "+question_id+", view_count = "+view_count+", last_edit_date = "+last_edit_date+"]";
    }
}