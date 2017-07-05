package org.main;

import org.controller.UrunController;
import org.model.Adres;
import org.model.BagIsiSebzeler;
import org.model.KiloIsiSebzeler;
import org.model.Meyve;
import org.model.Sebze;
import org.model.Urun;
import org.model.UrunYerBilgisi;

public class Main {

	public static void main(String[] args) {
		
		UrunController urunController = new UrunController();
/*		
		Urun meyve = new Meyve();
		meyve.urunAdi = "Elma";
		meyve.urunBirimFiyati="5Tl";
		
		Urun sebze = new Sebze();
		sebze.urunAdi="Marul";
		sebze.urunBirimFiyati="3Tl";
		
		urunController.kaydet(meyve);
		urunController.kaydet(sebze);
		
		urunController.sil(meyve);
		urunController.sil(sebze);
		
		BagIsiSebzeler bagIsiSebzeler = new BagIsiSebzeler();
		bagIsiSebzeler.urunAdi="Maydonoz";
		bagIsiSebzeler.bagAdedi="1";
		bagIsiSebzeler.urunBirimFiyati="2";
		
		urunController.kaydet(bagIsiSebzeler);

		KiloIsiSebzeler kiloIsiSebzeler = new KiloIsiSebzeler();
		kiloIsiSebzeler.urunAdi="Domates";
		kiloIsiSebzeler.kilo="2";
		kiloIsiSebzeler.urunBirimFiyati="4";
		
		urunController.kaydet(kiloIsiSebzeler);*/
		
		Meyve meyve = new Meyve();
		meyve.urunAdi="Armut";
		meyve.urunBirimFiyati="5";
		UrunYerBilgisi yerBilgisi = new UrunYerBilgisi();
		meyve.urunYerBilgisi = yerBilgisi;
		Adres adresi = new Adres();
		meyve.urunYerBilgisi.adres = adresi;
		meyve.urunYerBilgisi.adres.il="Ankara";
		meyve.urunYerBilgisi.adres.ilce="Mamak";
		meyve.urunYerBilgisi.isletmeAdi="Anadolu Market";
		meyve.urunYerBilgisi.location="15.225.22";
		
		urunController.kaydet(meyve);
		
		
	}

}
