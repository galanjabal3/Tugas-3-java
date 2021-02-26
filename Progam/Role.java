import java.util.HashMap;
import java.util.Map;

public class Role {
    public static void main(String[] args){
        // membuat objek hashmap
        HashMap<String, publik> books = new HashMap<String, publik>();
        
        // membuat objek publik
        publik publik1 = new publik ("Alucard,Zilong", "Exc");
        publik publik2 = new publik ("Karrie,Claude ", "Exc");
        publik publik3 = new publik ("Luo Yi,Nana", "Exc");

        // mengisi objek
        books.put("Fighter", publik1);
        books.put("Marksman", publik2);
        books.put("Mage", publik3); 

        // cetak semua publik    
        for(Map.Entry b: books.entrySet()){
            publik publik = (publik) b.getValue();
            System.out.println(b.getKey() + ": " + publik.getTitle());
        }
    }
}
