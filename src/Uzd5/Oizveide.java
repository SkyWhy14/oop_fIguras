package Uzd5;

import javax.swing.JOptionPane;

import Uzd_1.MinkasTante;

public class Oizveide {
	
	
 static void izveidotObjektu() {
	 int x,y,cPnr;
	 double p,a;
	 int izvele = JOptionPane.showOptionDialog(null,"Kuru objektu veidot", "Izvele",
	JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Figuras.objektuPogas, Figuras.objektuPogas[0]);
		if(izvele == -1) 
			izvele = 0;
	 switch(izvele) {
	 case 0 :
		 x = MinkasTante.skaitlaParbaude("Ievadi x  centra koordinatu",-100,100);
		 y = MinkasTante.skaitlaParbaude("Ievadi y  centra koordinatu",-100,100);
		 //Izveidot centra punkta objektu un ielikt  dinamiskaja masiva
		 Figuras.centraObjekti.add(new Centrs(x,y));
		 break;
	 case 1 : 
		 String [] ceIzvelesVeids = {"Noklusejuma","Centra punkts un malas"}; 
		 String veids  = (String)JOptionPane.showInputDialog(null,"Izvelies kuru konstruktoru izsaukt","Cetrstura izveide",
				 JOptionPane.QUESTION_MESSAGE,null,ceIzvelesVeids,ceIzvelesVeids[0]).toString();
		 if(veids == null)
			 veids = ceIzvelesVeids[0];
			 
		 switch(veids) {
		 case "Noklusejuma" :
			 Figuras.cetrsturaObjekti.add(new cetrsturis());
			 break;
		 case "Centra punkts un malas" :
			//cPnr =  cPizvele();
			 cPnr =0;
			p = MinkasTante.skaitlaParbaude("Ievadi cetrstura platumu",1,100);
			a = MinkasTante.skaitlaParbaude("Ievadi cetrstura augstumu",1,100);
			Figuras.cetrsturaObjekti.add(new cetrsturis(Figuras.centraObjekti.get(cPnr),p,a));
			break; 
		 }
		break; 
	 case 4 : 
	JOptionPane.showMessageDialog(null, "Atrgiezas uz galveno izvelmi","Pazinojums",
	JOptionPane.INFORMATION_MESSAGE);
	
	
	
	 break;	 
	 }
 }
 
}
