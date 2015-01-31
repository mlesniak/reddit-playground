package com.mlesniak.reddit;

import com.mlesniak.runner.BaseRunner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @author Michael Lesniak (mail@mlesniak.com)
 */
public class Main extends BaseRunner {
    public static void main(String[] args) throws Exception {
        BaseRunner.initRunner(RedditConfiguration.class, "reddit", args);
        new Main().run();
    }

    private void run() throws IOException {
        info("Starting...");

        Document doc = Jsoup
                .connect("http://www.reddit.com/r/programming/")
                .userAgent("News bot by /u/mlesniak")
                .get();
        Elements elements = doc.select(".entry .title .title");

        for (Element element : elements) {
            info(element.text());
        }

        info("Done");
    }
}
