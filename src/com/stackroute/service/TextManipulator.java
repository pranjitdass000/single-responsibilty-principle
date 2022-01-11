package com.stackroute.service;

import com.stackroute.entity.Author;
import com.stackroute.entity.Length;
import com.stackroute.entity.Text;

public class TextManipulator {


    public boolean textEditor(Text text, Author author, Length length) {
        System.out.println("The text is created by" + " " + author + " " + text + " " + length);
        return true;
    }



}
