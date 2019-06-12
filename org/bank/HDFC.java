package org.bank;


public class HDFC extends Axis {
	
	@Override
	public void savingAccount(String interest) {
		System.out.println(interest);
	}
@Override
public void deposit() {
	
System.out.println("8%");
}
public static void main(String[] args) {
	HDFC h =new HDFC();
	h.deposit();
	h.savingAccount("12%");
	
}

}



	


