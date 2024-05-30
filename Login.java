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


public class Login {
    
    
    public String username;
    public String password; 
    
    public Login(){
        
        String u,p; 
        Scanner s=new Scanner(System.in); 
        System.out.println("Enter A Username and Password");
        u=s.nextLine(); p=s.nextLine(); 
        
    
        CheckUserNameAndPassWord(u,p); 
    }
    
    public void CheckUserNameAndPassWord(String u,String p){
       String checkUser,checkPass;
        try{
            BufferedReader r1 = new BufferedReader(new FileReader("/Users/owner/Downloads/2USERNAMES.txt")); 
            BufferedReader r2 = new BufferedReader(new FileReader("/Users/owner/Downloads/10k-most-common.txt")); 
            
            while((checkUser=r1.readLine())!=null&&(checkPass=r2.readLine())!=null){
                if(u.contentEquals(checkUser)&&p.contentEquals(checkPass)){
                    System.out.println("Login Sucessfull! ");
                    Account a=new Account(); 
                }
            }

        }catch(IOException e){
           e.printStackTrace();
       }
    
    }
     public static void main(String args[]) {

        Login l = new Login();
        

    }
}
