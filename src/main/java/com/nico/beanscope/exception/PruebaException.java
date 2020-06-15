package com.nico.beanscope.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.GATEWAY_TIMEOUT)
public class PruebaException extends RuntimeException {

  private String pruebaName;

  public PruebaException(String message, Throwable cause) {
    super(cause);
    this.pruebaName = message;
  }

  public String getPruebaName() {
    return pruebaName;
  }
}
