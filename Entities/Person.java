package Entities;
import java.io.*;
public class Person 
{
    String FirstName,temp;
    String LastName ;
    String Age;
    String ID;
    String Address;
    String Email;
    String Phone;

    protected Person(BufferedReader s)
    {
        try
        {
            FirstName = s.readLine();
            LastName = s.readLine();
            Age = s.readLine();
            ID = s.readLine();
            Address = s.readLine();
            Email = s.readLine();
            Phone = s.readLine();
        }
        catch (Exception e){
        }
    }

    public String getFirstName(){return FirstName;}
    public String getLastName(){return LastName;}
    public String getAge(){return Age;}
    public	String getID() {return ID;}
    public String getAddress() {return Address;}
    public String getEmail(){return Email;}
    public String getPhone() {return Phone;}
    public	void setEmail (String E) { this.Email= E;}
    public	void setPhone (String P ) {this.Phone = P;}
    public	void setAddress (String A) {this.Address= A;}
}