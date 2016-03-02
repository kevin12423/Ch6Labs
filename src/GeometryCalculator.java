/**
 * Created by kevin_000 on 2/8/2016.
 */
public class GeometryCalculator
{
    private int radius;
    private int length;
    private int width;
    private int base;
    private int triHeight;

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public void setBase(int base)
    {
        this.base = base;
    }

    public void setTriHeight(int triHeight)
    {
        this.triHeight = triHeight;
    }

    public int getRadius()
    {
        return radius;
    }
    public double calcAreaCircle()
    {
        return Math.PI * (radius * radius);

    }
    public double calcAreaRec()
    {
        return (length * width);
    }
    public double calcAreaTri()
    {
        return (base * triHeight) * 0.5;
    }
}
