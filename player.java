package praktikum;

public class player{


    //definisi atribut
    String nama;
    int speed;
    int healthpoint;
    int damage;
    int shield;
    

    //definisi method run
    void run(){
        System.out.println(nama +" is running...");
        System.out.println("Speed: "+ speed);
    }

    //definisi method isDead untuk mengecek nilai kesehatan
    boolean isDead(){
        if(healthpoint <= 0) return true;
        return false;
    }
} 
