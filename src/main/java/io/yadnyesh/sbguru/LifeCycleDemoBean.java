package io.yadnyesh.sbguru;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
	
	@Override
	public void destroy() throws Exception {
	
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	
	}
	
	@Override
	public void setBeanName(String s) {
	
	}
}
