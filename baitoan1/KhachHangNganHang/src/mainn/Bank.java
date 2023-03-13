package mainn;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
	
	ArrayList<Customer> customerList;
	private Scanner sc = new Scanner(System.in);
	protected String name;
	
	public Bank() {
		customerList = new ArrayList<>();
	}
	
	public void themKhachHang() {
		System.out.println("Nhap so id: ");
		int id = sc.nextInt();
	
		String name = "";
		do {
			System.out.println("Nhap ten: ");
			name = sc.nextLine();
		} while(name.length() == 0);
		
		System.out.println("Nhap so tien can nap: ");
		double money = sc.nextDouble();
		
		Customer customer = new Customer(id, name, money);
		customerList.add(customer);
		
		System.out.println("Them khach hang thanh coong: ");
	}
	
	public void showList() {
		for(Customer cus : customerList) {
			System.out.println(cus.toString());
		}
		System.out.println("END");
	}
	
	public void nopTien() {
		System.out.println("Nhap so id: ");
		int id = sc.nextInt();
		System.out.println("Nhap so tien can nap: ");
		double money = sc.nextDouble();
		
		Customer cus = findCustomer(id);
		if(cus == null) {
			System.out.println("Khong tim thay!");
			return;
		}
		cus.napTien(money);
	}
	
	public void rutTien() {
		System.out.println("Nhap so id: ");
		int id = sc.nextInt();
		// kiem tra so tien nhap vao dung hay ko? > 0?
		// kiem tra so tien hien co >= so tien muon rut
		System.out.println("Nhap so tien can rut: ");
		double money = sc.nextDouble();
		
		Customer cus = findCustomer(id);
		if(cus == null) {
			System.out.println("Khong tim thay!");
			return;
		}
		cus.rutTien(money);
	}
	
	public void chuyenKhoan() {
		System.out.println("Nhap so id tai khoan chuyen di: ");
		int id1 = sc.nextInt();
		System.out.println("Nhap so id tai khoan nhan: ");
		int id2 = sc.nextInt();
		// kiem tra so tien nhap vao dung hay ko? > 0?
		// kiem tra so tien hien co >= so tien muon chuyen
		System.out.println("Nhap so tien can chuyen: ");
		double money = sc.nextDouble();
		// cac phuong thuc xac thuc de ....
		
		Customer cus1 = findCustomer(id1);
		Customer cus2 = findCustomer(id2);
		if(cus1 == null || cus2 == null) {
			System.out.println("Khong tim thay!");
			return;
		}
		cus1.rutTien(money);
		cus2.napTien(money);
	}
	
	public Customer findCustomer(int id) {
		for(Customer cus : customerList) {
			if(cus.id == id) {
				return cus;
			}
		}
		return null;
	}
}
