import javax.swing.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;
//import javax.swing.plaf.basic.*;
import java.awt.event.*;

public class Hydra extends JFrame
{
    private JButton behead;

    public Hydra()
    {
        super("Hydra Head");
        setSize(250, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//FIXME
        JMenuBar menuBar = new JMenuBar();
            JMenu attack = new JMenu("Attack");
                JMenuItem hit = new JMenuItem("hit");
                hit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){hitf();}});
                attack.add(hit);
            menuBar.add(attack);
            JMenu help = new JMenu("Help");
                JMenuItem cry = new JMenuItem("Cry");
                help.add(cry);
            menuBar.add(help);
        setJMenuBar(menuBar);

        ImageIcon icon = new ImageIcon("hydra.jpg");
        JLabel label = new JLabel(icon);
        add(label);

        setVisible(true);
    }

    public void hitf()
    {
            showMessageDialog(null, "hit did nothing");
    }

}
