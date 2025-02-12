import java.util.Scanner;
class LTCode002 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n,r,rev=0;
    System.out.println("Enter Value:");
    n = scanner.nextInt();
    System.out.println("Before Reversing:"+n);
    while(n!=0){
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    
    System.out.println("After Reversing:"+rev);
    
    }
}