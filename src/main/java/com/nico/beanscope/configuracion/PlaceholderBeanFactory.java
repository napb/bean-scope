package com.nico.beanscope.configuracion;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceholderBeanFactory {

  @Bean("propertyPrueba")
  @ConfigurationProperties(prefix = "prueba.property.campo")
  public PlaceholderPrueba propertyPrueba() {
    return new PlaceholderPrueba();
  }

}
