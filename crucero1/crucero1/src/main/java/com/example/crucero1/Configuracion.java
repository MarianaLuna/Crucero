package com.example.crucero1;

import org.springframework.boot.web.servlet.ServletRegistrationBean;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.ws.config.annotation.EnableWs;

import org.springframework.ws.transport.http.MessageDispatcherServlet;

import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;

import org.springframework.xml.xsd.XsdSchema;

import org.springframework.xml.xsd.SimpleXsdSchema;

import org.springframework.core.io.ClassPathResource;

@EnableWs
@Configuration
public class Configuracion {
	@Bean

	public XsdSchema obtenerSchema() {

		return new SimpleXsdSchema(new ClassPathResource("Crucero.xsd"));

	}

	@Bean

	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext)

	{

		MessageDispatcherServlet servlet = new MessageDispatcherServlet();

		servlet.setApplicationContext(applicationContext);

		servlet.setTransformWsdlLocations(true);

		return new ServletRegistrationBean(servlet, "/*");

	}

	@Bean(name = "crucero")

	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema obtenerSchema)

	{

		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();

		wsdl11Definition.setPortTypeName("cruceroPort");

		wsdl11Definition.setLocationUri("/crucero1");

		wsdl11Definition.setTargetNamespace("http://www.example.org/Crucero1");

		wsdl11Definition.setSchema(obtenerSchema);

		return wsdl11Definition;

	}
}
