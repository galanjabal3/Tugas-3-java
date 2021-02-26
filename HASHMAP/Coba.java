import java.util.HashMap;

class Coba {
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

        // mencetak semua isi objek
        System.out.println("Daftar temanku : " + friends);
        // menampilkn objek yang di inginkan
        System.out.println("Ini Nama Saya  : " + friends.get(5));
        // menghapus objek
        friends.remove(1);
        System.out.println("Daftar Temanku: " + friends);
        // menghapus semua
        friends.clear();
        System.out.println("Daftar Temanku : " + friends);


    } 
}