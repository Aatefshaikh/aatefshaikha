package com.aatef;


class Mobile{
	void calling()
	{
		System.out.println("MOBILE IS USED FOR CALLING PURPOSE");
	}
}
 class SmartPhone extends  Mobile{
	void calling()
	{
		System.out.println("smartphone is used for calling purpose");
	}
	void gaming()
	{
		System.out.println("SMARTPHONE IS USED FOR GAMING PURPOSE");
	}
}

public class MainApp {

	public static void main(String[] args) {
		
		SmartPhone sp=new SmartPhone();
		sp.calling();
		sp.gaming();
		Mobile m =new SmartPhone();
		m.calling();

	}

}
