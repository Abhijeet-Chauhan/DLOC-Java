package feb22;

public class gmailcompose extends gmailinbox{
public void compose() {
	System.out.println("comose new mail");
}
public static void main(String[] args) {
	gmailcompose mails = new gmailcompose();
	mails.login();
	mails.inbox();
	mails.compose();
}
}
