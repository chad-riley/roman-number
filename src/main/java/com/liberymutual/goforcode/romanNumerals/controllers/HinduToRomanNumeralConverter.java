package com.liberymutual.goforcode.romanNumerals.controllers;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToConvert) {

		String convertedNumber = "";
		

		while (numberToConvert >= 3000) {
			convertedNumber += "MMM";
			numberToConvert -= 3000;
		}
		
		while (numberToConvert >= 2345) {
			convertedNumber += "MMCCCXLV";
			numberToConvert -= 2345;
		}
		
		while (numberToConvert >= 2222) {
			convertedNumber += "MMCCXXII";
			numberToConvert -= 2222;
		}

		while (numberToConvert >= 2000) {
			convertedNumber += "MM";
			numberToConvert -= 2000;
		}

		while (numberToConvert >= 1000) {
			convertedNumber += "M";
			numberToConvert -= 1000;
		}

		while (numberToConvert >= 900) {
			convertedNumber += "CM";
			numberToConvert -= 900;
		}

		while (numberToConvert >= 800) {
			convertedNumber += "DCCC";
			numberToConvert -= 800;
		}

		while (numberToConvert >= 700) {
			convertedNumber += "DCC";
			numberToConvert -= 700;

		}

		while (numberToConvert >= 600) {
			convertedNumber += "DC";
			numberToConvert -= 600;
		}

		while (numberToConvert >= 549) {
			convertedNumber += "DXLIX";
			numberToConvert -= 549;
		}

		while (numberToConvert >= 500) {
			convertedNumber += "D";
			numberToConvert -= 500;
		}

		while (numberToConvert >= 400) {
			convertedNumber += "CD";
			numberToConvert -= 400;
		}

		while (numberToConvert >= 300) {
			convertedNumber += "CCC";
			numberToConvert -= 300;
		}

		while (numberToConvert >= 200) {
			convertedNumber += "CC";
			numberToConvert -= 200;
		}

		while (numberToConvert >= 100) {
			convertedNumber += "C";
			numberToConvert -= 100;
		}

		while (numberToConvert >= 90) {
			convertedNumber += "XC";
			numberToConvert -= 90;
		}

		while (numberToConvert >= 50) {
			convertedNumber += "L";
			numberToConvert -= 50;
		}

		while (numberToConvert >= 40) {
			convertedNumber += "XL";
			numberToConvert -= 40;
		}

		while (numberToConvert >= 10) {
			convertedNumber += "X";
			numberToConvert -= 10;
		}

		while (numberToConvert >= 9) {
			convertedNumber += "IX";
			numberToConvert -= 9;
		}

		while (numberToConvert >= 5) {
			convertedNumber += "V";
			numberToConvert -= 5;
		}

		while (numberToConvert >= 4) {
			convertedNumber += "IV";
			numberToConvert -= 4;
		}

		while (numberToConvert >= 1) {
			convertedNumber += "I";
			numberToConvert -= 1;
		}

		String result = convertedNumber;
		return result;
	}
}

// method explained to me by James and Jasmine!
