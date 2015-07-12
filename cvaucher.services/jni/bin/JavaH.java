package uy.com.cvaucher.services.jni;

public class JavaH {
	public native void omtJavaH();
	static{
		System.loadLibrary("/lib/libomtC");
	}
}
