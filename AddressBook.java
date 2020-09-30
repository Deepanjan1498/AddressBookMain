
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
	public void editContact()
	{
		System.out.println("Enter The First Name to edit the contact details");
		String fn=sc.nextLine();
		Contacts obj=contactMap.get(fn);
		System.out.println();
		System.out.println("Enter the Phone Number");
		int num=sc.nextInt();
		obj.setPhoneNumber(num);
		System.out.println("Enter the EmailId");
		String emId=sc.next();
		obj.setEmailId(emId);
		System.out.println("Enter the Address");
		String add=sc.next();
		obj.setAddress(add);
		System.out.println("Enter the Pincode");
		long zip=sc.nextLong();
		obj.setZipcode(zip);
		System.out.println("Enter the City");
		String cit=sc.next();
		obj.setCity(cit);
		System.out.println("Enter the State");
		String sta=sc.next();
		obj.setState(sta);
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
		System.out.println("Enter  your choice \n1.Add new Contact \n2.Edit Contact \n3. Delete Contact \n4.Print Book \n5.Close");
		int choice=sd.nextInt();
		switch(choice){
		case 1:Contactno1.addNewContact();
		       break;
		case 2:Contactno1.editContact();
               break;		
		case 3:Contactno1.deleteContact();
               break;
		case 4:Contactno1.printContact();       
               break;
		case 5:System.exit(0);;       
		  }
	    }	
	}
}

