import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public static Scanner sc = new Scanner(System.in);
    public List<Person> addressBook = new ArrayList<>();

    public void addressBookExecution() {
        boolean isExit = false;
        AddressBook addressBook = new AddressBook();
        while(!isExit) {
            System.out.println("Enter Option" +
                    "\n1. Add Person" +
                    "\n2. Edit Person" +
                    "\n3. Delete Person" +
                    "\n4. Show Address Book" +
                    "\n5. Exit");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    addressBook.addPerson();
                    break;
                case 2:
                    addressBook.editPerson();
                    break;
                case 3:
                    addressBook.deletePerson();
                    break;
                case 4:
                    addressBook.showAddressBook();
                    break;
                case 5:
                    isExit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please Enter Valid Input");
            }
        }

    }

    public void addPerson() {

        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();
        System.out.println("Enter Street Name:");
        String street = sc.nextLine();
        System.out.println("Enter City Name:");
        String city = sc.nextLine();
        System.out.println("Enter State Name:");
        String state = sc.nextLine();;
        System.out.println("Enter Mobile Name: ");
        long mobileNumber = Long.parseLong(sc.nextLine());

        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setStreet(street);
        person.setCity(city);
        person.setState(state);
        person.setMobileNumber(mobileNumber);

        addressBook.add(person);
    }

    public void editPerson() {
        System.out.println("Please Enter Name");
        String name = sc.nextLine();
        Person person = findPerson(name);
        if (person != null) {
            System.out.println("Enter Street");
            String street = sc.nextLine();
            System.out.println("Enter City");
            String city = sc.nextLine();
            System.out.println("Enter State Name:");
            String state = sc.nextLine();
            person.setStreet(street);
            person.setState(state);
            person.setState(state);
        }
        else {
            System.out.println("No contact found with the entered name");
        }
    }
    public void deletePerson() {
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        Person person = findPerson(name);
        if (person != null) {
            System.out.println("Found the entry and removing");
            addressBook.remove(person);
        }
        else {
            System.out.println("No contact found");
        }
    }
    public void showAddressBook() {
        for(int i = 0; i < addressBook.size(); i++) {
            System.out.println(addressBook.get(i));
        }
    }
    public Person findPerson(String name){
        Person person = null;
        for(int i = 0; i < addressBook.size(); i++) {
            if(name.equals(addressBook.get(i).getFirstName())
                    || name.equals(addressBook.get(i).getLastName())) {
                break;
            }
        }
        return person;
    }

}
