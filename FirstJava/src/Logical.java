
public class Logical {

	public static void main(String[] args) {

		// StarPattern(5);
		// ReverseString("Shrikant madhav haral");
		// GetMaxChar("appleisapple");
		// Splitted("Shrikant madhavarao haral"); split and reverse
		// Splittedd("Shrikant madhavarao haral"); Retaining the positions same

		int[] arr = { 1, 5, 4, 5, 4, 22, 55, 44, 6 };
		// LargestInArr(arr);
		// OccEachChar("appleisappleisapple");
		// CountCharswithoutLengtFunction("shrikant haral");
		// Fibo(5);
		// palindromeNumber(1441);
		//armstrong(142);
		//NumberPattern(10);
		//g("annnnnnnnnanyyyyyyyyyyyyyyyyyyyyyyyyyyya");
		//palindrome(3333);
		eachChar("Shrikaaaanttttagg");
	}

	public static void StarPattern(int number) {

		for (int i = 0; i <= 10; i++) {
			for (int j = number; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void ReverseString(String str)

	{
		String RevString = "";
		String[] arr = str.split(" ");

		for (int k = 0; k < arr.length; k++) {
			// System.out.println(arr[k]);
			if (arr[k].startsWith("m")) {
				System.out.println(arr[k]);
				break;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			RevString = RevString + str.charAt(str.length() - 1 - i);
		}
		System.out.println(RevString);

	}

	public static void GetMaxChar(String str) {

		int[] arr = new int[256];
		int maxValue = 0;
		char resultCha = '0';
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
			for (int j = 0; j < str.length(); j++) {
				if (arr[str.charAt(i)] > maxValue) {
					maxValue = arr[str.charAt(i)];
					resultCha = str.charAt(i);
				}

			}
		}

		System.out.println(
				"maximum occured character in " + str + " is " + resultCha + " occured " + maxValue + " times");
	}

	public static void Splitted(String str) {
		String[] name = str.split(" ");// shrikant madhavarao haral
		for (int i = name.length - 1; i > -1; i--) {
			for (int j = name[i].length() - 1; j > -1; j--) {
				System.out.print(name[i].charAt(j));
			}
			System.out.print("\t");
		}
	}

	public static void Splittedd(String str)

	{
		String[] name = str.split(" ");// shrikant madhavarao haral
		for (int i = 0; i < name.length; i++) {
			for (int j = name[i].length() - 1; j > -1; j--) {
				System.out.print(name[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public static void LargestInArr(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	public static void OccEachChar(String str)

	{
		int[] arr = new int[256];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;

		}
		for (int i = 0; i < 256; i++) {
			if (arr[i] != 0) {
				System.out.println((char) i + " is occured " + arr[i] + " times");
			}
		}
	}

	public static void CountCharswithoutLengtFunction(String str) {

		int count = 0;
		char[] str2 = str.toCharArray();

		for (char a : str2) {
			count++;
		}
		System.out.println(count);
	}

	public static void Fibo(int a) {
		int n1 = 1;
		int n2 = 2;
		int n3 = 0;
		System.out.println(n1);
		System.out.println(n2);
		while (a > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
			a--;
		}
	}

	public static void palindromeNumber(int a) {
		int temp = a;
		int sum = 0;
		int Ldigit = 0;
		while (a > 0) {
			Ldigit = a % 10;
			sum = sum * 10 + Ldigit;
			a = a / 10;
		}
		if (temp == sum) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}

	public static void armstrong(int a) {


		int sum = 0;
		int b = a;
		int L;
		while (a > 0) {
			L = a % 10;
			sum = sum + (L * L * L);
			a = a / 10;

		}
		if (b == sum) {
			System.out.println("Number is Armstrong number");
		} else {
			System.out.println("Number is not Armstrong number");
		}

	}
	
	public static void NumberPattern(int a)
	{
		for(int i=1;i<a;i++)
		{
			for(int j=a;j>i;j--)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=i;k++)
				
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
		
	}
	
	public static void g(String str)
	{
		int arr[]=new int[256];
		int max=0;
		char reChar='0';
		for(int i=0;i<str.length();i++)
		{
			
			arr[str.charAt(i)]++;
			
			if(arr[str.charAt(i)]>max)
			{
				max=arr[str.charAt(i)];
				reChar=str.charAt(i);
			}
			
		}
		System.out.println(reChar+"="+max);
	}

	public static void palindrome(int number)
	{
		int number2=number;
		int sum=0;
		int LDigit=0;
		while(number>0)
		{
			LDigit=number%10;
			sum=sum*10+LDigit;
			number=number/10;
		}
		if(number2==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number not plaindrome");
		}
	}

	public static void eachChar(String str)
	{
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			
			arr[str.charAt(i)]++;
		}	
		for(int i=0;i<256;i++)
		{
				if(arr[i]!=0)
				{
					System.out.println((char)i+"="+arr[i]);
				}
		}
		
	}
}
