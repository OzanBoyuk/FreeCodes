package org.controller;

import org.model.Meyve;
import org.model.Sebze;
import org.model.Urun;

public class UrunController implements Controller{

	@Override
	public void kaydet(Urun urun) {
		if (urun instanceof Meyve) {
			System.out.println("Urun Bilgileri :\nÜrün Adi =" + urun.urunAdi
					+"\nÜrün Birim Fiyatý =" + urun.urunBirimFiyati
					+"\nÜrün Location =" + urun.urunYerBilgisi.location
					+"\nÜrün Ýþletme Adi =" + urun.urunYerBilgisi.isletmeAdi
					+"\nÜrün Ýþletme Ýl =" + urun.urunYerBilgisi.adres.il
					+"\nÜrün Ýþletme Ýlçe =" + urun.urunYerBilgisi.adres.ilce);
		}else if (urun instanceof Sebze) {
			System.out.println(urun.urunAdi +" fiyatý = " + urun.urunBirimFiyati);
		}
		
	}

	@Override
	public void sil(Urun urun) {
		if (urun instanceof Meyve) {
			System.out.println("Meyve silindi.");
		}else if (urun instanceof Sebze) {
			System.out.println("Sebze silindi.");
		}
		
	}

}
