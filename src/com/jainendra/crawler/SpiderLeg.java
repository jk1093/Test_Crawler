package com.jainendra.crawler;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class SpiderLeg
{
    private List<String> links = new LinkedList<String>();
    private Document htmlDocument;
    private static final String agent ="Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.1 (KHTML, like Gecko) Chrome/13.0.782.112 Safari/535.1";
    
    public boolean crawl(String url)
    {
        try
        {
            Connection connection = Jsoup.connect(url).userAgent(agent);
            Document htmlDocument = connection.get();
            this.htmlDocument = htmlDocument;
            if(connection.response().statusCode() == 200) 
            {
            Elements linksOnPage = htmlDocument.select("a[href]");
            for(Element link : linksOnPage)
            {
                this.links.add(link.absUrl("href"));
            }
            return true;
        }
        catch(IOException ioe)
        {
            return false;
        }
        
    }
	}
    public boolean searchForWord(String searchWord)
    {
        if(this.htmlDocument == null)
        {
            System.out.println("ERROR!");
            return false;
        }
        String bodyText = this.htmlDocument.body().text();
        return bodyText.toLowerCase().contains(searchWord.toLowerCase());
    }
     public List<String> getLinks()
    {
        return this.links;
    }
}
