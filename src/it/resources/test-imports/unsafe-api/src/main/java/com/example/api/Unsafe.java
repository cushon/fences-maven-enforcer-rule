package com.example.api;

public class Unsafe {
  public void pushRedButton() {
    for (int i = 10; --i >= 0;) {
      System.err.println("T - " + i);
    }
    System.exit(-1);
  }
}