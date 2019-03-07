# Scala Training

## Basic types
Look at the method `sum` in `MathInt.scala`.
 
## var vs val
```bash
scala> var a: Int = 3
a: Int = 3

scala> a = 4
a: Int = 4
```

```bash
scala> val a: Int = 3
a: Int = 3

scala> a = 4
<console>:12: error: reassignment to val
       a = 4
         ^
```

## Methods and Functions
Look at the method `sum` and the function `product` in `Math.scala`.

## Package, Class, Case Class, Trait, Object
Look at the files `Math.scala` and `MathInt.scala`.

## Function arguments
Look at the files `Math.scala` and `MathInt.scala`.

## Type inference
Look at the file `Main.scala`.

It does not work with recursive methods, when polymorphic methods are called or generic classes are instantiated.
Also, the compiler never infers method parameter types, but it does in anonymous functions when the function is passed as argument. 

Not recommended at all.