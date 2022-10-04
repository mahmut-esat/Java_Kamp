package week2_methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 3, 4, 7, 9 };
		int aranacak = 17;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayı Mevcuttur: " + aranacak);
		} else {
			mesajVer("Sayı Mevcut Değildir :" + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}