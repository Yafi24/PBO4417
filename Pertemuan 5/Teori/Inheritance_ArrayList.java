import java.util.ArrayList;

public class Inheritance_ArrayList {
      public static void main(String args[]){
           CatTembok cattembok = new CatTembok();
           System.out.println(cattembok.sisaCat());

           cattembok.tambahCat("NonDrop");
           cattembok.tambahCat("Catylax");
           cattembok.tambahCat("Avitex");
           System.out.println(cattembok.sisaCat());

           cattembok.gantiCat(1,"Nippon Paint");
           System.out.println(cattembok.sisaCat());

           cattembok.CatRusak(0);
           System.out.println(cattembok.sisaCat());
      }
}

class Toko_Bangunan {
      ArrayList<String> Material = new ArrayList<>();

      public Toko_Bangunan(){

      }
      public void setCat(ArrayList<String> Material) {
            this.Material = Material;
      }
      public ArrayList<String> getCat(){
            return this.Material;
      }
} 

class CatTembok extends Toko_Bangunan {
      public void tambahCat(String Material){
            super.getCat().add(Material);
      }
      public String CatRusak(int index){
            return super.getCat().remove(index);
      }
      public void gantiCat(int index, String Material){
            super.getCat().set(index, Material);
      }
      public ArrayList<String> sisaCat(){
            return super.getCat();
      }
}