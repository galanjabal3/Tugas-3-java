import java.util.HashMap;

public class Ubah {
    public static void main(String[] args){
        // membuat objek hashmap 
        HashMap<Integer, String> friends = new HashMap<Integer, String>();

        // mengisi nilai ke objek friends
        friends.put(1, "Salman");
        friends.put(2, "Al");
        friends.put(3, "Ballad");
        friends.put(4, "Badar");
        friends.put(5, "Jabal");
        friends.put(6, "Rizal");
        friends.put(7, "Azizi");

        // mengubah hari minggu mejadi hari ahad
        friends.put(1, "SALMAN");
        // mengubah hari Rabu menjadi hari Rabo
        friends.replace(4, "BADAR");
        // Menampilkan Semua
        System.out.println("Daftar Teman ku : " + friends);

    } 
}
