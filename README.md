#Limitations of the Java Virtual Machine

Dedicated to finding the most absurd JVM error messages known to man.

[Java Language and Virtual Machine Specifications](http://docs.oracle.com/javase/specs/)


Here's the spec, directly from the mouth of Oracle.

---

###4.11. Limitations of the Java Virtual Machine

The following limitations of the Java Virtual Machine are implicit in the class file format:

####[Limitation]()
The per-class or per-interface constant pool is limited to **65535 entries** by the 16-bit constant_pool_count field of the ClassFile structure (§4.1). This acts as an internal limit on the total complexity of a single class or interface.

####[Method Body](src/method_body)
The amount of code per non-native, non-abstract method is limited to **65536 bytes** by the sizes of the indices in the exception_table of the Code attribute (§4.7.3), in the LineNumberTable attribute (§4.7.8), and in the LocalVariableTable attribute (§4.7.9).

####[Limitation]()
The number of fields that may be declared by a class or interface is limited to **65535 by the size** of the fields_count item of the ClassFile structure (§4.1).

> Note that the value of the fields_count item of the ClassFile structure does not include fields that are inherited from superclasses or superinterfaces.

####[Number of Methods](src/number_of_methods)
The number of methods that may be declared by a class or interface is limited to **65535 by the size** of the methods_count item of the ClassFile structure (§4.1).

> Note that the value of the methods_count item of the ClassFile structure does not include methods that are inherited from superclasses or superinterfaces.

####[Limitation]()
The number of direct superinterfaces of a class or interface is limited to **65535 by the size** of the interfaces_count item of the ClassFile structure (§4.1).

####[Limitation]()
The greatest number of local variables in the local variables array of a frame created upon invocation of a method (§2.6) is limited to **65535 by the size** of the max_locals item of the Code attribute (§4.7.3) giving the code of the method, and by the 16-bit local variable indexing of the Java Virtual Machine instruction set.

> Note that values of type long and double are each considered to reserve two local variables and contribute two units toward the max_locals value, so use of local variables of those types further reduces this limit.

####[Limitation]()
The size of an operand stack in a frame (§2.6) is limited to **65535 values** by the max_stack field of the Code attribute (§4.7.3).

> Note that values of type long and double are each considered to contribute two units toward the max_stack value, so use of values of these types on the operand stack further reduces this limit.

####[Limitation]()
The number of method parameters is limited to **255 by the definition** of a method descriptor (§4.3.3), where the limit includes one unit for this in the case of instance or interface method invocations.

> Note that a method descriptor is defined in terms of a notion of method parameter length in which a parameter of type long or double contributes two units to the length, so parameters of these types further reduce the limit.

####[Limitation]()
The length of field and method names, field and method descriptors, and other constant string values (including those referenced by ConstantValue (§4.7.2) attributes) is limited to **65535 characters** by the 16-bit unsigned length item of the CONSTANT_Utf8_info structure (§4.4.7).

> Note that the limit is on the number of bytes in the encoding and not on the number of encoded characters. UTF-8 encodes some characters using two or three bytes. Thus, strings incorporating multibyte characters are further constrained.

####[Array Dimensions](src/array_dimensions)
The number of dimensions in an array is limited to **255 by the size** of the dimensions opcode of the multianewarray instruction and by the constraints imposed on the multianewarray, anewarray, and newarray instructions (§4.9.1, §4.9.2).
