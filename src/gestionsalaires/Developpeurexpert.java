/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author Houda
 */
public class Developpeurexpert extends Developpeur {
    
    public Developpeurexpert(String nom, String prenom, int anciennete) {
        super(nom, prenom, anciennete);
        this.poste = "Developpeurexpert";
    }
    
    @Override
    public int getSalaire() {
      int salaire = super.getSalaire();
              return (int) (salaire * 1.1);
    }
}
