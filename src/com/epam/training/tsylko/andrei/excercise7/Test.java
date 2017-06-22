package com.epam.training.tsylko.andrei.excercise7;

import com.epam.training.tsylko.andrei.util.Util;

public class Test {

	public static final String CHECKER = "^[+,-]?[0-9]{1,3}";

	public static void main(String[] args) {
		if (args.length == 3) {
			if (Util.checkInputNumbers(args[0], CHECKER) && Util.checkInputNumbers(args[1], CHECKER) && Util.checkInputNumbers(args[3], CHECKER)) {
				int a = Integer.parseInt(args[0]);
				int b = Integer.parseInt(args[1]);
				int h = Integer.parseInt(args[2]);

				ExpressionResolver.showResult(a, b, h);

			} else {
				System.out.println("Check entered numbers");
			}
		} else {
			System.out.println("Check amount of numbers");
		}

	}


}
