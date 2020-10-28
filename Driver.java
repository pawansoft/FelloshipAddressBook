import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     AddressBookPojo newAddressBookPojo = new AddressBookPojo();
     AddressBookDAO addressBookDAO=new AddressBookDAO();
     newAddressBookPojo=addressBookDAO.askingForDetail();
     System.out.println(addressBookDAO.saveDetails(newAddressBookPojo.getId(), newAddressBookPojo));  
   
            System.out.println(" 2:  for update Address,4 : delete Address");
            int option=sc.nextInt();
            switch (option){
                case 2:
                    System.out.println("Enter an Id to update: ");
                    String id=sc.next();
                    newAddressBookPojo=addressBookDAO.askingForDetail();
                    System.out.println(addressBookDAO.updateAddressBook(id, newAddressBookPojo));
                    break;

                case 4:
                    System.out.println("Enter the Id to delete");
                    String key=sc.next();
                    System.out.println(addressBookDAO.deleteAddress(key));
                    break;
                default:
                    System.out.println("Please provide valid option");
                    break;
            }
        }
}

