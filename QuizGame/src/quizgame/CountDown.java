/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizgame;

/**
 *
 * @author RichardBadea
 */
import javax.swing.JOptionPane;

public class CountDown extends GuessingGame {

    private int seconds;

    public CountDown(int seconds, String[] questions, String answer) {
        super(questions, answer);
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    // Code referenced from: https://medium.com/@AlexanderObregon/how-to-make-a-countdown-in-java-from-any-number-7c5ca64d5688 (partially implemented)
    public void computeTime() {
        try {
            while (seconds > 0) {
                Thread.sleep(1000); // wait 1 second
                seconds--;
            }
            // When the loop finishes, time is up
            JOptionPane.showMessageDialog(null, "Time's up!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
