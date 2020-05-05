package com.nico.beanscope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("servicioPrototype")
@Scope("prototype")
public class ServicioPrototype implements Servicio {

  public String prueba;

  @Override
  public void mostrarInfo() {
    prueba = "prototype";
    System.out.println("servicio:" + Thread.currentThread().getName());
    try {
      Thread.sleep(20000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("");

  }

  @Override
  public String getAtributo() {
    return prueba;
  }
}
