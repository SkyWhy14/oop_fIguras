package Uzd5;

public class Figuras {

	public static void main(String[] args) {
		//Izveido Centrs objektu
		Centrs CentraP1 = new Centrs(2,3);
		System.out.println(CentraP1.izvadKoordinatas());
		CentraP1.parvietot(3, -1);
        System.out.println(CentraP1.izvadKoordinatas());
        //Izvedo cetrsturis objektu
        
        cetrsturis cetrsturis1 = new cetrsturis();
        System.out.println(cetrsturis1.izvaditCentru());
        //izvadit si cetrstura atrasanas vietu x un y 
        System.out.println(cetrsturis1.punkts.izvadKoordinatas());
        
        cetrsturis cetrsturis2 = new cetrsturis(CentraP1,6,7);
        System.out.println(cetrsturis2.izvaditCentru()+"\n"+
        		cetrsturis2.punkts.izvadKoordinatas()+"\nLaukums = "+cetrsturis2.Laukums()+"cm^2");
        
        
        Centrs punkts2 = new Centrs(5,5);
        aplis aplis1 = new aplis(punkts2,5);
        System.out.println("Rinka "+aplis1.izvaditAplaInfo()+"\n"+
				"Rinka linija: "+aplis1.Rlinija()+"cm\n"+
				"Rinka laukums: "+aplis1.Rlaukums()+"cm^2\n"+
				"Rinka centrs: "+aplis1.punkts.izvadKoordinatas());
	}

}
