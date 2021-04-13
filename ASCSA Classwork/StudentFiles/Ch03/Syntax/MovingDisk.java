import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingDisk extands JPanel //extends
                  implements ActionListener
{
  private int time;

  public MovingDisk()
  {
    time = 0 //add semi-colon
    Timer clock = new Timer(30, this);
    clock.start; // add () after start
  }

  public void paintComponent(Graphics g)
  {
    int x = 150 - (int)(100 * Math.cos(0.005 * Math.PI * time));
    int y = 130 - (int)75 * Math.sin(0.005 * Math.PI * time)); //add ( before 75
    int r = 20;

    Color sky;
    if (y > 130) sky = Color.BLACK // semi - colon
    else sky = Color.CYAN;
    setBackground(sky);
    super.paintComponent(g);

    g.setColor(Color.ORANGE);
    g.fillOval(x - r, y - r, 2*r, 2*r);
  }

  public void actionPerformed(ActionEvent e)
  {
    time++;
    repaint();
  }

  public static void main(String args)
  {
    JFrame w = new JFrame("Moving Disk); " // add " after moving disk
    w.setSize(300, 150);

    Container c = w.getContentPane();
    c.add(new movingDisk()); //movingDisk is not capped properly. MovingDisk

    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    w.setResizable(false);
    w.setVisible(true);
  }
  /** I can comment here but most people don't, and most people add 2 astericks
   * adding a java doc style comment
   * what do I do now?
   */
}

