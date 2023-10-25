import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupTest {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
        System.out.println(doc.title());
        Elements newsHeadlines = doc.select("#mp - itn b a");
        for (Element headline :newsHeadlines){
            String title = headline.attr("title");
            String href = headline.absUrl("href");
            String content = String.format("%s\n\t%s", title, href);
            System.out.println(content);
        }
    }
}
