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
        String [] allVerbs = new String[] {"hit", "awarded", "smashed", "drowned", "crowned", "stabbed" };
        String [] allCompl = new String[] {" with pigeonpoop", " by a furious monkey", " by a lovely kitty"};

        while(true){
          for(String sign: allSigns){
            String verb = (allVerbs[new Random().nextInt(allVerbs.length)]);
            String complement = (allCompl[new Random().nextInt(allCompl.length)]);
            Status status = twitter.updateStatus("Dear " + sign + " today you will be " + verb + complement);
            System.out.println("Done.");
            Thread.sleep(60*60*1000);
          }
          Thread.sleep(12*60*60*1000);
        }
    }
}
