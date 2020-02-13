import javax.swing.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;
//import javax.swing.plaf.basic.*;
import java.awt.event.*;
import java.util.*;

public class Hydra extends JFrame
{
    public static int age = 0;

    public Hydra()
    {
        super("Hydra Head");
        setSize(250, 300);
        setResizable(false);
        Random r = new Random();
        setLocation(r.nextInt(500), r.nextInt(500));
        if(age<10)
        {
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
        JMenuBar menuBar = new JMenuBar();
            JMenu attack = new JMenu("Attack");
                JMenuItem hit = new JMenuItem("hit");
                hit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){hitf();}});
                attack.add(hit);
                JMenuItem behead = new JMenuItem("behead");
                behead.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){beheadf();}});
                attack.add(behead);
            menuBar.add(attack);
            JMenu help = new JMenu("Help");
                JMenuItem cry = new JMenuItem("Cry");
                cry.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){cryf();}});
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

    public void cryf()
    {
        showMessageDialog(null, "crying did nothing");
    }

    public void beheadf()
    {
        //setVisible(false);
        dispose();
        age = age + 1;
        showMessageDialog(null, "Age: " + age);
        Hydra h1 = new Hydra();
        Hydra h2 = new Hydra();
    }

}
