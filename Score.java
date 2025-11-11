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

public class Score extends GuessingGame{
    private int score;
    private String[] correctAnswers;
    
    public Score(String[] questions, String answers,int score,String[] correctAnswers){
        super(questions, answers);
        score = 0;
        this.correctAnswers = correctAnswers;
    }
    
    public Score(){
    correctAnswers = new String[5];
    correctAnswers[0] = "B";
    correctAnswers[1] = "A";
    correctAnswers[2] = "D";
    correctAnswers[3] = "C";
    correctAnswers[4] = "D";
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public void computeScore(String answers,String[] questions, int score, String[] correctAnswers){
       for(int i = 0; i < questions.length;i++){
           for(int j = 0; j < correctAnswers.length; j++){
               if(questions[i] == correctAnswers[j]){
                   score++;
               } else if (questions != correctAnswers) {
                   score--;
               
               }
           } 
       
       } 
        
    }
    
}

