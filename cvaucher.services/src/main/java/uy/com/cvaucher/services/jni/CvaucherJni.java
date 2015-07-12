package uy.com.cvaucher.services.jni;

public class CvaucherJni {
	
	public native int holaMundo(int a, int b);
	
	static{
		System.load("G:/SERVERS/jboss-as-7.1.1.Final_2/standalone/deployments/cvaucher.services.war/WEB-INF/bin/libcvaucherC.dll");
	}

}
