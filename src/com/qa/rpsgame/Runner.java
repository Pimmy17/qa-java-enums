package com.qa.rpsgame;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		String playerCall = null;

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter ROCK, PAPER or SCISSORS: ");
		playerCall = scan.nextLine();

		RPSEnum call = null;
		if (playerCall.toUpperCase().equals("ROCK")) {
			call = RPSEnum.ROCK;
		} else if (playerCall.toUpperCase().equals("PAPER")) {
			call = RPSEnum.PAPER;
		} else if (playerCall.toUpperCase().equals("SCISSORS")) {
			call = RPSEnum.SCISSORS;
		} else {
			System.out.println("Incorrect Entry!");
		}
		scan.close();
		playerShow(call);

	}

	private static boolean playerShow(RPSEnum show) {
		double rand = Math.random() * 3;

		RPSEnum cpuShow = null;
		if (rand < 1) {
			cpuShow = RPSEnum.PAPER;
		} else if (rand < 2) {
			cpuShow = RPSEnum.ROCK;
		} else {
			cpuShow = RPSEnum.SCISSORS;
		}

		System.out.println("Player 1 shows: " + show);
		System.out.println("CPU shows: " + cpuShow);

		if (show == cpuShow) {
			System.out.println("Draw!");
		} else if (show == RPSEnum.PAPER) {
			if (cpuShow == RPSEnum.ROCK) {
				System.out.println("Player 1 Wins!");
			} else {
				System.out.println("CPU Wins!");
			}
		} else if (show == RPSEnum.ROCK) {
			if (cpuShow == RPSEnum.SCISSORS) {
				System.out.println("Player 1 Wins!");
			} else {
				System.out.println("CPU Wins!");
			}
		} else if (show == RPSEnum.SCISSORS) {
			if (cpuShow == RPSEnum.PAPER) {
				System.out.println("Player 1 Wins!");
			} else {
				System.out.println("CPU Wins!");
			}

		}
		return show == cpuShow;

	}
}
