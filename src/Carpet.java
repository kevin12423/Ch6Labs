/**
 * Created by kevin_000 on 2/4/2016.
 */
public class Carpet
{
    private int length;
    private int width;
    public Carpet(int lin, int win)
    {
        length=lin;
        width=win;
    }

    public int calcArea()
    {
        return length * width;
    }
}
