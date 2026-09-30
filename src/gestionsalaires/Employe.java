/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author Houda
 */
public abstract class Employe {

    protected String nom;
    protected String prenom;
    int anciennete;
    protected String poste;

    public Employe(String nom, String prenom,
    int anciennete, String poste) {
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
        this.poste = poste;
    }

    public abstract int getSalaire();

    public String getDescription() {
        return nom + " " + prenom + " est " + poste
                + " la depuis " + anciennete + " ans et brasse "
                + getSalaire() + " €.";
    }
}