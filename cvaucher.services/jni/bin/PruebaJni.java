package uy.com.cvaucher.services.jni;

public class PruebaJni 
{
public native void jniC(int a, int b);
	
	static{
		System.loadLibrary("Cjni");
	}		
}
