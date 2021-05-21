/*Create User defined exception to check the following conditions and throw the exception if the criterion does not meet.
a. User stays in Pune/ Mumbai/ Bangalore / Chennai
b. User has 4-wheeler
Accept City, Vehicle from the user and check for the conditions mentioned above.
If any of the condition not met then throw the exception. If user does not enter proper input throw the exception*/

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
