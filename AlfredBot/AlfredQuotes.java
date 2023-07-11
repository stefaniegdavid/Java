import java.util.Date;


public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you doing today?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Good morning, %s. Lovely to see you today.", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("Today is %s", new Date());
    }
    
    public String respondBeforeAlexis(String phrase) {

        if(phrase.indexOf("Alexis") > -1) {
            return "Alexis is struggling at the moment. How can I help you?";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "At your service. How may I be of assistance?";
        }
        return "Okay, goodbye now.";
    }
    
}