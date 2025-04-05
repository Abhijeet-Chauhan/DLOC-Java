
public class compare {
	public static void main(String[] args) {
		String course = "java";
//		if("java".equals(course)) {
//			System.out.println("registered for java");
//		} else if("python".equals(course)) {
//			System.out.println("registered for python");
//		}else if(".net".equals(course)) {
//			System.out.println("registered for .net");
//		}else if("c#".equals(course)) {
//			System.out.println("registered for c#");
//		} else if("ruby".equals(course)) {
//			System.out.println("registered for ruby");
//		} else {
//			System.out.println("not registered");
//		}
		switch(course) {
			case "java":
				System.out.println("registered for java");
			break;
			case "python":
				System.out.println("registered for python");
				break;
			case ".net":
				System.out.println("registered for .net");
				break;
			case "c#":
				System.out.println("registered for c#");
				break;
			case "ruby":
				System.out.println("registered for ruby");
				break;
			default:
				System.out.println("invalid");
				break;
		}
	}
}
