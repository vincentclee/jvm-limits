#Number of Fields

The number of fields that may be declared by a class or interface is limited to **65535 by the size** of the fields_count item of the ClassFile structure (§4.1).

> Note that the value of the fields_count item of the ClassFile structure does not include fields that are inherited from superclasses or superinterfaces.


---


###Eclipse Error Message
```java
Error: Could not find or load main class number_of_fields.ClassFieldsMax
```

###JAVAC Error Message
```java
ClassFieldsMax.java:3: error: too many constants
public class ClassFieldsMax {
       ^
1 error
```
```java
[vincentlee@ivybridge number_of_fields]$ javac InstanceFieldsMax.java
InstanceFieldsMax.java:3: error: too many constants
public class InstanceFieldsMax {
       ^
1 error
```

###Stack Overflow
```java
[vincentlee@ivybridge number_of_fields]$ javac InterfaceFieldsMax.java 


The system is out of resources.
Consult the following stack trace for details.
java.lang.StackOverflowError
	at com.sun.tools.javac.util.SharedNameTable.fromChars(SharedNameTable.java:103)
	at com.sun.tools.javac.util.Names.fromChars(Names.java:284)
	at com.sun.tools.javac.parser.Scanner.scanOperator(Scanner.java:630)
	at com.sun.tools.javac.parser.Scanner.nextToken(Scanner.java:944)
	at com.sun.tools.javac.parser.JavacParser.ident(JavacParser.java:440)
	at com.sun.tools.javac.parser.JavacParser.term3(JavacParser.java:1008)
	at com.sun.tools.javac.parser.JavacParser.term2(JavacParser.java:701)
	at com.sun.tools.javac.parser.JavacParser.term1(JavacParser.java:672)
	at com.sun.tools.javac.parser.JavacParser.term(JavacParser.java:628)
	at com.sun.tools.javac.parser.JavacParser.termRest(JavacParser.java:642)
	at com.sun.tools.javac.parser.JavacParser.term(JavacParser.java:631)
	at com.sun.tools.javac.parser.JavacParser.termRest(JavacParser.java:642)
	at com.sun.tools.javac.parser.JavacParser.term(JavacParser.java:631)
	at com.sun.tools.javac.parser.JavacParser.termRest(JavacParser.java:642)
	at com.sun.tools.javac.parser.JavacParser.term(JavacParser.java:631)
	at com.sun.tools.javac.parser.JavacParser.termRest(JavacParser.java:642)
	at com.sun.tools.javac.parser.JavacParser.term(JavacParser.java:631)
	at com.sun.tools.javac.parser.JavacParser.termRest(JavacParser.java:642)
	at com.sun.tools.javac.parser.JavacParser.term(JavacParser.java:631)
	at com.sun.tools.javac.parser.JavacParser.termRest(JavacParser.java:642)
	at com.sun.tools.javac.parser.JavacParser.term(JavacParser.java:631)
	at com.sun.tools.javac.parser.JavacParser.termRest(JavacParser.java:642)
	at com.sun.tools.javac.parser.JavacParser.term(JavacParser.java:631)
	at com.sun.tools.javac.parser.JavacParser.termRest(JavacParser.java:642)
	...
```


####Absolutely Unbelievable!
