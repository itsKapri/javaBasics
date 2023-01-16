import java.util.*;
public class returntype {
    public static int sum(int a,int b){
        //int k=a+b;
        //return k;
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int z=sum(a,b);
        System.out.print(z);
    }
}
