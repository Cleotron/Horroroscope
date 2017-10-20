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
        String [] allVerbs = new String[] {"be hit", " be bitten", "be smashed", "be drowned in pigeonpoop", "be burnt", "be stabbed", "be beheaded", "be squashed", "be impaled", "be bled to death", "be chopped", "be infected", "be shot", "be run over", "be hit on the head", "be poisoned", "have your veins cut open", "be forced to drink shampoo", "be skinned", "be cut into julienne strips", "be punched to death", "be eye-gouged", "be buried alive", "have your throat slit", "be eviscerated", "have your nails ripped off", "have a vivisection done", "be cooked", "be cremated", "be experimented on", "be eaten alive", "be forced to cut your own feet", "be pushed into a black hole"};
        String [] allCompl = new String[] {" by a furious monkey", " by a lovely kitty", " by my little pony", " by Cthulhu", " by the Kraken", " with a rusty axe", " with your dog's leash", " with a hammer", " by your neighbour", " by a mutant bee", " by a hungry koala", " by a crossed eyed spider", "by Son Goku", "with a potato peeler", "by your coworker", "in the dumpster", "under the sea", "in the subway", "by a cab driver", "in a family meeting", "by a haunted doll", "in some basement", "with a letter opener", "by a Teletubbie", "on TV", "in a reality show", "by aliens"};

        while(true){
          for(String sign: allSigns){
            String verb = (allVerbs[new Random().nextInt(allVerbs.length)]);
            String complement = (allCompl[new Random().nextInt(allCompl.length)]);
            Status status = twitter.updateStatus("Dear " + sign + ", today you will " + verb + complement);
            System.out.println("Done.");
            Thread.sleep(60*60*1000);
          }
          Thread.sleep(12*60*60*1000);
        }
    }
}
