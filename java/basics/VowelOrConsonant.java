import java.util.Scanner;
class VowelOrConsonant
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char letter = scan.next().charAt(0);
		if (letter== 'a'||letter== 'e'||letter== 'i'||letter=='o'||letter=='u')
		{
			System.out.println(letter+ " is a vowel");
		}
		else
			System.out.println(letter+ " is a consonant");
	}
}
