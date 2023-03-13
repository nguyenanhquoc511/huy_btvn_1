package mainn;

public class Ex01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer a = new Customer(1, "huy", 2000);
		int id = 0;
		Integer id2 = new Integer(5);
		Integer id3 = 5;
		
		
		Bank bank = new Bank();
		
		bank.showList();
		
		bank.themKhachHang();
		bank.showList();
		
		bank.themKhachHang();
		bank.showList();
		
		bank.nopTien();
		bank.showList();
		
		bank.rutTien();
		bank.showList();
		
		bank.chuyenKhoan();
		bank.showList();
	}

}
