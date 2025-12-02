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
        questions[0] = "What percentage(%) of total employment is made up by the middle class?";
        questions[1] = "How many people were unemployed in 2015?";
        questions[2] = "How many workers have lived in extreme or moderate poverty in 2018?";
        questions[3] = "How many targets does the UN wish to achieve by 2030(for this SDG)";
        questions[4] = "What is the minimun annual growth needed to be achieved?";
        
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


