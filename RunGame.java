package com.practicedemo;


/**
 * The RunGame class contains the main method to start the quiz game.
 */
public class RunGame {
    public static void main(String[] args) {
        // Create an array of questions for the quiz
        Question[] questions = new Question[] {
            // Initialize each question with the question text, options, and correct answer
            new Question("What is the capital of France?", new String[]{"Paris", "London", "Berlin", "Madrid"}, 'A'),
            new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 'B'),
            new Question("What is the color of grapes?", new String[]{"Red", "Green", "Yellow", "Blue"}, 'B')
        };

        // Create a QuizGame object with the array of questions
        QuizGame game = new QuizGame(questions);
        
        // Start the quiz game
        game.start();
    }
}
