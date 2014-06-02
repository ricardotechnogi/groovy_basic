package syntax

/**
 *
 * @author rmoguel
 */
println "Running Sintaxes"
//-------STATEMENTS


//        def (a, b) = [1, 2]
//        assert a == 1
//        assert b == 2
        
//        def (_lat, _long) = geocode("Paris")
//        assert _lat == 48.824068
//        assert _long == 2.531733

//        def elements = [1, 2]
//        def (a, b, c) = elements
//        assert a == 1
//        assert b == 2
//        assert c == null

//        def a = 1, b = 2
//        (a, b) = [b, a]         
//        assert a == 2
//        assert b == 1

//-----------OPTIONAL PARENTHESIS

//        def p = calculatePrice 2,4
//        assert p == 9.84
        
//-----------NAMED PARAMETERS

//        def myDog = new Dog (name:"Yui",owner:"Ricardo")
//        assert myDog.name == "Yui"

//-----------SAFE NAVIGATION

//            def foo = new Expando(something:null)
//            def bar = foo?.something?.myMethod()
//            assert bar == null
            
//-----------CLOSURES

//        def printSum = { a, b -> println a+b }
//        printSum( 5, 7 )
//        
//        
//        def greet = { println "Hello ${it}!" }
//        greet( "Technogi") 
//        
//        
//        def myConst = 5
//        def incByConst = { num -> num + myConst }
//        println incByConst(10) 

        
//-----------USEFUL CLOSURES

//        def list = ['a','b','c','d']
//        def newList = []
//        list.collect( newList ) {
//          it.toUpperCase()
//        }
//        println newList 
//        
//        
//        def list2 = ["a","b","c","d"]
//        def newList2 = []
//        def clos = { if (it.metaClass.respondsTo(it,"toUpperCase")){it.toUpperCase()}else{"caca"} }
//        list2.collect( newList2, clos )
//        print newList2

//-----------LIST
//        def list = [5, 6, 7, 8]
//        assert list.get(2) == 7
//        assert list[2] == 7
//        assert list instanceof java.util.List
//        
//        def emptyList = []
//        assert emptyList.size() == 0
//        emptyList.add(5)
//        assert emptyList.size() == 1


//-----------RANGE
//        def range = 5..8
//        assert range.size() == 4
//        assert range.get(2) == 7
//        assert range[2] == 7
//        assert range instanceof java.util.List
//        assert range.contains(5)
//        assert range.contains(8)
//
//        def range2 = 1..10
//        assert range2.from == 1
//        assert range2.to == 10

//        def range = 'a'..'d'
//        assert range.size() == 4
//        assert range.get(2) == 'c'
//        assert range[2] == 'c'
//        assert range instanceof java.util.List
//        assert range.contains('a')
//        assert range.contains('d')
//        assert ! range.contains('e')

//        def clos = {i->println "Hello closure${i}"}
//        (1..10).each { i ->
//          println "Hello ${i}"
//        }

//          def years = 5
//        switch (years) {
//           case 1..10: interestRate = 0.076
//                        break
//          case 11..25: 
//                        interestRate = 0.052
//                        break;
//              default: interestRate = 0.037
//        }


//-----------MAPS

//        def map = [name:"Gromit", likes:"cheese", id:1234, t:{println "hello world"}]
//        assert map.get("name") == "Gromit"
//        assert map.get("id") == 1234
//        assert map["name"] == "Gromit"
//        assert map['id'] == 1234
//        assert map.name =="Gromit"
//        println map.t
//        assert map instanceof java.util.Map


//        assert [1, 3, 5] == ['a', 'few', 'words']*.size()

//----------INDEX OF

//        def text = "nice cheese gromit!"
//        def x = text[2]
//        assert text[0..-2]=="nice cheese gromit"
//        assert x == "c"
//        assert x.class == String
//
//        def sub = text[5..10]
//        assert sub == 'cheese'
//
//        def map = [name:"Gromit", likes:"cheese", id:1234]
//
//        assert map["name"] == "Gromit"
//        assert map.name == "Gromit"
//
//        def list = [10, 11, 12]
//        def answer = list[2]
//        assert answer == 12


//        def list = 100..200
//        def sub = list[1, 3, 20..25, 33]
//        assert sub == [101, 103, 120, 121, 122, 123, 124, 125, 133]


//------------NEGATIVE INDEX
//        def text = "nice cheese gromit!"
//        def x = text[-1]
//        assert x == "!"
//
//        def name = text[-7..-2]
//        assert name == "gromit"


//-----------EXPANDOS
//        def player = new Expando()
//        player.name = "Dierk"
//        player.greeting = { "Hello, my name is $name" }
//
//        println player.greeting()
//        player.name = "Jochen"
//        println player.greeting()        
    
   
    
    
def static geocode(String location) {
    [48.824068, 2.531733]
}

def calculatePrice(multiplyer,mult2) {
            1.23*multiplyer*mult2
}



class Dog{
    String name
    String owner
}

