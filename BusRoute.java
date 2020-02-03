import java.util.*;
import java.io.*;
public class BusRoute{
  public static void main(String []args) throws IOException{
    Scanner s=new Scanner(System.in);
    
    BufferedReader input=new BufferedReader(new FileReader("input.txt"));
    int totalStops,totalPass,index=0,time=0;
    
    String line=input.readLine();
    StringTokenizer num=new StringTokenizer(line);
    
    totalStops=Integer.parseInt(num.nextToken());
    totalPass=Integer.parseInt(num.nextToken());
    
    boolean[] route=new boolean [totalStops];

    int[] pass=new int[totalPass*2];
    line=input.readLine();
    do{
      num=new StringTokenizer(line);
      pass[index]=Integer.parseInt(num.nextToken());
      pass[index+1]=Integer.parseInt(num.nextToken());
      index+=2;
      line=input.readLine();
    }while(line!=null);
    index=1;
    
    for(int i=0;i<pass.length;i++){
      route[pass[i]-1]=true;
    }//for
    for(int i=0;i<route.length;i++){
      if(route[i]){
        time++;
      }
      
      if(time>10){
        time=0;
        index++;
      }

    }
    
    System.out.println("Bus #"+index);
        
    
    
  }
}