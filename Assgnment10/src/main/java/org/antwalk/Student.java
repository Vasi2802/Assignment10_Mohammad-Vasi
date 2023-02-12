package org.antwalk;

public class Student {

	String name;
	int Mathmarks;
	int Englishmarks;
	int Hindimarks;

	public void avgMark() {
		int total=Mathmarks+Englishmarks+Hindimarks;
		int avg= total/3;
		System.out.println("Average Marks are: "+avg);
	}

	public void showResult() {
		System.out.println("Marks of English is: "+Englishmarks);
		System.out.println("Marks of Maths is: "+Hindimarks);
		System.out.println("Marks of Hindi is: "+Mathmarks);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathmarks() {
		return Mathmarks;
	}

	public void setMathmarks(int mathmarks) {
		Mathmarks = mathmarks;
	}

	public int getEnglishmarks() {
		return Englishmarks;
	}

	public void setEnglishmarks(int englishmarks) {
		Englishmarks = englishmarks;
	}

	public int getHindimarks() {
		return Hindimarks;
	}

	public void setHindimarks(int hindimarks) {
		Hindimarks = hindimarks;
	}

	
}
