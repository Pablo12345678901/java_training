package zzz_ressources_livres.chap14;
import javax.swing.* ;
class MaFenetre extends JFrame
{ MaFenetre ()
  { setTitle ("Essai message") ;
    setSize (400, 150) ;
  }
}
public class Mess1
{ public static void main (String args[])
  { MaFenetre fen = new MaFenetre() ;
    fen.setVisible(true) ;
    System.out.println ("avant message") ;
    JOptionPane.showMessageDialog(fen, "Hello");
    System.out.println ("apres message") ;
  }
}

