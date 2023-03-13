package mainn;

import java.util.Scanner;

public class Customer {
	public int id;
	public String name;
	public double money;
	private Scanner sc = new Scanner(System.in);
	
	private Customer() {}
	
	// co tham so
	public Customer(int id, String name, double money) {
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	public void napTien(double money) {
		this.money += money;
		System.out.println("nap tien thanh cong! ");
	}
	
	public void rutTien(double money) {
		this.money -= money;
		System.out.println("nap tien thanh cong! ");
	}
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", money=" + money + "]";
	}
	
	
}
