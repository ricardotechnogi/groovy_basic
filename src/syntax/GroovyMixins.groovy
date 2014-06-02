/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package syntax

/**
 *
 * @author rmoguel
 */
print "Running Mixins and Categories!"


@Category(Animal) class FlyingAbility {
    def fly() { "I'm a ${name} and I fly!" }
    def walk() { "I'm a ${name} and I walk flying!" }
}

@Category(Animal) class SwimmingAbility {
    def swim() { "I'm a ${name} and I swim!" }
    def walk() { "I'm a ${name} and I walk swimming!" }
}

interface Animal {
    String getName()
}

@Mixin(SwimmingAbility)
class Fish implements Animal {
    String getName() { "fish" }
}

@Mixin(FlyingAbility)
class Bird implements Animal {
    String getName() { "bird" }
}

@Mixin([SwimmingAbility,FlyingAbility])
class Duck implements Animal {
    String getName() { "duck" }
    def walk() { "I'm a ${name} and I walk as a duck!" }
}

assert new Bird().fly() ==
       "I'm a bird and I fly!"
assert new Fish().swim() ==
       "I'm a fish and I swim!"

assert new Duck().fly() ==
       "I'm a duck and I fly!"
assert new Duck().swim() ==
       "I'm a duck and I swim!"

println new Duck().walk()
