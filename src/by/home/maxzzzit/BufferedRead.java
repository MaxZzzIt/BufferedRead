package by.home.maxzzzit;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BufferedRead {

	public static void main(String[] args) throws IOException {
		System.out.println("Введите число ");
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(BR.readLine());
		System.out.println("Вы ввели число = "+number);
}
}