package cat.FunD.config;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
// Tomcat(서버) 구동과 관련

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	// 한글 깨짐 방지 필터
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);

		return new Filter[] { characterEncodingFilter };
	}
	
	// 파일 업로드 설정
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {

		registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");

		MultipartConfigElement multipartConfig = 
				new MultipartConfigElement("C:\\upload\\temp", 
						20971520, 
						41943040,
						20971520);
		
		registration.setMultipartConfig(multipartConfig);

	}

}
