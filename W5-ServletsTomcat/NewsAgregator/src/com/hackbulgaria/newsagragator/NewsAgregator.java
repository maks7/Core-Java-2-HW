package com.hackbulgaria.newsagragator;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

/**
 * Servlet implementation class NewsAgregator
 */
@WebServlet("/NewsAgregator")
public class NewsAgregator extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String HTML_START = "<html>";
	public static final String HTML_STARTBODY = "<body>";
	public static final String HTML_END = "</body></html>";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsAgregator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		URL url = new URL("http://www.sportal.bg/uploads/rss_category_2.xml");
		HttpURLConnection httpcon = (HttpURLConnection)url.openConnection();
		// Reading the feed
		SyndFeedInput input = new SyndFeedInput();
		SyndFeed feed;
		
		response.setContentType ("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(HTML_START);
		out.print("<head>");
		out.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />");
		out.print("</head>");
		out.print(HTML_STARTBODY);
		
		try {
			feed = input.build(new XmlReader(httpcon));
			List entries = feed.getEntries();
			Iterator itEntries = entries.iterator();
			
			while (itEntries.hasNext()) {
				SyndEntry entry = (SyndEntry) itEntries.next();
			
				out.println("<br>");
				out.println("<br>Title: " + entry.getTitle());
				out.println("<br>Link: " + entry.getLink());
				out.println("<br>Author: " + entry.getAuthor());
				out.println("<br>Publish Date: " + entry.getPublishedDate());
				out.println("<br>Description: <br>" + entry.getDescription().getValue());
			}
		} catch (IllegalArgumentException | FeedException e) {
			e.printStackTrace();
		}
		
		out.print(HTML_END);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
}
