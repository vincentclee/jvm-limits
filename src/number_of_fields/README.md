#Number of Fields

The number of fields that may be declared by a class or interface is limited to **65535 by the size** of the fields_count item of the ClassFile structure (§4.1).

> Note that the value of the fields_count item of the ClassFile structure does not include fields that are inherited from superclasses or superinterfaces.

---

###Eclipse Error Message
```
Error: Could not find or load main class number_of_fields.ClassFieldsMax
```

###JAVAC Error Message
```java
ClassFieldsMax.java:3: error: too many constants
public class ClassFieldsMax {
       ^
1 error
```

####Absolutely Unbelievable!
