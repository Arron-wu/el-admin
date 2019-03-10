/**
 * Copyright (C), 2019-2019, 贵州宏思锐达科技有限公司
 * FileName: ReactWebAppConfig
 * Author:   Arron-Wu
 * Date:     2019/3/10 9:26
 * Description: 静态资源配置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package me.zhengjie.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 〈一句话功能简述〉<br> 
 * 〈静态资源配置〉
 *
 * @author Arron
 * @create 2019/3/10
 * @since 1.0.0
 */
@Configuration
public class ReactWebAppConfig extends WebMvcConfigurerAdapter {
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
 registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
 super.addResourceHandlers(registry);
}
}