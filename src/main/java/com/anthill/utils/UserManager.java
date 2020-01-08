package com.anthill.utils;

import java.util.Scanner;

public class UserManager {
	private String widthStr;
	private String heightStr;
	
	private int width;
	private int height;
	
	public void setWidth(int w){
		this.width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidthStr(String wStr){
		this.widthStr = wStr;
	}
	
	public String getWidthStr() {
		return widthStr;
	}
	
	public void setHeightStr(String hStr){
		this.heightStr = hStr;
	}
	
	public String getHeightStr() {
		return heightStr;
	}
	
	public int parseStringToInteger(String str) {
		 int intValue = 0;
		 intValue = Integer.parseInt(str);
		 return intValue;
	}
	
	public void setMapSize() {
		Scanner sc = new Scanner(System.in);
		
		//set width & height of map:
		System.out.print("Give map width: ");
		setWidthStr(sc.nextLine());
		
		System.out.print("Give map height: ");
		setHeightStr(sc.nextLine());
		
		setWidth(parseStringToInteger(getWidthStr()));
		setHeight(parseStringToInteger(getHeightStr()));
	}
}
