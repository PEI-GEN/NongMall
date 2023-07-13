package com.pei.mailcart.config;

import com.pei.mailcart.interceptor.CartInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: PEIGEN
 * @createTime: 2020-06-27 08:52
 **/
@Configuration
public class MymailWebConfig implements WebMvcConfigurer {
    /**·
     * 配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new CartInterceptor()).addPathPatterns("/**");
    }

}
