/*Rahul, Rohit. Rohan wants to take a loan from Banks; they approach different banks having differ ROI rates of interest. 
Rahul approached SBI where Rohit and Rohan approached HDFC and ICICI respectively the ROI of SBI,HDFC,ICICI is 8.4%, 7.3%, 9.7%. 
While each bank has a class which provides a common method getrateofinterest().Calculate the rate of interest Rahul, Rohit and 
Rohan pays to banks for the loan of 5 Lakh Rs. each.Assume the required variable for calculating ROI */

import java.util.Scanner;
class Bank{
    int amount;
    double rate;
    int period;
    
    Bank()
    {
        amount=500000;
        rate=0;
        period=0;
    }
    
    void getdetails()
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter the period of loan:");
        period=s.nextInt();
    }
    void getinterest()
    {
        
        System.out.println("Interest paid is : "+(amount*period*rate)/100);
    }
    
}
class SBI extends Bank{
    double rate;
    SBI()
    {
        rate=8.4;
        
    }
    void getinterest()
    {
        this.getdetails();
        System.out.println("Interest paid by Rahul on amt is : "+(amount*period*rate)/100);
    }
}
class HDFC extends Bank{
    double rate;
    HDFC()
    {
        rate=7.3;
        
    }
    void getinterest()
    {
        this.getdetails();
        System.out.println("Interest paid by Rohit on amt is : "+(amount*period*rate)/100);
    }
}
class ICICI extends Bank{
    double rate;
    ICICI()
    {
        rate=9.7;
        
    }
    void getinterest()
    {
        this.getdetails();
        System.out.println("Interest paid by Rohan on amt is : "+(amount*period*rate)/100);
    }
}

public class Main{
    public static void main(String []args){
        int choice;
        Bank loan=new Bank();
        
        Scanner s=new Scanner(System.in);
        System.out.println("Default Loan amount:500000\n");
        System.out.println("Enter your Choice:\n1.SBI\n2.HDFC\n3.ICICI\n");
        choice=s.nextInt();
        switch(choice)
        {
        case 1:
            loan=new SBI();
            
            break;
        case 2:
            loan=new HDFC();
            
            break;
        case 3:
            loan=new ICICI();
            
            break;
        default:
        System.out.println("Error!");
        }
        loan.getinterest();
        
    }
}



