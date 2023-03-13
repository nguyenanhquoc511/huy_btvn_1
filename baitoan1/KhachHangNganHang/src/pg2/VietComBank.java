package pg2;

import mainn.Bank;

public class VietComBank {
	
	// static thuoc thuoc tinh lop
	public static int id = 1;
	public int money;

	public VietComBank() {
		money = 10;
	}
	
	public int getOne() {
		System.out.println(id);
		System.out.println(money);
		return 1;
	}
	// static thuoc phuong thuc lop
	public static int getZero() {
		System.out.println(id);
		System.out.println(money);
		return 0;
	}
	
	public static void main(String[] args) {
		VietComBank bank1 = new VietComBank();
		System.out.println(VietComBank.id);
		bank1.id = 2;
		System.out.println(bank1.id);
		
		VietComBank bank2 = new VietComBank();
		System.out.println(bank2.id);
		
		VietComBank.id = 3;
		
		VietComBank bank3 = new VietComBank();
		System.out.println(bank3.id);
		VietComBank.getZero();
	}
}
