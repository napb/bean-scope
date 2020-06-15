package com.nico.beanscope.exception;

import java.util.Collections;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = {"com.nico.beanscope.controller"})
public class AdviceControllers {

  @ExceptionHandler(PruebaException.class)
  public ErrorDto invokePruebaException(PruebaException e) {

    return new ErrorDto(e.getPruebaName(), "causa del problema", e.getStackTrace());
  }

}
