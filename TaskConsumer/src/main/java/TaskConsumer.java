import java.io.IOException;
// Resources used:
//
// How to fetch webpage content in java:
//     http://stackoverflow.com/questions/238547/how-do-you-programmatically-download-a-webpage-in-java
//
//

public class TaskConsumer {

    // My inputs are:
    // Hash of last webpage content
    // Email address of listener to inform
    // Potentially a TTL?
    public void ProcessTask(String url, int lastHash, String listenerEmail) {
//        String content = null;
//        try {
//            content = FetchContent(url);
//        } catch (IOException ex) {
//            // Mailer.SendMail(listenerEmail, "I'm sorry but it's dead Jim.");
//        }
//
//        // Set the hashes equal if we had an intermittent error; this makes it a no-op.
//        // We don't return because we need to reschedule.
//        int newHash = lastHash;
//        if (content != null) {
//            newHash = content.hashCode();
//        }
//
//        // lastHash = 0 => we have never queried before, we don't know the content...
//        // although...
//        // in the http service we could query immediately, to ensure the website
//        // exists, is reachable, and to get a starting hash. Ok, I like that.
//        if (newHash != lastHash && lastHash != 0) {
//            // We've detected a change
//        }
//
//        ScheduleTask(url, newHash, listenerEmail);
    }

    private void ScheduleTask(String url, int lastHash, String listenerEmail)
    {

    }

}