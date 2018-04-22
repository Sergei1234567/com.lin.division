package com.lin.division;

import java.io.*;

public class MySplite {

	public static void main(String args[]) {
		String titles = ("Добро пожаловать на ProgLang.su");

		System.out.println("Возвращаемое значение: ");
		for (String retval : titles.split(" ")) {
			System.out.println(retval);
		}
	}
}
