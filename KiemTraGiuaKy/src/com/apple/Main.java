package com.apple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) {
		LinkerListApple();
	}

	public static void ArrayListApple() {
		sc = new Scanner(System.in);
		List<Apple> appleList = new ArrayList<Apple>();
		while (true) {
			
			
			System.out.println(">");
			String cmd = sc.nextLine();
			if (cmd.equals("add")) {
				System.out.println("Màu Sắc > ");
				String mauSac = sc.nextLine();
				System.out.println("Khối lượng > ");
				double khoiLuong = sc.nextDouble();
				Apple apple = new Apple();
				apple.setMauSac(mauSac);
				apple.setKhoiLuong(khoiLuong);
				appleList.add(apple);
				System.out.println("Danh Sach Sản Phẩm : " + appleList);
			}
			if (cmd.equals("exit")) {
				break;
			}

			if (cmd.equals("search")) {
				System.out.println("Nhập màu :>");
				String mau = sc.nextLine();
				Apple vo = new Apple();
				vo.setMauSac(mau);
			}
		}

	}
	
	
	public static void LinkerListApple() {
		sc = new Scanner(System.in);
		List<Apple> appleList = new LinkedList<Apple>();
		while (true) {
			
			
			System.out.println(">");
			String cmd = sc.nextLine();
			if (appleList.size() == 0) {

			}
			if (cmd.equals("add")) {
				System.out.println("Mã > ");
				int ma = sc.nextInt();
				System.out.println("Màu Sắc > ");
				String mauSac = sc.nextLine();
				System.out.println("Khối lượng > ");
				double khoiLuong = sc.nextDouble();
				Apple apple = new Apple();
				apple.setMa(ma);
				apple.setMauSac(mauSac);
				apple.setKhoiLuong(khoiLuong);
				appleList.add(apple);
				System.out.println("Danh Sach Sản Phẩm : " + appleList);
			}
			if (cmd.equals("exit")) {
				break;
			}

			if (cmd.equals("search")) {
				System.out.println("Nhập mã :>");
				int ma = sc.nextInt();
				Apple vo = new Apple();
				vo.setMa(ma);
			}
		}

	}
}
