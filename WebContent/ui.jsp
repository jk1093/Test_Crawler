<%@ page import="com.miner.crawler.*,org.jsoup.Jsoup,java.util.Iterator,java.util.Set" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<title>Spider</title>
<style>
  * {
    box-sizing: border-box; 
  }
  body {
    display: flex;
    min-height: 100vh;
    flex-direction: row;
    margin: 0;
  }
  .col-1 {
    background: #D7E8D4;
    flex: 1;
  }
  .col-2 {
    display: flex;
    flex-direction: column;
    flex: 5;
  }
  .content {
    display: flex;
    flex-direction: row;
  }
  .content > article {
    flex: 4;
    min-height: 60vh;
  }
  header, footer {
    background: yellowgreen;
    height: 20vh;
  }
  header, footer, article, nav {
    padding: 1em;
  }
</style>
<body>
  <nav class="col-1"><h2><center>Top Tweets</center></h2>
  <a class="twitter-timeline" href="https://twitter.com/realDonaldTrump?ref_src=twsrc%5Etfw">Tweets by realDonaldTrump</a> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
  </nav>
  <div class="col-2">
  	<header><h1><center>Mined articles related to Donald Trump from CNN</center></h1></header>
    <main class="content">
    <article>Articles<br>
    <% Spider ob=new Spider(); 
    String url=ob.search("https://edition.cnn.com/","Donald Trump");
     out.println("<a href="+url+"</a>");%>
           <br>
       
       <% out.flush();
       %>
    </article>
    </main>
  	<footer>Jainendra Kumar</footer>
  </div>
</body>
</body>
</html>