package com.lin.division;

import java.io.*;

public class MySplite {

	public static void main(String args[]) {
		String titles = ("����� ���������� �� ProgLang.su");

		System.out.println("������������ ��������: ");
		for (String retval : titles.split(" ")) {
			System.out.println(retval);
		}
	}
}
