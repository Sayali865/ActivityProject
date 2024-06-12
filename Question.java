package com.practicedemo;

/**
 * The Question class represents a single quiz question.
 */
public class Question {
    // The text of the question
    private String question;
    // Array of possible answers
    private String[] options;
    // The correct answer represented by a character (e.g., 'A', 'B')
    private char correctAnswer;

    /**
     * Constructor to initialize the question, options, and correct answer.
     *
     *  question      The text of the question
     *  options       Array of possible answers
     *  correctAnswer The correct answer represented by a character
     */
    public Question(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Getter for the question text.
     *
     * return The text of the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Getter for the options array.
     *
     * return Array of possible answers
     */
    public String[] getOptions() {
        return options;
    }

    /**
     * Getter for the correct answer.
     *
     * return The correct answer represented by a character
     */
    public char getCorrectAnswer() {
        return correctAnswer;
    }
}
