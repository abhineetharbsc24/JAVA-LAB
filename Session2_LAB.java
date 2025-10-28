import java.util.Scanner;

public class EmployeeInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Employee Information System");
        System.out.println("----------------------------");

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // simple string handling
        String nameUpper = name.toUpperCase();
        String deptCode = department.length() >= 3 
                ? department.substring(0, 3).toUpperCase() 
                : department.toUpperCase();

        System.out.println();
        System.out.println("Employee Record Created");
        System.out.println("----------------------------");
        System.out.println("Name        : " + nameUpper);
        System.out.println("ID          : " + empId);
        System.out.println("Department  : " + deptCode);
        System.out.println("Salary      : ₹" + salary);
        System.out.println("----------------------------");

        if (args.length > 0) {
            System.out.println("Batch updates (from command line):");
            for (int i = 0; i < args.length; i++) {
                System.out.println("- " + args[i]);
            }
        } else {
            System.out.println("No command-line updates provided.");
        }

        sc.close();
    }
}