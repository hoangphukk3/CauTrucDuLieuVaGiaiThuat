package com.apple;

public class Apple {
	private int ma;
	private double khoiLuong;
	private String mauSac;

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public double getKhoiLuong() {
		return khoiLuong;
	}

	public void setKhoiLuong(double khoiLuong) {
		this.khoiLuong = khoiLuong;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public Apple(int ma, int khoiLuong, String mauSac) {
		super();
		this.ma = ma;
		this.khoiLuong = khoiLuong;
		this.mauSac = mauSac;
	}

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apple [ma=" + ma + ", khoiLuong=" + khoiLuong + ", mauSac=" + mauSac + "]";
	}

}
