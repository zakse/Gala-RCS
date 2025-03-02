import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //"pieslēdzam" personas klasi
        Person person = new Person();
       person.printInfo();

        //lai lietājs varētu ievadīt datus
        Scanner scanner = new Scanner(System.in);

        // Lietotāja ievade
        System.out.print("Ievadiet vārdu: ");
        String vards = scanner.nextLine();

        System.out.print("Ievadiet uzvārdu: ");
        String uzvards = scanner.nextLine();

        int vecums;
        do {
            System.out.print("Ievadiet vecumu: ");
            vecums = scanner.nextInt();
        } while (vecums <= 0);

        System.out.print("Ievadiet augumu metros: ");
        double augums_m = scanner.nextDouble();

        System.out.print("Ievadiet svaru kilogramos: ");
        double svars = scanner.nextDouble();

        System.out.print("Ievadiet dzīvesvietas valsti: ");
        String valsts = scanner.nextLine();

        scanner.nextLine();

        System.out.print("Ievadiet mēneša ienākumus: ");
        double ienakumi_menesi = scanner.nextDouble();

        System.out.print("Vai Jums patīk programmēt? (jā/nē): ");
        String likesProgrammingInput = scanner.nextLine().toLowerCase();
        boolean likesToProgram = likesProgrammingInput.equals("jā");

        scanner.nextLine(); //lai būtu jaunā rindā

        System.out.print("Ievadiet studiju programmu: ");
        String studyProgram = scanner.nextLine();

        Student student;
        student = new Student();
        student.printInfo();

        scanner.close();
    }
        }