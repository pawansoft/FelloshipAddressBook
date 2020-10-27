public class Driver {
    public static void main(String[] args) {
     AddressBookPojo newAddressBookPojo = new AddressBookPojo();
     AddressBookDAO addressBookDAO=new AddressBookDAO();
     newAddressBookPojo=addressBookDAO.askingForDetail();
        System.out.println(addressBookDAO.saveDetails(newAddressBookPojo.getId(), newAddressBookPojo));
    }
}
