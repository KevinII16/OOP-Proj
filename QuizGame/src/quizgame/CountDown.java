/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizgame;

/**
 *
 * @author RichardBadea
 */

public class CountDown extends GuessingGame{
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
    
    // Code referenced from: 
    public void computeTime() {
        for (int i = seconds; i >= 0; i--) {
            try {
                Thread.sleep(1000); // pause for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

            }
        }
    }
}
