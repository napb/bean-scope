package com.nico.beanscope.controller;

import com.nico.beanscope.service.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/singleton")
public class ControladorSingleton {

  @Autowired
  @Qualifier("servicioPrototype")
  private Servicio servicioPrototype;

  @Autowired
  @Qualifier("servicioRequest")
  private Servicio servicioRequest;

  @Autowired
  @Qualifier("servicioSingleton")
  private Servicio servicioSingleton;

  @GetMapping("/")
  public void mostrarInfo() {

    System.out.println("ID controlador: " + this.hashCode());
    System.out.println("ID servicioPrototype: " + servicioPrototype.hashCode());
    System.out.println("ID servicioRequest: " + servicioRequest.hashCode());
    System.out.println("ID servicioSingleton: " + servicioSingleton.hashCode());
  }

}
