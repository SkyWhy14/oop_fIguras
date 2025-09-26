package Uzd5;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Uzd_1.MinkasTante;
public class Figuras {
	static ArrayList<Centrs> centraObjekti = new ArrayList<>();
	static ArrayList<cetrsturis> cetrsturaObjekti = new ArrayList<>();
	static ArrayList<aplis> aplaObjekti = new ArrayList<>();
	static ArrayList<Trijsturis> trijsturaObjekti = new ArrayList<>();
	
	 static String [] objektuPogas = {"Centrs","Cetrsturis","Aplis","Trijsturis","Atrgriezties"};
	 
	public static void main(String[] args) {
	/*	//Izveido Centrs objektu
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
        */
		
		
		
		
		int izvele,poga;
		
		do {
			izvele = MinkasTante.skaitlaParbaude("Ko velies darit?\n"
					+"0 - Apturet\n"+
					"1 - Izveidot objektu\n"
					+"2 - Aplukot objektus\n"
					+"3 - Izsaukt metodi", 0, 3);
			if(izvele == -1) 
				izvele = 0;
			
			switch(izvele) {
			case 4 : 
			JOptionPane.showMessageDialog(null, "Programma aptureta!","Beigas",
					JOptionPane.INFORMATION_MESSAGE);	
			break;	
			
			
			
			}
			
		}while(izvele != 0);
		
		
	}

}
