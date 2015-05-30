import java.util.Scanner;
public class Main {

    public static void asterisk(){
        System.out.println("*");
    }
    public static void horizontal_line()
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("\nEnter the number of asterisk required\n");
        n=s.nextInt();
        while(n>0) {
            System.out.print("* ");
            n--;
        }
    }
    public static void vertical_line()
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("\nEnter the number of asterisk required\n");
        n=s.nextInt();
        while(n>0) {
            System.out.println("*");
            n--;
        }
    }
    public static void right_triangle()
    {
        Scanner s=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the number of lines");
        n=s.nextInt();
        for(i=0;i<n;i++) {
            for (j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public static void isosceles()
    {
        Scanner scan=new Scanner(System.in);
        int i,s,n,j;
        System.out.println("Enter the number of lines\n ");
        n=scan.nextInt();
        for (i=0;i<n;i++) {
            for (s = 0; s < n - i; s++)
                System.out.print("  ");
            j = i * 2 + 1;
            while (j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
        }
    }
    public static void diamond()
    {
        Scanner scan=new Scanner(System.in);
        int n, j, i,s=1;
        System.out.println("Enter number of lines\n");
        n=scan.nextInt();
        s=n;
        for (i=0;i<n;i++)
        {
            for (j=0;j<s;j++)
                System.out.print(" ");
            s--;
            for (j=0;j<2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
        s=0;
        for (i=0;i<n;i++)
        {
            for (j=0;j<s;j++)
                System.out.print(" ");
            s++;
            for (j=0;j<2*(n-i)-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        asterisk();
        horizontal_line();
        vertical_line();
        right_triangle();
        isosceles();
        diamond();
    }
}
