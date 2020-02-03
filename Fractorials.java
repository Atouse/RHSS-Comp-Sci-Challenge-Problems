import java.io.*;

public class Fractorials{
  public static void main(String[]args) throws IOException{
    BufferedReader input= new BufferedReader(new FileReader("Fractorial.txt"));
    
    int [] nums=new int[5];
    String num=input.readLine();
    
    for (int i=0;i<5;i++){
      nums[i]=Integer.parseInt(num.substring(0,1));
      num=input.readLine();
    }//for 
    
    System.out.println(fractorial(23));
    
  }//niam
  public static int fractorial(int x){
    if(x==1)
      return 1;
    int y;
    int z;
    if(x<=4){
      y=2;
      z=2;
    }
    else{
      y=10;
      z=10;
      }
    for(int i=z;i<factorial(x);i+=y){
      if(check(x,i))
        return i;
      
    }//for
    return 0;
  }//fractorial method
  
  public static boolean check(int x,int y){
    int counter=0;
    for(int i=1;i<=x;i++){
      if(y%i==0)
        counter++;
    }
    if(counter==x)
      return true;
    
    return false;
  }
      
  public static double factorial(int x){
    double factorial=1;
    for(double i=1;i<=x;i++){
      factorial*=i;
    }
    return factorial;
  }//factorial method
}//ssalc