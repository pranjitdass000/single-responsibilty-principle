package com.stackroute;

import com.stackroute.entity.Author;
import com.stackroute.entity.Length;
import com.stackroute.entity.Text;
import com.stackroute.service.TextManipulator;

public class Main {
    public static void main(String[] args) {
        Text text1 = new Text("welcome to my world");
        Author author1 = new Author("pranjit");
        Length length1 = new Length(20);

        TextManipulator textManipulator = new TextManipulator();
      boolean newText =textManipulator.textEditor(text1,author1,length1);
      if(newText){
          System.out.println("text created");

      }



    }
}
