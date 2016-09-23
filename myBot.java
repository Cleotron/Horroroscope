//Comandos
//compilar: javac -cp twitter4j-core-4.0.4.jar MyBot.java
//run: java -cp "twitter4j-core-4.0.4.jar;." MyBot


import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import java.util.Random;

public class MyBot{

    //if something goes wrong, we might see a TwitterException
    public static void main(String... args) throws Exception{

        //access the twitter API using your twitter4j.properties file
        Twitter twitter = TwitterFactory.getSingleton();

        //send a tweet
        String [] allSigns = new String[] {"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};
        String [] allVerbs = new String[] {"hit", "bitten", "smashed", "drowned in pigeonpoop", "burnt", "stabbed", "beheaded", "squashed", "impaled", "bled to death", "chopped", "infected", "shot", "run over", "hit on the head", "poisoned", "cut your veins open", "forced to drink champu"};
        String [] allCompl = new String[] {" by a furious monkey", " by a lovely kitty", " by my little pony", " by Cthulhu", " by the Kraken", " with a rusty axe", " with your dog's leash", " with a hammer", " by your neighbour", " by a mutant bee", " by a hungry koala", " by a crossed eyed spider" };

        while(true){
          for(String sign: allSigns){
            String verb = (allVerbs[new Random().nextInt(allVerbs.length)]);
            String complement = (allCompl[new Random().nextInt(allCompl.length)]);
            Status status = twitter.updateStatus("Dear " + sign + ", today you will be " + verb + complement);
            System.out.println("Done.");
            Thread.sleep(60*60*1000);
          }
          Thread.sleep(12*60*60*1000);
        }
    }
}
