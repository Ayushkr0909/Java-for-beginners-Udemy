
public class MyChar {

private char ch;

public MyChar(char ch) {
	this.ch = ch;
	}

public boolean isVowel() {
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		return true;
	if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		return true;
				
return false;
}
public boolean isAlphabet() {
	if(ch >= 97 && ch <= 122) //values of 'a' to 'z' is 97 to 122
		return true;
	if(ch >= 65 && ch <= 90) //values of 'A' to 'Z' is 65 to 90
		return true;
return false;
}

public boolean isDigit() {
	if(ch <= 57 && ch >= 48)  //values of '0' to '9' is 48 to 57
	return true;
	
return false;
}

public boolean isConsonant() {
	if(isAlphabet() && !isVowel())
		return true;
return false;
}

public void printLowerCaseAlphabets() {
	for(char ch = 'a';ch<= 'z';ch++)
System.out.println(ch);	
}

public void printUpperCaseAlphabets() {
	for(char ch = 'A';ch<= 'Z';ch++)
		System.out.println(ch);	
}	
}
