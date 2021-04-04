import java.util.Stack;

public class Inheritance_Stack {
      public static void main(String args[]){
            CatTembok cattembok = new CatTembok();
            System.out.println(cattembok.sisaCatTembok());
 
            cattembok.tambahCatTembok("Avian");
            cattembok.tambahCatTembok("Jotun");
            cattembok.tambahCatTembok("Decolith");
            System.out.println(cattembok.sisaCatTembok());
 
            cattembok.gantiCatTembok(2,"Aquaproof");
            System.out.println(cattembok.sisaCatTembok());
 
            cattembok.cattembokRusak();
            System.out.println(cattembok.sisaCatTembok());
      }
}
 
class Toko_Bangunan {
      Stack<String> material = new Stack<String>();
 
      public Toko_Bangunan(){
 
      }
      public void setCatTembok(Stack<String> material) {
            this.material = material;
      }
      public Stack<String> getCatTembok(){
            return this.material;
      }
} 
 
class CatTembok extends Toko_Bangunan {
      public void tambahCatTembok(String material){
            super.getCatTembok().push(material);
      }
      public String cattembokRusak(){
            return super.getCatTembok().pop();
      }
      public void gantiCatTembok(int index,String material){
            super.getCatTembok().set(index, material);
      }
      public Stack<String> sisaCatTembok(){
            return super.getCatTembok();
      }
}

