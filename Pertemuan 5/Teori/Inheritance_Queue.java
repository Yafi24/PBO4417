import java.util.Queue;
import java.util.LinkedList;
public class Inheritance_Queue {
      public static void main(String args[]){
            CatTembok cattembok = new CatTembok();
            System.out.println(cattembok.sisaCatTembok());
 
            cattembok.tambahCatTembok("NonDrop");
            cattembok.tambahCatTembok("Avitex");
            cattembok.tambahCatTembok("Dulux");
            cattembok.tambahCatTembok("Nippon Paint");
            cattembok.tambahCatTembok("Jotun");
            System.out.println(cattembok.sisaCatTembok());
 
            cattembok.cattembokRusak(3);
            System.out.println(cattembok.sisaCatTembok());
      }      
}

class Toko_CatTembok {
      Queue<String> Material = new LinkedList<String>();
 
      public Toko_CatTembok(){
 
      }
      public void setCatTembok(Queue<String> Material) {
            this.Material = Material;
      }
      public Queue<String> getCatTembok(){
            return this.Material;
      }
}

class CatTembok extends Toko_CatTembok {
      public void tambahCatTembok(String Material){
            super.getCatTembok().add(Material);
      }
      public void cattembokRusak(int index){
            System.out.println(super.getCatTembok().poll());
      }
      public Queue<String> sisaCatTembok(){
            return super.getCatTembok();
      }
} 