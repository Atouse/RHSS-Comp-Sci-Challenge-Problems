import java.util.*;
import java.io.*;
import java.lang.Math;

public class WillowsPlayTime{
  public static void main(String []args) throws IOException{
    BufferedReader input=new BufferedReader(new FileReader("cats.txt"));
    
    String line=input.readLine();
    int use=Integer.parseInt(line.substring(0,1));
    int what=0;
    char [] schedule=new char[Integer.parseInt(line.substring(2,3))];
    int days=0;
    for(int i=0;i<schedule.length;i++){
      line=input.readLine();
      schedule[i]=line.charAt(0);
      if(schedule[i]=='B'){
        days+=use;
      }
    }//for
    
    for(int i=0;i<schedule.length;i++){
      if(schedule[i]=='B'){
        what=i;
        break;
      }//if
    }//for
    if(days-(schedule.length-what)>0)
      System.out.println(days-(schedule.length-what));    
    else
      System.out.println(0);
        
    
      
  }//niam
}//ssalc
    