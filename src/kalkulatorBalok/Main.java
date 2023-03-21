/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorBalok;

/**
 *
 * @author vena
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator Frame = new Kalkulator();
        Frame.setTitle("Kalkulator Balok");
        Frame.setSize(400, 350);
        Frame.setDefaultCloseOperation(Kalkulator.EXIT_ON_CLOSE);
        Frame.setVisible(true);
    }
    
}
