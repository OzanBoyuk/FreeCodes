import java.util.Scanner;

public class Deneme {
	
	public static void main(String[] args) {
		
		int i = 0;
		int dizi[] = new int [27];
		Scanner sc = new Scanner(System.in);
		
		while (i<dizi.length) {
			dizi[i] = sc.nextInt();
			i++;
		}
		
		
		for (int j = 1; j <= dizi.length; j++) {
			System.out.println(j+". dizi elemaný : " + dizi[j-1]);
		}
		
		int k = 0;
		while (k<dizi.length-1) {
			
			int l = k+1;
			
			while (l<dizi.length) {
				if (dizi[k] > dizi[l]) {
					int swap = dizi[k];
					dizi[k] = dizi[l];
					dizi[l] = swap;
				}
				l++;
			}
			k++;
		}
		System.out.println("Sýralý dizi :");
		for (int j = 1; j <= dizi.length; j++) {
			System.out.println(j+". dizi elemaný : " + dizi[j-1]);
		}
	}

}
