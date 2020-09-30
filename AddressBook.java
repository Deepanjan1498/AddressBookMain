
import java.util.*;
public class AddressBook
{
	Scanner sc=new Scanner(System.in);
	private ArrayList<Contacts> contactArray;
	private Map<String,Contacts> contactMap;
	public AddressBook()
	{
		contactArray=new ArrayList<>();
		contactMap=new HashMap<>();
	}
	public void addNewContact(String firstName,String lastName,int phoneNumber,String emailId,String address,long zipcode,String city,String state)
	{
		Contacts obj=new Contacts(firstName,lastName,phoneNumber,emailId,address,zipcode,city,state);
		contactArray.add(obj);
		contactMap.put(firstName,obj);
	}
	public void printContact()
	{
	System.out.println(contactArray);
	}
	public void deleteContact()
	{
		System.out.println("Enter The First Name to delete the contact details");
		String fn=sc.nextLine();
		Contacts obj=contactMap.get(fn);
		contactArray.remove(obj);
	}
	public static void main(String args[])
	{
		AddressBook Contactno1=new AddressBook();
		Contactno1.addNewContact("Sandeep","Kumar",1456320215,"Sandeep@gmail.com","Adityapur",831014,"Jamshedpur","Jharkhand");
        Contactno1.addNewContact("Vikash","Sharma",1356890699,"Rahul@gmail.com","Sakchi",831017,"Jamshedpur","Jharkhand");
		Contactno1.printContact();
		Contactno1.deleteContact();
		System.out.println("After deleting:");
		Contactno1.printContact();
	}
}

