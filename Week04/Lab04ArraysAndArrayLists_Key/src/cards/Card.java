/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author Instructor
 */
public class Card {

    private int number;
    private String type;

    /**
     * Constructor with two arguments
     *
     * @param number of type int
     * @param type of type String
     */
    public Card(int number, String type) {
        this.number = number;
        this.type = type;
    }

    /**
     * Returns the number on the card
     *
     * @return an int type
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the number on the card from the one in parameter
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Returns the type of the card
     *
     * @return a String
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the card to the one in parameter.
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the number on the card with spaces before and after.
     *
     * @return a String
     */
    @Override
    public String toString() {
        return " " + getNumber() + " ";
    }
}
