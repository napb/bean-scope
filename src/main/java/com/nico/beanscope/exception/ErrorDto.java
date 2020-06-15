package com.nico.beanscope.exception;

public class ErrorDto {

  private String exName;
  private String exCause;
  private StackTraceElement[] errors;

  public ErrorDto(String exName, String exCause, StackTraceElement[] errors) {
    this.exName = exName;
    this.exCause = exCause;
    this.errors = errors;
  }

  public String getExName() {
    return exName;
  }

  public void setExName(String exName) {
    this.exName = exName;
  }

  public String getExCause() {
    return exCause;
  }

  public void setExCause(String exCause) {
    this.exCause = exCause;
  }

  public StackTraceElement[] getErrors() {
    return errors;
  }

  public void setErrors(StackTraceElement[] errors) {
    this.errors = errors;
  }
}
