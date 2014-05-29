package groovysampleapp

import groovyCode.Dog

/**
 *
 * @author rmoguel
 */
class GroovySampleApp {

    public static void main(String[] args) {
        System.out.println("This is groovy program");
        Dog yui = new Dog();
        yui.setName("Yui");
        System.out.println(yui.bark());
    }
}
  

