
public class Contacts {
	private String firstname;
    private String lastname;
    private  int phoneNumber;
    private String emailId;
    private String address;
    private long zipcode;
    private String city;
    private String state;
	public Contacts(String firstname, String lastname, int phoneNumber, String emailId, String address,
			long zipcode, String city, String state) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
   }
	@Override
	public String toString() {
		return "AddressBook [firstname=" + firstname + ", lastname=" + lastname + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", address=" + address + ", zipcode=" + zipcode + ", city=" + city
				+ ", state=" + state + "]";
	}
	public static void main(String args[])
	{
		System.out.println("Welcome to Address Book Program");
		Contacts Contactno1= new Contacts("Deepanjan","Sharma",273689,"deepanjansharma43@gmail.com","Kahalgaon",813214,"Bhagalpur","Bihar");
		System.out.println(Contactno1);
	}
	
}