# Number of Direct Superinterfaces

The number of direct superinterfaces of a class or interface is limited to **65535 by the size** of the interfaces_count item of the ClassFile structure (§4.1).

---

### Stack Overflow
```console
[vincentlee@ivybridge number_of_direct_superinterfaces]$ javac *


The system is out of resources.
Consult the following stack trace for details.
java.lang.StackOverflowError
	at com.sun.tools.javac.code.Types.union(Types.java:2713)
	at com.sun.tools.javac.code.Types.union(Types.java:2709)
	at com.sun.tools.javac.code.Types.union(Types.java:2709)
	at com.sun.tools.javac.code.Types.union(Types.java:2709)
	at com.sun.tools.javac.code.Types.union(Types.java:2709)
	at com.sun.tools.javac.code.Types.union(Types.java:2709)
	at com.sun.tools.javac.code.Types.union(Types.java:2709)
	at com.sun.tools.javac.code.Types.union(Types.java:2709)
	at com.sun.tools.javac.code.Types.union(Types.java:2709)
	at com.sun.tools.javac.code.Types.union(Types.java:2709)

```

#### Absolutely Ravin' Bonkers!
