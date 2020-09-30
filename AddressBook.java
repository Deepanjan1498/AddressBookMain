import java.util.ArrayList;
public class AddressBook
{
        int numOfContact=0;
        private Contacts[] contactArray;

        public AddressBook()
        {
                contactArray=new Contacts[10];
        }
        public void addNewContact(String firstName,String lastName,int phoneNumber,String emailId,String address,long zipcode,String city,String state)
        {
                contactArray[numOfContact]=new Contacts(firstName,lastName,phoneNumber,emailId,address,zipcode,city,state);
                System.out.println(contactArray[numOfContact]);
                numOfContact++;
        }

        public static void main(String args[])
        {
                AddressBook Contactno1=new AddressBook();
                Contactno1.addNewContact("Sandeep","Kumar",1456320215,"Sandeep@gmail.com","Adityapur",831014,"Jamshedpur","Jharkhand");
                Contactno1.addNewContact("Vikash","Sharma",1356890699,"Rahul@gmail.com","Sakchi",831017,"Jamshedpur","Jharkhand");
                Contactno1.addNewContact("Akash","Singh",1234580699,"SinghAK@gmail.com","Wasseypur",831025,"Dhanbad","Jharkhand");
        }
}


