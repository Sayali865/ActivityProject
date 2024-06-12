package com.practicedemo;

import java.util.Scanner;

/**
 * The QuizGame class handles the quiz game logic.
 */
public class QuizGame {
    // Array of questions for the quiz
    private Question[] questions;
    // Player's score
    private int score;

    /**
     * Constructor to initialize the quiz game with questions.
     *
     * param questions Array of Question objects
     */
    public QuizGame(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    /**
     * Starts the quiz game.
     */
    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Loop through each question in the array
        for (Question question : questions) {
            // Print the question text
            System.out.println(question.getQuestion());

            // Print each option with a corresponding letter (A, B, C, D)
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((char)('A' + i) + ": " + options[i]);
            }

            // Prompt the user for their answer
            System.out.print("Your answer: ");
            // Read the user's answer and convert it to uppercase
            char answer = scanner.next().toUpperCase().charAt(0);

            // Check if the answer is correct
            if (answer == question.getCorrectAnswer()) {
                // Increment the score if the answer is correct
                score++;
                // Print correct answer message
                System.out.println("Answer is Correct\n");
            } else {
                // Print incorrect answer message and show the correct answer
                System.out.println("Incorrect. The correct answer is " + question.getCorrectAnswer() + ".\n");
            }
        }

        // Print the final score
        System.out.println("You scored " + score + " out of " + questions.length);
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
