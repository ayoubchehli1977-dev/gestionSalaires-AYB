/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class GestionSalaires {

    public static void main(String[] args) {
        Developpeur d = new Developpeur("Durand", "Michel", 4);
        Manager m = new Manager("Dupont", "Lucie", 2);

        System.out.println(d.getDescription());
        System.out.println(m.getDescription());
    }
}
