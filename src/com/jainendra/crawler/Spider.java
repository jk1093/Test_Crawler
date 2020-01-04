//tst
package com.jainendra.crawler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
public class Spider
{
  private static final int MAX_NO_OF_PAGES = 120;
  private Set<String> webpagesVisited = new HashSet<String>();
  private List<String> webpagesToVisit = new LinkedList<String>();
  int i=1;
  public void string search(String url, String word)
  {
      while(this.webpagesVisited.size() < MAX_NO_OF_PAGES)
      {
          String presentUrl;
          SpiderLeg leg = new SpiderLeg();
          if(this.webpagesToVisit.isEmpty())
          {
              presentUrl = url;
              this.webpagesVisited.add(url);
          }
          else
          {
              presentUrl = this.nextUrl();
          }
          leg.crawl(presentUrl); 
          boolean success = leg.searchForWord(word);
          if(success)
          {   
              if (i==1)
              {
              System.out.println(String.format("SUCCESS\n Word %s found at:\n\n", word)); 
              i=i+1;
              }
              
              return presentUrl;
          }
          this.webpagesToVisit.addAll(leg.getLinks());
      }
      System.out.println("\n**Done** Visited " + this.webpagesVisited.size() + " web page(s)");
     }
  private String nextUrl()
  {
      String nextUrl;
      do
      {
          nextUrl = this.webpagesToVisit.remove(0);
      } while(this.webpagesVisited.contains(nextUrl));
      this.webpagesVisited.add(nextUrl);
      return nextUrl;
  }
  }
