package Uzd5;

public class aplis {
  public double radiuss;
  public Centrs punkts;
  
  //Konstruktoru parslogosana
  public aplis(Centrs p,double r) {
	  punkts = p;
	  radiuss = r;
	  
  }
  public String izvaditAplaInfo() {
	  return "Radiuss : " + radiuss;
  }
  //Izveidot metodi ka aprekina rinka liniju
  public double Rlinija() {
	  double  c = 2 * Math.PI * radiuss;
	  return Math.round(c*100.0)/100.0;
  }
  //rinka laukuma aprekinasana
  public double Rlaukums() {
	  double s=  Math.PI*Math.pow(radiuss, 2);
	  return Math.round(s*100.0)/100.0;
  }
}
