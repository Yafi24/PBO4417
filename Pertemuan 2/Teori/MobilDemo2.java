class Mobil {
      String warna;
	int tahunProduksi;
      boolean hidup;
      int gigi;

      public void hidupkanMobil(){
            hidup = true;
      }
      public void matikanMobil(){
            hidup = false;
      }
      public void ubahGigi(int gigiBaru){
            gigi = gigiBaru;
      }
}
public class MobilDemo2 {
      public static void main(String[] args){
	      Mobil mobilku = new Mobil();
            mobilku.warna = "Silver";
            mobilku.tahunProduksi = 2014 ;

            mobilku.hidup = false;
            mobilku.gigi = 0;
            System.out.println("Warna:" + mobilku.warna);
            System.out.println("Tahun:" + mobilku.tahunProduksi);
            System.out.println("Hidup:" + mobilku.hidup);
            System.out.println("Gigi:" + mobilku.gigi);
            mobilku.hidupkanMobil();
            System.out.println("Hidup:" + mobilku.hidup);
            mobilku.ubahGigi(1);
            System.out.println("Gigi:" + mobilku.gigi);
      }
}