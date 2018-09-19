package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
public class importantTweet extends Tweet{
    importantTweet() {
        super();
    }
    importantTweet(String message){
        super(message);
    }
    @Override
    public Boolean isImportant(){
        return true;
    }
}
