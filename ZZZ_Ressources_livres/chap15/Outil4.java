package zzz_ressources_livres.chap15;
import java.awt.*;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ;

class FenOutil extends JFrame implements ActionListener
{ public FenOutil ()
  { setTitle ("Barre d'outils") ;
    setSize (300, 100) ;
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contenu = getContentPane() ;
      /* creation barre d'outils couleurs */
    barreOutils = new JToolBar () ;
    boutonRouge = new JButton (new ImageIcon("rouge.gif")) ;
    boutonRouge.addActionListener(this);
    barreOutils.add (boutonRouge) ;

    boutonVert = new JButton (new ImageIcon ("vert.gif")) ;
    boutonVert.addActionListener(this);
    barreOutils.add (boutonVert) ;
    
    contenu.add(barreOutils, "North") ;
  }
  public void actionPerformed (ActionEvent e)
  { if (e.getSource() == boutonRouge) System.out.println ("action rouge") ;
    if (e.getSource() == boutonVert)  System.out.println ("action vert") ;
  }
  private JToolBar barreOutils ;
  private JButton boutonRouge, boutonVert ;
}
public class Outil4
{ public static void main (String args[])
  { FenOutil fen = new FenOutil() ;
    fen.setVisible(true) ;
  }
}


