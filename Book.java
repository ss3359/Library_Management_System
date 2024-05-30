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

public class Book{
    
    
   public String title; 
   public  String author; 
   public  String genre; 
   private int year; 
   public  String[] BookTitles=new String[210];
   public String[] BookAuthors=new String[210];
   public  String[] BookGenres=new String[210];
  
   
   public Book(){
       int i=0; 
   try{
    BufferedReader reader = new BufferedReader(new FileReader("/Users/owner/Downloads/BookTitles.txt"));
    BufferedReader reader2 = new BufferedReader(new FileReader("/Users/owner/Downloads/BookAuthors"));
    BufferedReader reader3 = new BufferedReader(new FileReader("/Users/owner/Downloads/BookGenres"));

     String title, author, genre; 
     while((title=reader.readLine())!=null && (author=reader2.readLine())!=null && (genre=reader3.readLine())!=null){
        title=title.toLowerCase();
        author=author.toLowerCase(); 
        genre=genre.toLowerCase(); 
         
         BookTitles[i]=title;
         BookAuthors[i]=author; 
         BookGenres[i] = genre;
         i++; 
     }
    
       
      }catch(IOException e){
           e.printStackTrace();
       }
           
   }   
   
         
}      
           

