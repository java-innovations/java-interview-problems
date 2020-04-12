package com.satya.strings;

// Given a binary sting, find the number of sub string which starts from 1 and ends with 1. 
// E.g- 10001 - answer is 1 
public class FindSubStringsInBinaryString {

	public static void main(String[] args) {
		String inputBinaryString = "100010100000011010";
		inputBinaryString = "100010100001";

		FindSubStringsInBinaryString binaryString = new FindSubStringsInBinaryString();
		int subStringCount = binaryString.findSubStringsofOnesCount(inputBinaryString, 0);
		System.out.println("number of sub string which starts from 1 and ends with 1 is: " + subStringCount);
	}

	private int findSubStringsofOnesCount(String binaryString, int startIndex) {
		int subStringCount = 0;

		if (binaryString == null || binaryString.isEmpty() || !binaryString.contains("1")) {
			return subStringCount;
		}

		int beginIndex = binaryString.indexOf("1", startIndex);
		while (beginIndex != -1) {
			int nexBegintIndex = -1;
			int nextIndex = binaryString.indexOf("1", beginIndex + 1);
			nexBegintIndex = nextIndex;

			while (nextIndex != -1) {
				subStringCount++;
				nextIndex = binaryString.indexOf("1", nextIndex + 1);
			}
			beginIndex = nexBegintIndex;
		}
		return subStringCount;
	}

}