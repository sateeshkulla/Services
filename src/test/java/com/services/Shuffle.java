package com.services;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,8};
		Random random  = new Random();
		System.out.println(Arrays.toString(numbers));
		for(int i = 0; i < numbers.length - 1; i++) {
			int r = random.nextInt(numbers.length);
			System.out.print(r);
			int temp = numbers[i];
			numbers[i] = numbers[r];
			numbers[r] = temp;
			System.out.println(Arrays.toString(numbers));
		}

	}

}
