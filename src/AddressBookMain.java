import java.util.Scanner;

public class AddressBookMain extends AddressBook {

    public static void main(String[] args) {
     AddressBookMain abm = new AddressBookMain();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 to create an AddressBook");
        int opt = sc.nextInt();

        if(opt == 1) {
            abm.addressBookExecution();
        }
        else {
            System.out.println("Please enter valid input");
        }

    }

}
