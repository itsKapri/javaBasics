import java.util.*;
public class voidfunction{
  
  public static void sum(int a,int b){
        System.out.print(a+b);                   //sum of two number
          
        return;    //to not important to write return in void type it doesnt effect
  
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        sum(a,b);
    }
}
