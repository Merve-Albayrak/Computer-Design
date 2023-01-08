package com.BorrowerService.Error;

 public class BorrowerNotFoundException extends Exception {

  public BorrowerNotFoundException() {
   super();
  }

  public BorrowerNotFoundException(String message) {
   super(message);
  }

  public BorrowerNotFoundException(String message, Throwable cause) {
   super(message, cause);
  }

  public BorrowerNotFoundException(Throwable cause) {
   super(cause);
  }

  protected BorrowerNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
   super(message, cause, enableSuppression, writableStackTrace);
  }
 }
