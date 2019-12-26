package legiang.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BTArrayList {

	public static void main(String[] args) {

		do {
			menu();
				
		} while (true);
	}
		
	static ArrayList<Integer> dsSo=new ArrayList<Integer>();
	private static void menu() {

		System.out.println("Mời bạn chọn thao tác: ");
		System.out.println("1. Thêm số ");
		System.out.println("2. Sửa số");
		System.out.println("3. Xóa số");
		System.out.println("4. Tìm kiếm ");
		System.out.println("5. Sắp xếp ");
		System.out.println("6. Xuất toàn bộ ");
		System.out.println("7. Thoát phần mềm ");
		int kq= new Scanner(System.in).nextInt();
		switch (kq) {
		case 1:	
			themSo();
			break;
		case 2:	
			suaSo();
			break;
		case 3:	
			xoaSo();
			break;
		case 4:	
			timKiem();
			break;
		case 5:	
			sapXep();
			break;
		case 6:
			xuatToanBo();
			break;		
		case 7:
			System.out.println("Tạm biệt!");
			System.exit(0);
			break;
		}
	}

	

	private static void xuatToanBo() {
		System.out.println("----------------------------");
		for(int s: dsSo)
		{
			System.out.println(s);
		}
	}
	private static void sapXep() {
		System.out.println("----------------------------------");
		System.out.println("Sắp xếp theo thứ tự tăng dần: ");
		for (int i = 0; i < dsSo.size()-1; i++) {
			int min=i;
			for (int j = i+1; j < dsSo.size(); j++) {
				if(dsSo.get(j)<dsSo.get(i))
				{
					int tempt;
					tempt=dsSo.get(j);
					dsSo.set(j,dsSo.get(min));
					dsSo.set(min,tempt);
				}
			}
		}		
		for(int s:dsSo)
		{			
			System.out.println(s);
		}
	}

	private static void timKiem() {
		System.out.println("-----------------------------------");
		System.out.println("Nhập số bạn muốn tìm: ");
		int x= new Scanner(System.in).nextInt();
		for (int i = 0; i < dsSo.size(); i++) {
			if(dsSo.get(i)==x)
			{
				System.out.println("Vị trí của số mà bạn muốn tìm: "+i);
			}
		}
		//System.out.println("Không tìm thấy");
	}
	private static void xoaSo() {
		System.out.println("-----------------------------");
		for (int i = 0; i < dsSo.size(); i++) {
			System.out.println((i+1)+". "+dsSo.get(i));
		}
		System.out.println("Bạn muốn xóa số thứ mấy: ");
		int vitriXoa=new Scanner(System.in).nextInt();
		dsSo.remove(vitriXoa-1);
	}

	private static void suaSo() {
		System.out.println("---------------------------------");
		for (int i = 0; i < dsSo.size(); i++) {
			System.out.println((i+1)+". "+dsSo.get(i));
		}
		System.out.println("Bạn muốn sửa số thứ mấy: ");
		int viTriSua=new Scanner(System.in).nextInt();
		System.out.println("Nhập số mới: ");
		int soMoi=new Scanner(System.in).nextInt();
		dsSo.set(viTriSua-1,soMoi);
		
	}

	private static void themSo() {
		System.out.println("--------------------------");
		System.out.println("Mời bạn nhập số cần thêm: ");
		int them=new Scanner(System.in).nextInt();
		dsSo.add(them);
	}
	
		

}
