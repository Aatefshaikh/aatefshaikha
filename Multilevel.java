package com.aatef;

class Google{
	void login()
	{
		System.out.println("LOGIN WITH THE HELP OF GOOGLE ACCOUNT");
	}
}
class Drive extends Google{
	void uploadDoc()
	{
		System.out.println("DRIVE IS USED FOR UPLOADING DOCUMENTS");
	}
}
class Gmail extends Drive
{
	void mail()
	{
		System.out.println("GMAIL IS USED FOR MAILING PURPOSE");
	}
}






public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gmail g1=new Gmail();
		g1.login();
		g1.mail();
		g1.uploadDoc();

	}

}
