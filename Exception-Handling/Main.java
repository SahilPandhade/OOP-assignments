import java.util.*;

class InvalidCarException extends Exception{

InvalidCarException(String a){

super(a);

}

}

public class Main{

static class InvalidCityException extends Exception{

InvalidCityException(String s){

super(s);

}

}

static void validatecity(String c) throws InvalidCityException{

if(c.matches("Pune")){

System.out.println("You have entered a valid city");

}

else if(c.matches("Mumbai")){

System.out.println("You have entered a valid city");

}

else if(c.matches("Bangalore")){

System.out.println("You have entered a valid city");

}

else if(c.matches("Chennai")){

System.out.println("You have entered a valid city");

}

else{

throw new InvalidCityException("Sorry you have entered a wrong city");

}

}

static void validatecar(String v) throws InvalidCarException{

if(!v.matches("Four")){

throw new InvalidCarException("Sorry you have entered wrong vehicle type");

}

else 

System.out.println("You have entered correct vehicle type");

} 

public static void main(String[] args) {

String city = null;

String vehicle = null;

Scanner s = new Scanner(System.in);

System.out.println("Enter City : ");

city = s.nextLine();

System.out.println("Enter the type of vehicle  : ");

vehicle = s.nextLine();

try{

validatecity(city);

}catch(InvalidCityException c){

System.out.println("Exception Occured! "+c);

}

try{

validatecar(vehicle);

}

catch(InvalidCarException v){

System.out.println("Exception Occured! "+v);

}

System.out.println("Thankyou!!");

System.out.println("**********");

s.close();

}

}
