// area of rectangle sample from cs 3340 
public class RectArea
{
    private double length = 0, width = 0;
    String s = new String();
    
    
    // constructor
    public RectArea(double length, double width)
    {
        this.length = length;
    }
    
    
    public RectArea()
    {
        this.length = this.width = 0;
    }
    
    public void setLength(double l)
    {
        if(l >= 0)
            this.length = l;
    }
    
    public void setWidth(double w)
    {
        if(w >= 0)
            this.width = w;
    }    
    
    public double getLength()
    {
        return this.length;
    }
    
    public double getArea()
    {
        return this.length * this.width;
    }
    
    
}
