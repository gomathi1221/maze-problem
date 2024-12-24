import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int m,n;
      System.out.println("enter the row:");
      m=sc.nextInt();
      System.out.println("enter the column:");
      n=sc.nextInt();
      maze(0,0,n-1,m-1,"");
      
      
    }public static void maze(int i,int j,int n,int m,String p){
        if(i==n&&j==m){
            System.out.println(p);
        }
       if(i>n||j>m){
           return;
       }
            maze(i,j+1,n,m,p+"h");
        
       
            maze(i+1,j,n,m,p+"v");
            if(i<n&&j<m){
                maze(i+1,j+1,n,m,p+"d");
            }
        
    }
}