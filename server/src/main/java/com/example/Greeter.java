/**
 * This is a package.
 */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

    /**
   * This is a greet methods.
   * @param someone
   * @return 
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
