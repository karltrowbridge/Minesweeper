
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class EarningsPanel here.
 *
 * @author karltrowbridge
 * @version (a version number or a date)
 */
public class EarningsPanel
{
    private JButton calculate;
    
    public EarningsPanel()
    {
        // buttons
        this.calculate = new JButton("Calculate");
        
        // click listeners
        ClickListener listener = new ClickListener();
        
        this.calculate.addActionListener(listener);
        
        this.add(calculate);
    }
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == calculate)
            {
                // calculate averages
            }
        }
    }
}
