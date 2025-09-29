package Uzd5;

import javax.swing.JOptionPane;

import Uzd_1.MinkasTante;

public class Oizveide {
	static int cPizvele() {
		if(Figuras.centraObjekti.size() < 1) {
			return -1;
		}
		return Integer.parseInt(JOptionPane.showInputDialog(null,
				IzveidotieObjekti.izvadit(Figuras.centraObjekti)));
		
		
	}
	
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
		 JOptionPane.showMessageDialog(null, "Centra punkts izveidots!","Pazinojums",JOptionPane.INFORMATION_MESSAGE);
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
			 JOptionPane.showMessageDialog(null, "Noklusejuma cetrsturis izveidots!","Pazinojums",JOptionPane.INFORMATION_MESSAGE);
			 break;
		 case "Centra punkts un malas" :
			cPnr =  cPizvele();
			if(cPnr == -1) {
				JOptionPane.showMessageDialog(null, "Vispirms izveido centra punktu!","Kļūda",JOptionPane.ERROR_MESSAGE);
				break;
			}
			 cPnr =0;
			p = MinkasTante.skaitlaParbaude("Ievadi cetrstura platumu",1,100);
			a = MinkasTante.skaitlaParbaude("Ievadi cetrstura augstumu",1,100);
			Figuras.cetrsturaObjekti.add(new cetrsturis(Figuras.centraObjekti.get(cPnr),p,a));
			 JOptionPane.showMessageDialog(null, " cetrsturis izveidots!","Pazinojums",JOptionPane.INFORMATION_MESSAGE);
			 break;
		 
			
		 }
		 break;
	 	case 2:
	 		cPnr = cPizvele();
	 		if(cPnr == -1) {
				JOptionPane.showMessageDialog(null, "Vispirms izveido centra punktu!","Kļūda",JOptionPane.ERROR_MESSAGE);
				break;
			}
	 		int r = MinkasTante.skaitlaParbaude("Ievadi apla rindu",1,100);
	 		Figuras.aplaObjekti.add(new aplis(Figuras.centraObjekti.get(cPnr),r));
	 		JOptionPane.showMessageDialog(null, "Aplis izveidots!","Pazinojums",JOptionPane.INFORMATION_MESSAGE);
	 		break; 
	 		
		
	 	case 3:
	 		cPnr = cPizvele();
	 		if(cPnr == -1) {
				JOptionPane.showMessageDialog(null, "Vispirms izveido centra punktu!","Kļūda",JOptionPane.ERROR_MESSAGE);
				break;
			}
	 		int m1 = MinkasTante.skaitlaParbaude("Ievadi trijstura malu garumu",1,100);
	 		int m2 = MinkasTante.skaitlaParbaude("Ievadi trijstura otras malas garumu",1,100);
	 		int m3 = MinkasTante.skaitlaParbaude("Ievadi trijstura trešas malas garumu",1,100);
	 		if(m1== -1 || m2==-1 || m3==-1) 
	 			 break;
	 			Figuras.trijsturaObjekti.add(new Trijsturis(Figuras.centraObjekti.get(cPnr),m1,m2,m3));
	 			JOptionPane.showMessageDialog(null, "Trijsturis izveidots!","Pazinojums",JOptionPane.INFORMATION_MESSAGE);
	 			break;
	
	 case 4 : 
	JOptionPane.showMessageDialog(null, "Atrgiezas uz galveno izvelmi","Pazinojums",
	JOptionPane.INFORMATION_MESSAGE);
		
	
	
	 break;	 
	 }
 }
 
}

