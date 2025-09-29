package Uzd5;

	public class Trijsturis {
		public int mala1,mala2,mala3;
		public Centrs punkts;
 
		public Trijsturis(Centrs p,int m1,int m2,int m3) {
		punkts = p;
		mala1 = m1;
		mala2 = m2;
		mala3 = m3;
	 
 }
		public String izvaditTrijsturaInfo() {
		return "Mala1: " + mala1 + "cm Mala2: " + mala2 + "cm Mala3: " + mala3 + "cm";
 }
		//uzstaisi metodi laukuma aprekinasanai
		public double TLaukums() {
			double p = (mala1 + mala2 + mala3) / 2;
			double s = Math.sqrt(p * (p - mala1) * (p - mala2) * (p - mala3));
			return Math.round(s * 100.0) / 100.0;
		}
		
}
