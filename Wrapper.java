package com.Kotlin;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.*;

@Version(1.0f)
@ShortName("Kotlin")
@DependsOn(values={"example"})
public class Kotlin {
	public int randomnumber(int x,int z) {
	BA.Log("Kotlin fun to from called");
	new demo.b4akotlin();
	return demo.DemoUtils.rand(x , z);
	}

	public static int summ(int[] a) {
		BA.Log("Kotlin fun int array called");
	new demo.b4akotlin();
	return demo.DemoUtils.sum(a);
	}

	public static int findpairs(int[] a) {
		BA.Log("Kotlin fun pairs called");
	new demo.b4akotlin();
	return demo.DemoUtils.findPairless(a);
	}
}
