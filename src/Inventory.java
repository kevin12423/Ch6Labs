/**
 * Created by kevin_000 on 2/4/2016.
 */
public class Inventory

{
    private String description;


    // A normal parametrized constructor
    public Inventory(String description)
    {
        this.description = description;

    }

    // copy constructor
    Inventory(Inventory copy)
    {
        System.out.println("* Copy constructor called *");
       description = copy.description;
    }
    @Override
    public String toString() {
        return ("Description of one and two: " + description);
    }


}
