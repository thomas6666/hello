package com.example.spring.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	/**
	 * 资源加载器
	 */
	private ResourceLoader resourceLoader;

	/**
	 * Bean的名称
	 */
	private String beanName;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void outputResource() {
		System.out.println("bean name:" + this.beanName);
		try {
			String txt = IOUtils.toString(this.resourceLoader
					.getResource("classpath:com/example/spring/aware/test.txt").getInputStream());
			System.out.println("test file:" + txt);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
