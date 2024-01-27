package com.first_operation.in;

public class next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "to learn java programm";
        String value = "";
		
		for(int i = content.length()-1;i >= 0;i--) {
			value = value + content.charAt(i);
		}
		System.out.println(value);
		
		char[] name = value.toCharArray();
		
		
		for(int i = 0;i < name.length;i++) {
			if(Character.isLetter(name[i])) {
				name[i] = Character.toUpperCase(name[i]);
				break;
			}
			
		}
		
		content = String.valueOf(name);
		System.out.println(content);

	}

}
