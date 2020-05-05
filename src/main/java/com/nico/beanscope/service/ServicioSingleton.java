package com.nico.beanscope.service;

import org.springframework.stereotype.Service;

@Service("servicioSingleton")
public class ServicioSingleton implements Servicio {

  public String prueba;

  @Override
  public void mostrarInfo() {
    prueba = "singleton";
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
