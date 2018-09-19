package ca.ualberta.cs.lonelytwitter;

public class TweetTooLongException extends Exception {

        TweetTooLongException() {
            super("the message is too long! Please keep your tweets within 140 characters.");
        }
}
