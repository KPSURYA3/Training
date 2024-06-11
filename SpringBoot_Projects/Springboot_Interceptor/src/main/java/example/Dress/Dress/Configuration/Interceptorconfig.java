package example.Dress.Dress.Configuration;

import org.apache.tomcat.util.modeler.Registry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import example.Dress.Dress.Interceptor.Generalinterceptor;


@Configuration
public class Interceptorconfig implements WebMvcConfigurer{
	@Autowired
	private Generalinterceptor generalInterceptor;
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(generalInterceptor);
	}
	
	
}
