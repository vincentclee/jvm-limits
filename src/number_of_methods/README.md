#Number of Methods

The number of methods that may be declared by a class or interface is limited to 65535 by the size of the methods_count item of the ClassFile structure (§4.1).

> Note that the value of the methods_count item of the ClassFile structure does not include methods that are inherited from superclasses or superinterfaces.

---

###Eclipse Error Message
```java
Error: Could not find or load main class number_of_methods.class_methods
```

###JAVAC Error Message
```java
Degree.java:3: error: too many constants
public interface Degree {
       ^
1 error
```

####Absolutely Bonkers!
