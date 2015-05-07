package com.hackbulgaria.newsagragator;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xml.sax.InputSource;

import sun.awt.image.ByteArrayImageSource;

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
	public static final String HTML_START = "<html><body>";
	public static final String HTML_END = "</body></html>";
	private final Charset UTF8_CHARSET = Charset.forName("UTF-8");
 
       
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
		
		PrintWriter out = response.getWriter();
		out.print(HTML_START);
		
		XmlReader reader = null;
		
		
		try {
			
			feed = input.build(new XmlReader(httpcon));
			
			feed.setEncoding("UTF-8");
			List entries = feed.getEntries();
			Iterator itEntries = entries.iterator();
			
			System.out.println("Encoding feed: " + feed.getEncoding());
			
			while (itEntries.hasNext()) {
				SyndEntry entry = (SyndEntry) itEntries.next();
				//System.out.println("Title: " + Charset.forName("UTF-8").encode(entry.getTitle())); //decodeUTF8(entry.getTitle().getBytes(), UTF8_CHARSET));
				
			
				
				String str = entry.getTitle();
				String newStr = new String(str.getBytes(Charset.forName("ISO_8859_1")), Charset.forName("UTF-8")).toString();
				String encoded = new ByteArrayImageSource(entry.getTitle().getBytes(UTF8_CHARSET)).toString();
				String str3 = new String(entry.getTitle().getBytes(UTF8_CHARSET), StandardCharsets.UTF_8);
				String str5 = Charset.forName("UTF-8").encode(str).toString();
				
				byte ptext[] = str.getBytes(Charset.forName("Cp1252")); 
				String value = new String(ptext, Charset.forName("UTF-8")); 
				
				System.out.println("S\u00e3o Paulo"); // Sao Paolo 
				System.out.println(System.getProperty("sun.jnu.encoding"));
				System.out.println(new String(new byte[]{-109}, "Cp1252")); 
				String str4 = new String(entry.getTitle().getBytes(), "UTF-8");
				 
				//ByteArrayImageSource b = new ByteArrayImageSource(entry.getTitle().getBytes("UTF-8"));
				byte[] b = entry.getTitle().getBytes("UTF-8");
				System.out.println(new String(b));
				
				System.out.println("str: "+str);
				System.out.println("newStr" + newStr);
				System.out.println("encoded" + encoded);
				System.out.println("str3: "+str3);
				System.out.println("str4: "+str4);
				System.out.println("str5: "+str5);
				System.out.println("value: "+value);
				
//				System.out.println(URLDecoder(entry.getTitle().toString(), "UTF-8"));
				// new String(s.getBytes("UTF-8"), "ISO-8859-1");
			//	System.out.println(new String(entry.getTitle().getBytes("UTF-8")));
			//	System.out.println("Title: " + new ByteArrayImageSource(entry.getTitle().getBytes("UTF-8")).toString()); //decodeUTF8(entry.getTitle().getBytes(), UTF8_CHARSET));
                
				System.out.println("Link: " + entry.getLink());
				System.out.println("Author: " + entry.getAuthor());
				System.out.println("Publish Date: " + entry.getPublishedDate());
				System.out.println("Description: " + entry.getDescription().getValue());
				System.out.println();
				
				out.println("Title: " + entry.getTitle());
				out.println("Link: " + entry.getLink());
				out.println("Author: " + entry.getAuthor());
				out.println("Publish Date: " + entry.getPublishedDate());
				out.println("Description: " + entry.getDescription().getValue());
				out.println("<br>");
			}
		} catch (IllegalArgumentException | FeedException e) {
			// TODO Auto-generated catch block
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
	
//	private String decodeUTF8(byte bytes) {
//	    return new String(bytes, UTF8_CHARSET);
//	}

}
