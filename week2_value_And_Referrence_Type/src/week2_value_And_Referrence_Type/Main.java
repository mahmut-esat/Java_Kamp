package week2_value_And_Referrence_Type;

class Main {
	public static void main(String args[]) {

		// value type

		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); // 10

		// reference type --> array

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 3, 4, 5 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]); // 10

	}
}