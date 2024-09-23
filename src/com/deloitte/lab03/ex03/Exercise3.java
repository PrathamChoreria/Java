package com.deloitte.lab03.ex03;

public class Exercise3 {
	
	public String alterString(String input) {
		StringBuilder sb=new StringBuilder();
		for (char ch:input.toCharArray()) {
			if(isConsonant(ch)) {
				ch=(char)(ch+1);
				
			}
			sb.append(ch);
		}
		
		return sb.toString();
	}
	public boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return ch >= 'a' && ch <= 'z' && "aeiou".indexOf(ch) == -1;
    }
	
	public static void main(String[] args) {
		String input="JAVA";
		Exercise3 ex=new Exercise3();
		System.out.println(ex.alterString(input));
		
	}
}
