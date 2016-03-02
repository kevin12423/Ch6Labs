/**
 * Created by kevin_000 on 2/4/2016.
 */
public class Land
{
    private int length;
    private int width;

    public Land(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public int calcArea()
    {
        return length * width;
    }

    public boolean equals(Land trackOne)
    {
        boolean status;
        if (length == (trackOne.length) && width == (trackOne.width))
        {
            status = true;
        }
        else
        {
            status = false;
        }
            return status;
    }
    public String toString()
    {

        String str = "Since the two tacks area's are the same the two tracks are equal";
        return str;
    }
}
