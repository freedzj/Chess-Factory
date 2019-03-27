
public abstract class ChessPiece
{
    protected String color = "";
    protected String name = "";
    
    public String toString()
    {
        String s = "";
        s += color;
        s += name;
        return s;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setColor(String color)
    {
        this.color = color;
    }
}
