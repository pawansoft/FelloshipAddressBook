import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     AddressBookPojo newAddressBookPojo = new AddressBookPojo();
     AddressBookDAO addressBookDAO=new AddressBookDAO();


        boolean isTerminate = false;
        while (isTerminate != true)
        {
            System.out.println("Enter 1 for add New Address, Enter 2 for update Address,4 : delete Address, Enter 3 for terminate the program");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    newAddressBookPojo=addressBookDAO.askingForDetail();
                    System.out.println(addressBookDAO.saveDetails(newAddressBookPojo.getId(), newAddressBookPojo));
                    break;
                case 2:
                    System.out.println("Enter an Id to update: ");
                    String id=sc.next();
                    newAddressBookPojo=addressBookDAO.askingForDetail();
                    System.out.println(addressBookDAO.updateAddressBook(id, newAddressBookPojo));
                    break;
                case 3:
                    isTerminate=true;
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
}

