# b4aKotlin
Demonstrate interaction between B4A and Kotlin



Build the Kotlin Jar
<pre>
kotlinc example.kt -include-runtime -d h:\master\lib\example.jar
kotlinc example.kt -include-runtime -d h:\master\project\lib\example.jar
</pre>

Build the B4A Wrapper:
<pre>
Simple Library Compiler   - <a href="https://www.b4x.com/android/forum/threads/tool-simple-library-compiler-build-libraries-without-eclipse.29918/">Tool</a>
</pre>

Example use of Kotlin function using B4A

<pre>
  Dim At() As Int
	At = Array As Int(5, 7, 1, 4, 9, 2, 1, -1)
  Dim Kt As Kotlin
  Log(kt.summ(At))
 </pre>
