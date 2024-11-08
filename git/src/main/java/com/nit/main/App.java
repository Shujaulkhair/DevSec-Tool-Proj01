package com.nit.main;

public class App {
	
	public int sum(int x, int y) {
		return x + y;
	}
	
    public static void main(String[] args) {
        
        App ap = new App();
        System.out.println(ap.sum(30, 5));
    }
}
