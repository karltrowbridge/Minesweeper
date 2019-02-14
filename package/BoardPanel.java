import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class BoardPanel here.
 *
 * @author karltrowbridge chris goooooofffff
 * @version bruh
 */
public class BoardPanel extends JPanel
{
    private final int ROWS = 10, COLS = 10;
    private final int CELLSIZE = 20;

    private int tentativeRow, tentativeCol, displayCount;

    public BoardPanel()
    {
        setPreferredSize(new Dimension(COLS * CELLSIZE, ROWS * CELLSIZE));
        setBackground(Color.LIGHT_GRAY);
    }

    public Location getPos(int x, int y)
    { return new Location(y / CELLSIZE, x / CELLSIZE); }

    public int getRows()
    { return ROWS; }

    public int getCols()
    { return COLS; }

    public void setMove(int row, int col)
    {
        tentativeRow = row;
        tentativeCol = col;
    }

    public void setDisplayCount(int count)
    { displayCount = count; }

    private Minesweeper game;

    public void update(Minesweeper game)
    {
        this.game = game;
        repaint();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        if (game == null)
        { return; }

        for(int row = 0; row < ROWS; row++)
        {
            for(int cols = 0; cols < COLS; cols++)
            {
                Color color;
                if(game.isEmpty(row,cols))
                { color = Color.LIGHT_GRAY; }
                else if(displayCount % 2 != 0 && row >= tentativeRow && cols >= tentativeCol)
                { color = Color.RED; }
            }
        }
    }
}


