#Array Dimensions
The number of dimensions in an array is limited to **255 by the size** of the dimensions opcode of the multianewarray instruction and by the constraints imposed on the multianewarray, anewarray, and newarray instructions (§4.9.1, §4.9.2).

---

###Eclipse Error Message
```java
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Too many array dimensions. Maximum is 255
	
	at array_dimensions.ArrayDimensionsMax.main(ArrayDimensionsMax.java:5)
```

###JAVAC Error Message
```java
ArrayDimensionsMax.java:21: error: array type has too many dimensions
		largeArray;
		^
1 error

```

####Absolutely Unheard Of!
