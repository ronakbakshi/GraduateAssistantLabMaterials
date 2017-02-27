/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

import java.util.ArrayList;

/**
 *
 * @author Instructor
 */
public class CardsArrayList {

    private ArrayList<Card> clubs;
    private ArrayList<Card> diamonds;
    private ArrayList<Card> hearts;
    private ArrayList<Card> spades;

    /**
     * Constructor with no arguments. It initializes all the ArrayLists
     */
    public CardsArrayList() {
        clubs = new ArrayList<>();
        diamonds = new ArrayList<>();
        hearts = new ArrayList<>();
        spades = new ArrayList<>();
    }

    /**
     * Returns the clubs
     *
     * @return an ArrayList of type cards
     */
    public ArrayList<Card> getClubs() {
        return clubs;
    }

    /**
     * Returns the diamonds
     *
     * @return an ArrayList of type cards
     */
    public ArrayList<Card> getDiamonds() {
        return diamonds;
    }

    /**
     * Returns the hearts
     *
     * @return an ArrayList of type cards
     */
    public ArrayList<Card> getHearts() {
        return hearts;
    }

    /**
     * Returns the spades
     *
     * @return an ArrayList of type cards
     */
    public ArrayList<Card> getSpades() {
        return spades;
    }

    /**
     * Adds the card to the appropriate list
     *
     * @param c
     * @return string
     */
    public String addCardsToList(Card c) {
        String ch = c.getType();
        String msg;
        switch (ch) {
            case "clubs":
                clubs.add(c);
                msg = "Club card added successfully!";
                break;
            case "diamonds":
                diamonds.add(c);
                msg = "Diamonds card added successfully!";
                break;

            case "hearts":
                hearts.add(c);
                msg = "Hearts card added successfully!";
                break;
            default:
                spades.add(c);
                msg = "Spades card added successfully!";
                break;
        }
        return msg;
    }

    /**
     * Removes the card from the ArrayList
     *
     * @param position of type int
     * @param c of type ArrayList
     * @return an string
     */
    public String removeCardsFromList(int position, ArrayList<Card> c) {
        String msg = "";
        if (position < 0 || position >= c.size()) {
            msg = "ArrayList size underflow, card cannot be removed";
        } else {
            c.remove(position);
            msg = "Card is removed successfully!";
        }
        return msg;
    }

    /**
     * Returns the string in desired format
     *
     * @return string
     */
    @Override
    public String toString() {
        String str = "Hearts ArrayList:";
        str += "[";
        for (Card c : hearts) {
            str += c.toString();
        }
        str += "]";
        str += "\nDiamonds ArrayList:";
        str += "[";
        for (Card c : diamonds) {
            str += c.toString();
        }
        str += "]";
        str += "\nSpades ArrayList:";
        str += "[";
        for (Card c : spades) {
            str += c.toString();
        }
        str += "]";
        str += "\nClubs ArrayList:";
        str += "[";
        for (Card c : clubs) {
            str += c.toString();
        }
        str += "]";
        return str;
    }
}
