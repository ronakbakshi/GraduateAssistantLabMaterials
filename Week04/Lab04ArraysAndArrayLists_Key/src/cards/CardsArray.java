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
public class CardsArray {

    private Card[] clubs;
    private Card[] diamonds;
    private Card[] hearts;
    private Card[] spades;
    private final int DECK_SIZE = 5;
    private int clubsCount;
    private int diamondsCount;
    private int heartsCount;
    private int spadesCount;

    /**
     * Default constructor to initialize the array.
     */
    public CardsArray() {
        this.clubs = new Card[DECK_SIZE];
        this.diamonds = new Card[DECK_SIZE];
        this.hearts = new Card[DECK_SIZE];
        this.spades = new Card[DECK_SIZE];
        this.clubsCount = 0;
        this.diamondsCount = 0;
        this.heartsCount = 0;
        this.spadesCount = 0;
    }

    /**
     * Returns number of club cards
     *
     * @return int
     */
    public int getClubsCount() {
        return clubsCount;
    }

    /**
     * Returns number of diamond cards
     *
     * @return int
     */
    public int getDiamondsCount() {
        return diamondsCount;
    }

    /**
     * Returns number of hearts cards
     *
     * @return int
     */
    public int getHeartsCount() {
        return heartsCount;
    }

    /**
     * Returns number of spades cards
     *
     * @return int
     */
    public int getSpadesCount() {
        return spadesCount;
    }

    /**
     * To add the card to the array
     *
     * @param c
     */
    public void addCardsToArray(Card c) {
        String ch = c.getType();
        String msg;
        switch (ch) {
            case "clubs":
                if (clubsCount < DECK_SIZE) {
                    clubs[clubsCount] = c;
                    clubsCount++;
                    //  msg = "Club card added successfully!";
                } else {
                    // msg = "Array size overflow so remove the first element!\n";
                    removeCardsFromArray(0, ch);
                    addCardsToArray(c);
                }
                break;
            case "diamonds":
                if (diamondsCount < DECK_SIZE) {
                    diamonds[diamondsCount] = c;
                    diamondsCount++;
                    // msg = "Diamonds card added successfully!";
                } else {
                    // msg = "Array size overflow so remove the first element!\n";
                    removeCardsFromArray(0, ch);
                    addCardsToArray(c);
                }
                break;

            case "hearts":
                if (heartsCount < DECK_SIZE) {
                    hearts[heartsCount] = c;
                    heartsCount++;
                    // msg = "Hearts card added successfully!";
                } else {
                    //msg = "Array size overflow so remove the first element!\n";
                    removeCardsFromArray(0, ch);
                    addCardsToArray(c);
                }
                break;
            default:
                if (spadesCount < DECK_SIZE) {
                    spades[spadesCount] = c;
                    spadesCount++;
                    // msg = "Spades card added successfully!";
                } else {
                    // msg = "Array size overflow so remove the first element!\n";
                    removeCardsFromArray(0, ch);
                    addCardsToArray(c);
                }
                break;
        }

    }

    /**
     * To remove the card from specific array
     *
     * @param position
     * @param cardType
     */
    public void removeCardsFromArray(int position, String cardType) {

        if ("clubs".equals(cardType)) {
            if (position < clubsCount || position >= 0) {
                for (int i = position + 1; i < clubsCount; i++) {
                    clubs[i - 1] = clubs[i];
                }
                clubsCount--;
            }
        } else if ("diamonds".equals(cardType)) {
            if (position < diamondsCount || position >= 0) {
                for (int i = position + 1; i < diamondsCount; i++) {
                    diamonds[i - 1] = diamonds[i];
                }
                diamondsCount--;
            }
        } else if ("hearts".equals(cardType)) {
            if (position < heartsCount || position >= 0) {
                for (int i = position + 1; i < heartsCount; i++) {
                    hearts[i - 1] = hearts[i];
                }
                heartsCount--;
                // msg = "Card is removed successfully!";
            }
        } else if ("spades".equals(cardType)) {
            if (position < spadesCount || position >= 0) {
                for (int i = position + 1; i < spadesCount; i++) {
                    spades[i - 1] = spades[i];
                }
                spadesCount--;
            }
        }
    }

    /**
     * Returns the string in specific format
     *
     * @return string
     */
    @Override
    public String toString() {
        String str = "\nHearts Array:";
        str += "[";
        for (Card c : hearts) {
            if (c != null) {
                str += c.toString();
            }
        }
        str += "]";
        str += "\nDiamonds Array:";
        str += "[";
        for (Card c : diamonds) {
            if (c != null) {
                str += c.toString();
            }
        }
        str += "]";
        str += "\nSpades Array:";
        str += "[";
        for (Card c : spades) {
            if (c != null) {
                str += c.toString();
            }
        }
        str += "]";
        str += "\nClubs Array:";
        str += "[";
        for (Card c : clubs) {
            if (c != null) {
                str += c.toString();
            }
        }
        str += "]";
        return str;
    }
}
