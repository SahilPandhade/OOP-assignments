/*Derive a subclass called Student from the superclass Computer_Engg. The class Student inherits all the member variables 
(Name,Roll_Number,GR_Number,hobbies,etc) and methods ( getGR(), getName(), among others)from its superclass Computer_Engg, 
also further defines a variable called area_of_interest,marks & two public methods getmarks() and getarea_of_interest().*/

class Computer_Engg{
    private String Name="Sahil";
    private String Roll_No="222047";
    private String Gr_No="21910635";
    private String hobby="Reading";
    private String college="VIIT";
    public String getName()
    {
        return Name;
    }
    protected void setName(String Name)
    {
        this.Name=Name;
    }
    public String getGr_No()
    {
        return Gr_No;
    }
    protected void setGr_No(String Gr_No)
    {
        this.Gr_No=Gr_No;
    }
    public String getRoll_No()
    {
        return Roll_No;
    }
    protected void setRoll_No(String Roll_No)
    {
        this.Roll_No=Roll_No;
    }
    public String gethobby()
    {
        return hobby;
    }
    protected void sethobby(String hobby)
    {
        this.hobby=hobby;
    }
    public String getcollege()
    {
        return college;
    }
    protected void setcollege(String college)
    {
        this.college=college;
    }
    
    
}

public class Main extends Computer_Engg{
    int marks=90;
    String area_of_interest="Computer Science";
    public int getmarks()
    {
        return marks;
    }
    protected void setmarks(int marks)
    {
        this.marks=marks;
    }
    public String getarea_of_interest()
    {
        return area_of_interest;
    }
    protected void setarea_of_interest(String area_of_interest)
    {
        this.area_of_interest=area_of_interest;
    }
    public static void main(String args[]){
        Main obj=new Main();
        System.out.println("Name:"+obj.getName());
        System.out.println("Roll No:"+obj.getRoll_No());
        System.out.println("Gr No:"+obj.getGr_No());
        System.out.println("Hobby:"+obj.gethobby());
        System.out.println("College Name:"+obj.getcollege());
        System.out.println("Marks:"+obj.getmarks());
        System.out.println("Area of interest:"+obj.getarea_of_interest());
        
        
    }
    
    
}



