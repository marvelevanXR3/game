package praktikum;

public class game {
    public static void main(String[] args) {
        
    

        player petani = new player();

        petani.nama = "ZXCYAN";
        petani.speed = 78;
        petani.damage = 25;
        petani.shield = 50;
        petani.healthpoint = 100;

        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over");
        }

    }
}