/**
 * Created by kevin_000 on 2/5/2016.
 */
public class Employee
{
    public String name;
    public int idNumber;
    public String department;
    public String position;

    //params constructor
    public Employee(String Name, int IdNumber, String Department, String Position)
    {
        name = Name;
        idNumber = IdNumber;
        department = Department;
        position = Position;
    }
    public Employee(String Name, int IdNumber)
    {
        name = Name;
        idNumber = IdNumber;
        department = "";
        position = "";
    }
    public Employee()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

}
