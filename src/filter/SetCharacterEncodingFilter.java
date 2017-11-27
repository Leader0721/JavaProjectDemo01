package filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by 83731 on 2017/11/26.
 */
public class SetCharacterEncodingFilter implements Filter {
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String encoding = filterConfig.getInitParameter("encoding");
        if (encoding == null) {
            encoding = "UTF-8";
        }
        servletRequest.setCharacterEncoding(encoding);//Post请求参数编码
        servletResponse.setCharacterEncoding(encoding);
        servletResponse.setContentType("text/html;charset=UTF-8");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
