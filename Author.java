/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Author extends Book {

    private String name;
    private String title;
    private String description;

    private void SetAuthor() {
        author = name;
    }

    public void CheckOutBook() {
        Scanner s = new Scanner(System.in);

        System.out.println("Check Out A Book? Enter A Book");
        title = s.next();

        for (int i = 0; i < BookTitles.length; i++) {
            if (BookTitles[i] == title) {
                System.out.println("Check out: " + title);
                break;
            }

        }

    }
    
  

}
