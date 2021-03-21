//Java program to calculate grade of student
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        System.out.println("enter number of students in the class");
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        System.out.println("enter number of subjects");
        Scanner s=new Scanner(System.in);
        char grade;
        int n=s.nextInt();
        int m=0;
        int marks[]=new int[n];
        for(int j=1;j<=N;j++)
        {
            System.out.println("Enter marks of student"+j);
            for(int i=0;i<n;i++)
            
           {
               
               marks[i]=s.nextInt();
               m+=marks[i];
           }
         
            double avg=m/n;
            
            if(avg>=80)
            
            {
                
               grade='A';
            }
            else if(avg<80 && avg>=60)
            
           {
               grade='B';
           }
           else
           {
               grade ='C';
           }
           
           System.out.println("grade achieved by student is "+grade+"\n");
        }
    }
}
    

