package naayadaa.AlgorithmCourse.WebCrawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by AnastasiiaDepenchuk on 15-Nov-17.
 */
public class WebCrawler {

    private Queue<String> queue;
    private List<String> discoveredWebSitesList;

    public WebCrawler() {
        this.queue = new LinkedList<>();
        this.discoveredWebSitesList = new ArrayList<>();
    }

    public void discoverWeb(String root){
        this.queue.add(root);
        this.discoveredWebSitesList.add(root);

        while ( !queue.isEmpty() ){

            String v = this.queue.remove();

            String rawHtml = readUrl(v);

            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);

            while(matcher.find()){

                String actualUrl = matcher.group();

                if( !discoveredWebSitesList.contains(actualUrl) ){
                    discoveredWebSitesList.add(actualUrl);
                    System.out.println("Website has bee found: " + actualUrl);
                    queue.add(actualUrl);
                }
            }

        }
    }

    private String readUrl(String v) {
        String rawHtml = "";

        try {
            URL url = new URL(v);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

            String inputLine = "";

            while ((inputLine = in.readLine()) != null){
                rawHtml += inputLine;
            }

            in.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        return rawHtml;
    }
}
