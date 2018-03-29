package naayadaa.AlgorithmCourse.WebCrawler;

/**
 * Created by AnastasiiaDepenchuk on 15-Nov-17.
 */
public class App {

    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();
        String rootUrl = "http://bbc.com";

        crawler.discoverWeb(rootUrl);
    }
}
