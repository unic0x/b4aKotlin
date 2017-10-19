# b4aKotlin
Demonstrate interaction between B4A and Kotlin



Build the Kotlin Jar
<pre>
kotlinc example.kt -include-runtime -d h:\master\lib\example.jar
kotlinc example.kt -include-runtime -d h:\master\project\lib\example.jar
</pre>

Build the B4A Wrapper:
<pre>
../SimpleLibraryCompiler.exe Library_Name h:\master\project  - <a href="https://www.b4x.com/android/forum/threads/tool-simple-library-compiler-build-libraries-without-eclipse.29918/">Tool</a>
</pre>

Example use of Kotlin function using B4A

<pre>
  Dim At() As Int
	At = Array As Int(5, 7, 1, 4, 9, 2, 1, -1)
  Dim Kt As Kotlin
  Log(kt.summ(At))
 </pre>


<b>Advancing - </b>

Building a more advanced jar that requires third part jars can be compiled in this way
<pre>
kotlinc hello.kt -cp thirdparty.jar -include-runtime -d kotlin.jar
</pre>
