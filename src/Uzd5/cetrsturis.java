package Uzd5;

public class cetrsturis {
  public double platums,augstums;
  public Centrs punkts;
  
  
  //Konstruktoru parslogosana
  public cetrsturis() {
	  punkts = new Centrs(0,0);
  }
  public cetrsturis(Centrs punkts,double p,double a) {
	 this.punkts = punkts;
	 platums = p;
	 augstums = a;
  }
  public String izvaditCentru() {
	  return "Platums: " + platums + "cm augtums: " + augstums + "cm ";
  }
  //Uztaisit metodi kas aprekina laukumu
  public double Laukums() {
	  return platums * augstums;
  }
}
