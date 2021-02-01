package cat.FunD.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;

// WebMvcConfigurer는 스프링 MVC와 관련된 설정을 메서드로 오버라이드 하는 형태를 이용할 때 사용
//@ComponentScan을 이용해서 다른 패키지에 작성된 스프링 객체 인식 가능

@EnableWebMvc
@ComponentScan(basePackages = { "cat.FunD.controller" })
public class ServletConfig implements WebMvcConfigurer {
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		bean.setViewClass(JstlView.class);
		bean.setPrefix("/WEB-INF/views/");
		bean.setSuffix(".jsp");
		// bean.setOrder(1);
		registry.viewResolver(bean);

		// InternalResourceViewResolver bean2 = new
		// InternalResourceViewResolver();
		// bean2.setViewClass(JstlView.class);
		// bean2.setPrefix("/WEB-INF/views/");
		// bean2.setSuffix(".html");
		// bean2.setOrder(2);
		// registry.viewResolver(bean2);

	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public MultipartResolver multipartResolver() {
		StandardServletMultipartResolver resolver = new StandardServletMultipartResolver();
		return resolver;
	}
}
