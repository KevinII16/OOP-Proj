/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author kevinalabi
 */
public class App {

    public static void main(String[] args) {

        // Start the program on the Income screen
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncomeGui().setVisible(true);
            }
        });
    }
}


