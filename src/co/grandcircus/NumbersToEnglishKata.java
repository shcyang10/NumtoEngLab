package co.grandcircus;

public class NumbersToEnglishKata {
	private static final String zero = "zero";
	private static String[] oneToNine = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private static String[] tenToNineteen = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifthteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	private static String[] dozens = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}; 
	
	 public static String solution(int number) {
	        if(number == 0)
	            return zero;

	        return generate(number).trim();
	    }

	    public static String generate(int number) {
	        if(number >= 1000000000) {
	            return generate(number / 1000000000) + " billion " + generate(number % 1000000000);
	        }
	        else if(number >= 1000000) {
	            return generate(number / 1000000) + " million " + generate(number % 1000000);
	        }
	        else if(number >= 1000) {
	            return generate(number / 1000) + " thousand " + generate(number % 1000);
	        }
	        else if(number >= 100) {
	            return generate(number / 100) + " hundred " + generate(number % 100);
	        }

	        return generate1To99(number);
	    }

	    private static String generate1To99(int number) {
	        if (number == 0)
	            return "";

	        if (number <= 9)
	            return oneToNine[number - 1];
	        else if (number <= 19)
	            return tenToNineteen[number % 10];
	        else {
	            return dozens[number / 10 - 1] + " " + generate1To99(number % 10);
	        }
	    }
	
	public int amount(int amountEntered, String writeOut) {
		return 0;
	}
}
