package feb28;

public interface interface1 {
	public void CompileTimeEnv();
	public void RunTimeEnv();
}

interface python {
	public void CompileTimeEnv1();
	public void RunTimeEnv1();
}

class Eclipse implements interface1, python{
	public void CompileTimeEnv() {
		System.out.println("CompileTimeEnvfrom eclipse");
	}
	public void RunTimeEnv() {
		System.out.println("RunTimeEnv from eclipse");
	}
	
	public void CompileTimeEnv1() {
		System.out.println("CompileTimeEnvfrom eclipse");
	}
	public void RunTimeEnv1() {
		System.out.println("RunTimeEnv from eclipse");
	}
}

class Netbeans implements interface1,python{
	public void CompileTimeEnv() {
		System.out.println("CompileTimeEnvfrom Netbeans");
	}
	public void RunTimeEnv() {
		System.out.println("RunTimeEnv from Netbeans");
	}
	
	public void CompileTimeEnv1() {
		System.out.println("CompileTimeEnvfrom eclipse");
	}
	public void RunTimeEnv1() {
		System.out.println("RunTimeEnv from eclipse");
	}
}