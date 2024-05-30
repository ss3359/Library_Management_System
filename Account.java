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
import java.lang.Object.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.stream.Collectors;

public class Account extends Book {

    private String id;
    private String password;
    private List<String> CheckOutList;

    public Account() {
        Scanner s = new Scanner(System.in);
        Scanner s2=new Scanner(System.in); 

        String title, author, genre;

        System.out.println();
        System.out.println("Enter a title and/or author. ");
        title = s.nextLine();
        author = s.nextLine();

        title = title.toLowerCase();
        author = author.toLowerCase();

        SearchBook(title, author);
        
        System.out.println("\nWould You Like To Check Out A Book?");
        String decision=s2.nextLine(); 
        
        if(decision.equals("yes")){
             System.out.println("Enter a title and/or author for the checkout book. ");
             title = s2.nextLine();
             author = s2.nextLine();

             title = title.toLowerCase();
             author = author.toLowerCase();
             CheckOutABook(title);
        }
        

    }
    
    public String GetBookFromTheList(String title, String author, int position) {

        return BookTitles[position] + BookAuthors[position] + "\t";
    }

    public void SearchBook(String titleSearch, String authorSearch) {

        int books = 0;
        if (titleSearch == "") {
            for (int i = 0; i < BookAuthors.length; i++) {
                if (BookAuthors[i].contains(authorSearch)) {
                    System.out.println(BookTitles[i] + "\t" + BookAuthors[i]);
                    books++;
                }
            }
        } else if (authorSearch == "") {
            for (int i = 0; i < BookTitles.length; i++) {
                if (BookTitles[i].contains(titleSearch)) {
                    System.out.println(BookTitles[i] + "\t" + BookAuthors[i]);
                    books++;
                }
            }
        } else {
            for (int position = 0; position < BookTitles.length; position++) {
                if ((BookTitles[position].contains(titleSearch))
                        && (BookAuthors[position].contains(authorSearch))) {

                    System.out.println(BookTitles[position] + "\t" + BookAuthors[position]);
                    books++;
                }
            }
        }

        System.out.println("Results: " + books);
    }
    public void CheckOutABook(String titleSearch){
    for(int i=0; i<BookTitles.length; i++){
        if(BookTitles[i].contains(titleSearch))
            System.out.println("Checked Out: "+BookTitles[i]+ " by "+BookAuthors[i]);
            BookTitles[i]="UNAVAILABLE";
    }


  }   

}

