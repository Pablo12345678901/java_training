package zzz_ressources_livres.chap16;
//package ZZZ_Ressources_livres.chap16;
import javax.swing.* ;
import java.awt.* ;
import java.awt.event.* ;

class MaFenetre extends JFrame
{ public MaFenetre ()
  { setTitle ("Affichage caracteres 2 paneaux") ;
    setSize (400, 180) ;
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e)
      { System.exit(0) ;
      }
    });

    Container contenu = getContentPane() ;
    contenu.setLayout (new FlowLayout());

    pan1 = new Paneau(Color.yellow) ;
    contenu.add(pan1) ;
    pan2 = new Paneau(Color.cyan) ;
    contenu.add(pan2) ;
  }
  private Paneau pan1, pan2 ;
}

class Paneau extends JPanel
{   public Paneau(Color c)
    {   setPreferredSize (new Dimension (160, 100)) ; // Adaptation de la taille car par défaut (avec FlowLayout), un panneau a une taille très petite.
        setBackground (c) ;
        addMouseListener (new MouseAdapter()
        {   public void mousePressed (MouseEvent e)
            {   Graphics g = getGraphics() ;
                String ch = "" + caractereCourant ;
                g.drawString (ch, e.getX(), e.getY()) ;
                g.dispose() ;
                requestFocus() ;
            }
        }) ;
        addKeyListener (new KeyAdapter()
        {   public void keyTyped(KeyEvent e)
            { caractereCourant = e.getKeyChar() ;
            }
        }) ;
    }
    public boolean isFocusTraversable()
    { return true ;
    }
    private static char caractereCourant = '*' ;
}

public class Frappes2
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
  }
}


