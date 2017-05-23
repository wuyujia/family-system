package org.rent.config;

import com.bqmart.interceptor.ResubmitInterceptorHandler;
import com.bqmart.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by wuyujia on 2017/4/17.
 */
@Configuration
@Import(RedisUtils.class)
public class InterceptorConfig extends WebMvcConfigurerAdapter{

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(resubmitInterceptorHandler()).addPathPatterns("/**");
    }

    @Bean
    public ResubmitInterceptorHandler resubmitInterceptorHandler() {
        return new ResubmitInterceptorHandler(redisUtils);
    }
}
