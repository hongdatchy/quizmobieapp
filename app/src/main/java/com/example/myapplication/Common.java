package com.example.myapplication;

import java.util.Arrays;
import java.util.List;

public class Common {
    public  static List<Question> questions = Arrays.asList(
            new Question(1, "Dat co dep trai khong", false),
            new Question(2, "Thay Tuan co dep trai khong", true),
            new Question(3, "Thay Tuan day co hay khong", true)
    );
}
