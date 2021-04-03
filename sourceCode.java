package JavaOdevler2;

import java.util.Scanner;

public class IkiDikdortgeninBirbirlerineGoreDurumlari {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Birinci dikdortgenin bilgileri kullniciden alinir.
		System.out.println("Birinci dikdortgen icin "
				+ "en-boy-merkezin x konumu-merkezin y konumu sirasiyla giriniz.");
		double birinciDikdortgenEni = input.nextDouble();
		double birinciDikdortgenBoyu = input.nextDouble();
		double birinciDikdortgeninMerkeziX0 = input.nextDouble();
		double birinciDikdortgeninMerkeziY0 = input.nextDouble();
		
		//Ikinci dikdortgenin bilgileri kullniciden alinir.
		System.out.println("Ikinci dikdortgen icin "
				+ "en-boy-merkezin x konumu-merkezin y konumu sirasiyla giriniz.");
		double ikinciDikdortgenEni = input.nextDouble();
		double ikinciDikdortgenBoyu = input.nextDouble();
		double ikinciDikdortgeninMerkeziX0 = input.nextDouble();
		double ikinciDikdortgeninMerkeziY0 = input.nextDouble();
		
		input.close();
		
		//Birinci dikdorgenin kose noktalari hesaplanir.
		double birinciDikdortgenX1 = birinciDikdortgeninMerkeziX0 - birinciDikdortgenEni / 2;
		double birinciDikdortgenY1 = birinciDikdortgeninMerkeziY0 + birinciDikdortgenBoyu / 2;
		double birinciDikdortgenX2 = birinciDikdortgeninMerkeziX0 + birinciDikdortgenEni / 2;
		double birinciDikdortgenY2 = birinciDikdortgeninMerkeziY0 + birinciDikdortgenBoyu / 2;
		double birinciDikdortgenX3 = birinciDikdortgeninMerkeziX0 - birinciDikdortgenEni / 2;
		double birinciDikdortgenY3 = birinciDikdortgeninMerkeziY0 - birinciDikdortgenBoyu / 2;
		double birinciDikdortgenX4 = birinciDikdortgeninMerkeziX0 + birinciDikdortgenEni / 2;
		double birinciDikdortgenY4 = birinciDikdortgeninMerkeziY0 - birinciDikdortgenBoyu / 2;
		
		//Ikinci dikdorgenin kose noktalari hesaplanir.
		double ikinciDikdortgenX1 = ikinciDikdortgeninMerkeziX0 - ikinciDikdortgenEni / 2;
		double ikinciDikdortgenY1 = ikinciDikdortgeninMerkeziY0 + ikinciDikdortgenBoyu / 2;
		double ikinciDikdortgenX2 = ikinciDikdortgeninMerkeziX0 + ikinciDikdortgenEni / 2;
		double ikinciDikdortgenY2 = ikinciDikdortgeninMerkeziY0 + ikinciDikdortgenBoyu / 2;
		double ikinciDikdortgenX3 = ikinciDikdortgeninMerkeziX0 - ikinciDikdortgenEni / 2;
		double ikinciDikdortgenY3 = ikinciDikdortgeninMerkeziY0 - ikinciDikdortgenBoyu / 2;
		double ikinciDikdortgenX4 = ikinciDikdortgeninMerkeziX0 + ikinciDikdortgenEni / 2;
		double ikinciDikdortgenY4 = ikinciDikdortgeninMerkeziY0 - ikinciDikdortgenBoyu / 2;
		
		int test = 0;
		
		//Ikinci dik. (x1, y1) noktasi birinci dikdortgenin icerisinde ise test değiskeni 1 attirilir.
		if(birinciDikdortgenX1 <= ikinciDikdortgenX1 && birinciDikdortgenY1 >= ikinciDikdortgenY1) {
			if(birinciDikdortgenX2 >= ikinciDikdortgenX1 && birinciDikdortgenY2 >= ikinciDikdortgenY1) {
				if(birinciDikdortgenX3 <= ikinciDikdortgenX1 && birinciDikdortgenY3 <= ikinciDikdortgenY1) {
					if(birinciDikdortgenX4 >= ikinciDikdortgenX1 && birinciDikdortgenY4 <= ikinciDikdortgenY1) {
						test++;
					}
				}
			}
		}
		
		//Ikinci dik. (x2, y2) noktasi birinci dikdortgenin icerisinde ise test değiskeni 1 attirilir.
		if(birinciDikdortgenX1 <= ikinciDikdortgenX2 && birinciDikdortgenY1 >= ikinciDikdortgenY2) {
			if(birinciDikdortgenX2 >= ikinciDikdortgenX2 && birinciDikdortgenY2 >= ikinciDikdortgenY2) {
				if(birinciDikdortgenX3 <= ikinciDikdortgenX2 && birinciDikdortgenY3 <= ikinciDikdortgenY2) {
					if(birinciDikdortgenX4 >= ikinciDikdortgenX2 && birinciDikdortgenY4 <= ikinciDikdortgenY2) {
						test++;
					}
				}
			}
		}
		
		//Ikinci dik. (x3, y3) noktasi birinci dikdortgenin icerisinde ise test değiskeni 1 attirilir.
		if(birinciDikdortgenX1 <= ikinciDikdortgenX3 && birinciDikdortgenY1 >= ikinciDikdortgenY3) {
			if(birinciDikdortgenX2 >= ikinciDikdortgenX3 && birinciDikdortgenY2 >= ikinciDikdortgenY3) {
				if(birinciDikdortgenX3 <= ikinciDikdortgenX3 && birinciDikdortgenY3 <= ikinciDikdortgenY3) {
					if(birinciDikdortgenX4 >= ikinciDikdortgenX3 && birinciDikdortgenY4 <= ikinciDikdortgenY3) {
						test++;
					}
				}
			}
		}
		
		//Ikinci dik. (x1, y4) noktasi birinci dikdortgenin icerisinde ise test değiskeni 1 attirilir.
		if(birinciDikdortgenX1 <= ikinciDikdortgenX4 && birinciDikdortgenY1 >= ikinciDikdortgenY4) {
			if(birinciDikdortgenX2 >= ikinciDikdortgenX4 && birinciDikdortgenY2 >= ikinciDikdortgenY4) {
				if(birinciDikdortgenX3 <= ikinciDikdortgenX4 && birinciDikdortgenY3 <= ikinciDikdortgenY4) {
					if(birinciDikdortgenX4 >= ikinciDikdortgenX4 && birinciDikdortgenY4 <= ikinciDikdortgenY4) {
						test++;
					}
				}
			}
		}
		
		String durum = "";
		
		//Dikdortgenlerin durumu belirlenir ve ekrana yazdirilir.
		switch (test) {
		case 0:
			durum = "Kesisim ve Kapsama drumlari yoktur...";
			break;
		case 1:
			durum = "1 noktali kesisim bulunmaktadir...";
			break;
		case 2:
	        durum = "2 noktali Kesisim bulunmaktadir...";
			break;
		case 4:
	        durum = "Birinci dikdortgen ikinci dikdortgeni kapsamaktadir...";
			break;
		default:
			durum = "oops, Birseyler ters gitti...";
			break;
		}
		
		System.out.println(durum);
		
	}
}
