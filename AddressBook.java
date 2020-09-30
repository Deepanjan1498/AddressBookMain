
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
	public void editContact()
	{
		System.out.println("Enter The First Name to edit the contact details");
		String fn=sc.nextLine();
		Contacts obj=contactMap.get(fn);
		System.out.println();
		System.out.println("Enter the PhoneNumber");
		int num=sc.nextInt();
		obj.setPhoneNumber(num);
		System.out.println("Enter the Email");
		String emId=sc.next();
		obj.setEmailId(emId);
		System.out.println("Enter the Address");
		String add=sc.next();
		obj.setAddress(add);
		System.out.println("Enter the Zipcode");
		long zip=sc.nextLong();
		obj.setZipcode(zip);
		System.out.println("Enter the City");
		String cit=sc.next();
		obj.setCity(cit);
		System.out.println("Enter the State");
		String sta=sc.next();
		obj.setState(sta);
		
	}
	public static void main(String args[])
	{
		AddressBook Contactno1=new AddressBook();
		Contactno1.addNewContact("Rohit","Singh",22587410,"Rohit23@gmail.com","apapa",869321,"Patna","Bihar");
		Contactno1.printContact();
		Contactno1.editContact();
		System.out.println("After Editing:");
		Contactno1.printContact();
	}
}


