#Method Parameters

The number of method parameters is limited to **255 by the definition** of a method descriptor (§4.3.3), where the limit includes one unit for this in the case of instance or interface method invocations.

>Note that a method descriptor is defined in terms of a notion of method parameter length in which a parameter of type long or double contributes two units to the length, so parameters of these types further reduce the limit.

---

###Eclipse Error Message
```java
Exception in thread "main" java.lang.ClassFormatError: Too many arguments in method signature in class file method_parameters/MethodParametersMax
	at java.lang.ClassLoader.defineClass1(Native Method)
	at java.lang.ClassLoader.defineClass(ClassLoader.java:800)
	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
	at java.net.URLClassLoader.defineClass(URLClassLoader.java:449)
	at java.net.URLClassLoader.access$100(URLClassLoader.java:71)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:361)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:425)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:308)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:358)
	at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:482)

```

###JAVAC Error Message
```java
MethodParametersMax.java:10: error: too many parameters
	public void bigInput(
	            ^
1 error

```

####Absolutely Wicked!
