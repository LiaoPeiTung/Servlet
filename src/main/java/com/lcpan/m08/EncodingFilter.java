package com.lcpan.m08;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpFilter;

@WebFilter(urlPatterns = "/EncodingFilterDemo", initParams = @WebInitParam(name = "encoding", value = "UTF-8"))
public class EncodingFilter extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;
	String encoding;

	public EncodingFilter() {
		super();
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (encoding != null) {
			request.setCharacterEncoding(encoding);
			response.setContentType("text/html;charset=" + encoding);
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		encoding = fConfig.getInitParameter("encoding");
	}
}
