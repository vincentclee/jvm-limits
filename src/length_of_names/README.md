#Length of Names
The length of field and method names, field and method descriptors, and other constant string values (including those referenced by ConstantValue (§4.7.2) attributes) is limited to **65535 characters** by the 16-bit unsigned length item of the CONSTANT_Utf8_info structure (§4.4.7).

> Note that the limit is on the number of bytes in the encoding and not on the number of encoded characters. UTF-8 encodes some characters using two or three bytes. Thus, strings incorporating multibyte characters are further constrained.

---

###Eclipse Error Message
```java

```

###JAVAC Error Message
```java
MethodNameMax.java:3: error: UTF8 representation for string "abcdefghijklmnopqrst..." is too long for the constant pool
public class MethodNameMax {
       ^
1 error

```

####Absolutely Raging Bonkers Madness!
