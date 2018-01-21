# Test_Crawler

A web crawler is an internet bot that systematically browses the World Wide Web, typically for the purpose of web indexing. To design the web crawler in JAVA and HTML I have used the following: 
1) Eclipse Oxygen(4.7.2)
2) jsoup-1.11.2.jar
3) Apache Tomcat v8.0 Server
4) Tomcat Servlet API-8.0.15
The crawler will work in the following manner: 
•	Search and retrieve a webpage from the given website.
•	Store all the links in a Linked List.
•	Search through all the words on the page. 
•	Check and match the word we are looking for in the list of words.
•	Go to the next link.

# 1) Spider.java class
In this class I have created a Java Set (webpagesVisited) and a list (webpagesToVisit). All the pages that are unique (visited) will be stored in a set while the list will store the URLs that we need to visit next. If the URL is already visited it will not be added in the set as the set will only contain unique entries. In that case, we will keep looping through the list. This class will pass the current URL of the page and the word to be searched to another class called SpiderLeg.java

# 2) SpiderLeg.java class
In this class I have created a method called crawl that will make a HTTP request and will retrieve all the text and links from the current URL of the page. For this purpose I have used jsoup-1.11.2 jar that will make a request and parse the response.
Only after a successful crawl, another method called searchForWord will look for the word to be searched and return all the links containing the word.

# 3) SpiderTest.java class 
This is class that will instantiate the Spider class object. 

Converting the console application to Dynamic Web Application and integrating with Twitter:

After successful run I have converted my console Java application to a JSP application. This has allowed me to dynamically imbed HTML contents within my application. I have also embedded a twitter timeline within my web application by creating a twitter widget. The layout and functionality is still basic and in its early stage. The links can be clicked to display the article.

# Converting the console application to Dynamic Web Application and integrating with Twitter:

After successful run I have converted my console Java application to a JSP application. This has allowed me to dynamically imbed HTML contents within my application. I have also embedded a twitter timeline within my web application by creating a twitter widget. The layout and functionality is still basic and in its early stage. The links can be clicked to display the article


# Pending action points: 

•	Titles of the crawled information instead of displaying direct links.
•	More Convenient way of displaying the information.

# Additional features that are added: 

•	USER_AGENT:  A user agent will specify that the information is crawled by a desktop web browser so the server will not mistake that the information being retrieved is for mobile device or any other device like robot. 
•	Two same pages will never be visited as only unique pages will be stored in the set after passing through a check.
•	Every URL that is being checked is retreived in a linked list. These URLs can further be utlised for any additional functionality. 


