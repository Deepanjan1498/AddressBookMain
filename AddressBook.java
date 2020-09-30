
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
	public void addNewContact()
	{
		System.out.println("Enter the First Name");
		String firstname=sc.next();
		System.out.println("Enter the last Name");
		String lastname=sc.next();
		System.out.println("Enter the PhoneNumber");
		int phoneNumber=sc.nextInt();
		System.out.println("Enter the EmailId");
		String emailId=sc.next();
		System.out.println("Enter the Address");
		String address=sc.next();
		System.out.println("Enter the Zipcode");
		long zipcode=sc.nextLong();
		System.out.println("Enter the City");
		String city=sc.next();
		System.out.println("Enter the State");
		String state=sc.next();
		
		
		Contacts obj=new Contacts(firstname,lastname,phoneNumber,emailId,address,zipcode,city,state);
		contactArray.add(obj);
		contactMap.put(firstname,obj);
	}
	public void printContact()
	{
	System.out.println(contactArray);
	}
	public void deleteContact()
	{
		System.out.println("Enter The First Name of the contact to be deleted");
		String fn=sc.nextLine();
		Contacts obj=contactMap.get(fn);
		contactArray.remove(obj);
	}
	public static void main(String args[])
	{
		Scanner sd =new Scanner(System.in);
		AddressBook Contactno1=new AddressBook();
		while(true)
		{
		System.out.println("Do You Want to Add New Contact(Y/N)");
		char choice=sd.next().charAt(0);
			if(choice=='Y')
			{
			Contactno1.addNewContact();
			Contactno1.printContact();
			}
			else
			System.exit(0);
		}
	}
}

