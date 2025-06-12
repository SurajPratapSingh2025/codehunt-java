package app.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

//@WebFilter("/MyFilter")
@WebFilter(urlPatterns= {"/*"})
public class MyFilter extends HttpFilter implements Filter {
	
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("PRE FILTER");
		chain.doFilter(request, response);
		System.out.println("POST FILTER");
	}
	
	

}
