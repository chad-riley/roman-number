package com.liberymutual.goforcode.romanNumerals.controllers;

public class HinduToRomanNumeralConverter {

	public String convert(int numberToConvert) {
	
		String convertedNumber = "";
		
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
		
		
		//method explained to me by James and Jasmine!

	

	
	
	