import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class I_panneau_couleur_de_fonds {
    public static void main(String[] args) {
        MaFenetre fen = new MaFenetre() ;
        fen.setVisible(true);
    }
}

class MaFenetre extends JFrame {
    public MaFenetre()
    {   // paramètres fenêtre
        setBounds(10, 40, 700, 500);
        setTitle("Panneau de couleur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // création container
        Container container = getContentPane() ;
        // panneau de couleur
        panneau = new JPanel() ;
        Color color = new Color(0.2f, 0.3f, 0.6f) ;
        panneau.setBackground(color);
        container.add(panneau) ;
    }
    private JPanel panneau ;
}