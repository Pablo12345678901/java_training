package zzz_ressources_livres.chap09;
public class EnumValeurs
{ public static void main (String args[])
  { System.out.println("Liste des valeurs du type Jour") ;
    for (Jour j : Jour.values() )
    { System.out.println (j.toString() ) ;
    }
  }
}
enum Jour { lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche }
/*
    Liste des valeurs du type Jour
lundi
mardi
mercredi
jeudi
vendredi
samedi
dimanche

*/
