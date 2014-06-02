package groovysampleapp


/**
 *
 * @author rmoguel
 */
println "This is groovy program" 
def yui = new Dog(name:"Yui")
println yui.bark()

class Dog {
    String name

    String bark(){
         """ ${this.name} is barking! woof! """
    }
}
  

