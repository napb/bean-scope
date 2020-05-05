package com.nico.beanscope.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service("servicioRequest")
@RequestScope
public class ServicioRequest implements Servicio {

  public String prueba;

  @Override
  public void mostrarInfo() {
    prueba = "request";
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
