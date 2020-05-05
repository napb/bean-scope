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
    System.out.println("Thread: " + Thread.currentThread().getName());
    System.out.println("ID controlador: " + this.hashCode() + " / " + this.toString());
    System.out.println("ID servicioPrototype: " + servicioPrototype.hashCode() + " / " + servicioPrototype.toString());
    System.out.println("ID servicioRequest: " + servicioRequest.hashCode() + " / " + servicioRequest.toString());
    System.out.println("ID servicioSingleton: " + servicioSingleton.hashCode() + " / " + servicioSingleton.toString());

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
