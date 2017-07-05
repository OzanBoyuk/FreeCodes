package org.controller;

import org.model.Meyve;
import org.model.Sebze;
import org.model.Urun;

public class UrunController implements Controller{

	@Override
	public void kaydet(Urun urun) {
		if (urun instanceof Meyve) {
			System.out.println("Urun Bilgileri :\n�r�n Adi =" + urun.urunAdi
					+"\n�r�n Birim Fiyat� =" + urun.urunBirimFiyati
					+"\n�r�n Location =" + urun.urunYerBilgisi.location
					+"\n�r�n ��letme Adi =" + urun.urunYerBilgisi.isletmeAdi
					+"\n�r�n ��letme �l =" + urun.urunYerBilgisi.adres.il
					+"\n�r�n ��letme �l�e =" + urun.urunYerBilgisi.adres.ilce);
		}else if (urun instanceof Sebze) {
			System.out.println(urun.urunAdi +" fiyat� = " + urun.urunBirimFiyati);
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
