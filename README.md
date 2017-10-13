# b4aKotlin
Demonstrate interaction between B4A and Kotlin



Build the Kotlin Jar
<pre>
kotlinc example.kt -include-runtime -d h:\master\lib\example.jar
kotlinc example.kt -include-runtime -d h:\master\project\lib\example.jar
</pre>

Build the Wrapper:

Compile the Wrapper

<pre>
  Dim At() As Int
	At = Array As Int(5, 7, 1, 4, 9, 2, 1, -1)
  Dim Kt As Kotlin
  Log(kt.summ(At))
 </pre>
