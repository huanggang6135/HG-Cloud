package org.hg.cloud.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

import static org.hg.cloud.gateway.filter.ZuulFilterType.PRE;

/**
 * @Author huangggang6135@gmail.com
 */
@Slf4j
public class PreAccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE.getType();
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        log.info("send [{}] request to [{}]", request.getMethod(), request.getRequestURL().toString());

        String accessToken = request.getParameter("accessToken");

        if(null == accessToken){
            log.info("access token is empty");
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            return null;
        }
        log.info("access token ok");
        return null;
    }
}
