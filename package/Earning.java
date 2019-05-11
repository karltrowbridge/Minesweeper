
import java.text.SimpleDateFormat;
/**
 * Earnig object holds info that was made from one day.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Earning
{
    private int tips;
    private double hours;
    private SimpleDateFormat date;
    
    public Earning(int tips, double hours, SimpleDateFormat date)
    {
        this.tips = tips;
        this.hours = hours;
        this.date = date;
    }
    
    // get methods
    public int getTips()
    {return this.tips;}
    
    public double getHours()
    {return this.hours;}
    
    public SimpleDateFormat getDate()
    {return this.date;}
    
    // set methods
    public void setTips(int newTips)
    {this.tips = newTips
}
