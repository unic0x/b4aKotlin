# b4aKotlin
Demonstrate interaction between B4A and Kotlin



Build the Kotlin Jar
<pre>
kotlinc example.kt -include-runtime -d h:\master\lib\example.jar
kotlinc example.kt -include-runtime -d h:\master\project\lib\example.jar
</pre>

Build the Wrapper:
new demo.b4akotlin();
	return demo.DemoUtils.sum(a);
<pre>
SimpleLi   - <a href="https://www.b4x.com/android/forum/threads/tool-simple-library-compiler-build-libraries-without-eclipse.29918/">Tool</a>
</pre>

Compile the Wrapper

<pre>
  Dim At() As Int
	At = Array As Int(5, 7, 1, 4, 9, 2, 1, -1)
  Dim Kt As Kotlin
  Log(kt.summ(At))
 </pre>
