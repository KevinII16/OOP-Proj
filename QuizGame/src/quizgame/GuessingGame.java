/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizgame;

/**
 *
 * @author RichardBadea
 */
public class GuessingGame {

    private String questions[];
    private String answer;

    public GuessingGame(String[] questions, String answer) {
        this.questions = questions;
        this.answer = answer;
    }

    public GuessingGame() {
        questions = new String[5];
        answer = " ";
        questions[0] = "How many letters are in the word apple?";
        questions[1] = "Is the earth round? Yes/no";
        questions[2] = "What is the capital of United Kingdom?";
        questions[3] = "What is the chemical symbol for water?";
        questions[4] = "How many eggs are in a dozen?";
        
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestions(String questions[]) {
        this.questions = questions;
    }

    public String[] getQuestions() {
        return questions;
    }
}


