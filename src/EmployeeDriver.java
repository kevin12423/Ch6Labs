/**
 * Created by kevin_000 on 2/5/2016.
 */
public class EmployeeDriver
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Kevin", 12345,"IT depart.", "Manager");
        Employee emp2 = new Employee("Kevin", 53434);
        Employee emp3 = new Employee();
        System.out.printf("Name: %s ID number: %d Department: %s Position: %s"
                ,emp1.name,emp1.idNumber,emp1.department,emp1.position);
        System.out.printf("\nName: %s ID number: %d",emp2.name,emp2.idNumber);
        System.out.printf("\nName: %s ID number: %d Department: %s Position: %s"
                ,emp3.name,emp3.idNumber,emp3.department,emp3.position);
    }
}
