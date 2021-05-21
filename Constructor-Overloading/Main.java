/*Develop an object oriented program in java to create a database of Covid_Patient information system containing the following information: 
Name, ID, Date of Birth, Blood group, Test_Report, Contact address, telephone number, Aadhar Number etc using Constructor Overloading*/

//Java program to create a database of Covid Patient information system.
class patient
{
    int id;
    String name;
    String blood_group;
    String test_report;
    String date_of_birth;
    String address;
    long telephone;
    long aadhar_no;
    patient(String name,int id,String date_of_birth,String blood_group,String test_report,String address,long telephone,long aadhar_no)
    {
        this.name=name;
        this.id=id;
        this.date_of_birth=date_of_birth;
        this.blood_group=blood_group;
        this.test_report=test_report;
        this.date_of_birth=date_of_birth;
        this.address=address;
        this.telephone=telephone;
        this.aadhar_no=aadhar_no;
    }
    patient(String name,String blood_group,String test_report,String date_of_birth,String address)
    {
        this.name=name;
        this.blood_group=blood_group;
        this.test_report=test_report;
        this.date_of_birth=date_of_birth;
        this.address=address;
        
    }
    public void display()
    {
        System.out.println("Name:"+name+"\nID number:"+id+"\nDate of birth:"+date_of_birth+"\nBlood group:"+blood_group+"\nTest report:"+test_report+"\nContact address:"+address+"\nTelephone number:"+telephone+"\nAadhar number:"+aadhar_no);
        System.out.println("");
    }
}
    public class Main {
    public static void main(String[] args)
    {
        System.out.println("Database of Covid patient information:");
        patient p1=new patient("Sahil","A+","Negative","06/12/2001","Hanuman Nagar,Akola");
        p1.display();
        
        patient p2=new patient("rahul","O+","Positive","06/1/2002","Ram Nagar,Akola");
        p2.display();
        
        patient p3=new patient("Shyam",12345,"07/2/2000","O-","Negative","Radhakrishna plot,Akola",91123456,1234567);
        p3.display();
        
        patient p4=new patient("Saurabh",12346,"23/5/2005","A+","Negative","Gandhi Road,Akola",9236776,1245132);
        p4.display();
        
        patient p5=new patient("Ramesh","B-","Positive","21/1/2007","Civil lines,Akola");
        p5.display();
        
        patient p6=new patient("Pramod",12347,"07/7/1996","B+","Negative","Umri,Akola",8124569,1352856);
        p6.display();
        
        patient p7=new patient("Atharva",12348,"15/5/2003","O-","Negative","Radhakrishna plot,Akola",80153456,1294267);
        p7.display();
        
        patient p8=new patient("Rakesh","A-","Positive","1/9/2000","Md ali road,Akola");
        p8.display();
        
        patient p9=new patient("Pratik","A+","Negative","9/9/1999","Raut wadi,Akola");
        p9.display();
        
        patient p10=new patient("Om",14397,"29/6/1995","B+","Negative","Sawant wadi,Akola",8129999,1362711);
        p10.display();
        
    }
    }
    
    


