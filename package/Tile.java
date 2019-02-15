import java.awt.Color;

/**
 * Write a description of class Tile here.
 *
 * @author Bruh moment
 * @version (a version number or a date)
 */
public class Tile
{
    private Location location;
    private Color color;
    
    public Tile(Location location)
    {
        this.color = Color.LIGHT_GRAY;
        this.location = location;
    }
    
    public void setColor(Color color)
    { this.color = color; }
    
    public Color getColor()
    { return this.color; }
    
    public Location getLocation()
    { return this.location; }
}
