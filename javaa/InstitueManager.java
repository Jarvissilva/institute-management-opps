package javaa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// It has all the institution management methods to add, view, remove.
public class InstitueManager {
    List<Institue> institues = new ArrayList<>();

    public void add_institue() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your institue name: ");
        String name = s.nextLine();

        System.out.println("Enter your institue type (Central, State or Others): ");
        String type = s.nextLine();

        Institue newInstitue = new Institue();
        newInstitue.name = name;
        newInstitue.type = type;
        newInstitue.serial_no = institues.size();

        institues.add(newInstitue);

        System.out.println("Institue successfully added\n");
    }

    public void remove_institue() {
        display_institues();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter institue sr no to remove: ");
        int serial_no = s.nextInt();
        boolean institue_found = false;

        if (institues.isEmpty()) {
            System.out.println("No institues added \n");
        }
        else{
            for (Institue institue : institues) {
                if (institue.serial_no == serial_no) {
                    institues.remove(serial_no);
                    System.out.println("Institue successfully removed\n");
                    institue_found = true;
                    break;
                }
            }
            if (institue_found == false) {
                System.out.println("Institue not found with that serial number");
            }
        }
    }

    public void display_institue() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter institue sr no to find: ");
        int serial_no = s.nextInt();
        boolean institue_found = false;
        if (institues.isEmpty()) {
            System.out.println("No institues added \n");
        }
        else{
            for (Institue institue : institues) {
                if (institue.serial_no == serial_no) {
                    System.out.println("-------------------------------------");
                    System.out.println("Sr No: " + institue.serial_no);
                    System.out.println("Name: " + institue.name);
                    System.out.println("Type: " + institue.type);
                    System.out.println("-------------------------------------\n");
                    institue_found = true;
                    break;
                }
            }
            if (institue_found == false) {
                System.out.println("Institue not found with that serial number");
            }
        }
    }
   
    public void display_institues() {
        if (institues.isEmpty()) {
            System.out.println("No institues added \n");
        }
        else{
            for (Institue institue : institues) {
                System.out.println("-------------------------------------");
                System.out.println("Sr No: " + institue.serial_no);
                System.out.println("Name: " + institue.name);
                System.out.println("Type: " + institue.type);
                System.out.println("-------------------------------------\n");
            }
        }
    }
}
