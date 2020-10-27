import java.util.HashMap;
import java.util.Scanner;
public class AddressBookDAO {
    HashMap <String , AddressBookPojo> addressContainer = new HashMap<String, AddressBookPojo>();
    Scanner sc=new Scanner(System.in);
    public HashMap<String, AddressBookPojo> saveDetails (String id, AddressBookPojo addressBookPojo)
    {
        try {
            addressContainer.put(id, addressBookPojo);
            return addressContainer;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public HashMap updateAddressBook(String id, AddressBookPojo addressBookPojo)
    {
        try{
            if(addressContainer.containsKey(id) == false)
            {
                System.out.println("The Id you have provided is not found !!!!");
            }
            else
            {
                addressContainer.put(id, addressBookPojo);
                return addressContainer;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
    public AddressBookPojo askingForDetail()
    {
        AddressBookPojo newAddressBookPojo = new AddressBookPojo();
        System.out.println("Enter the Id: ");
        String id = sc.next();
        System.out.println("Enter the fName");
        String fName = sc.next();
        System.out.println("Enter the lName");
        String lName = sc.next();
        System.out.println("Enter The Address");
        String address = sc.next();
        System.out.println("Enter the city");
        String city = sc.next();
        System.out.println("Enter the state");
        String state = sc.next();
        System.out.println("Enter the zip Code");
        int zip = sc.nextInt();
        System.out.println("Enter the phone number");
        long phone = sc.nextLong();
        System.out.println("Enter your email Id");
        String email = sc.next();
        newAddressBookPojo.setId(id);
        newAddressBookPojo.setfName(fName);
        newAddressBookPojo.setlName(lName);
        newAddressBookPojo.setAddress(address);
        newAddressBookPojo.setCity(city);
        newAddressBookPojo.setState(state);
        newAddressBookPojo.setZip(zip);
        newAddressBookPojo.setPhone(phone);
        newAddressBookPojo.setEmail(email);
        return newAddressBookPojo;
    }

}