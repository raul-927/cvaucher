package uy.com.cvaucher.services.jni;

public class CvaucherJni {
	
	public native int holaMundo(int a, int b);
	
	static{
		System.loadLibrary("libcvaucherC");
	}

}
