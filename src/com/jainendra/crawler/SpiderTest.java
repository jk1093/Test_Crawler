package com.jainendra.crawler;

public class SpiderTest
{
    
    public static void main(String[] args)
    {
        Spider spider = new Spider();
        spider.search("https://edition.cnn.com/", "Donald Trump");
    }
}
