package com.example.myapplication;

public class Question {
    private int id;
    private String content;
    private boolean trueAns;

    public Question() {}

    public Question(int id, String content, boolean trueAns) {
        this.id = id;
        this.content = content;
        this.trueAns = trueAns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isTrueAns() {
        return trueAns;
    }

    public void setTrueAns(boolean trueAns) {
        this.trueAns = trueAns;
    }
}
