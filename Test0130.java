//NAMA : Vara Dilla
//NIm : 13020210130

class Test0130 {
    public static void main(String[] args) {
        // (a) buat instansi objek bernama balok1 dari Class Balok () default const.
        Balok balok1 = new Balok();
        
        // (b) buat instansi objek bernama balok2 dari Class Balok (20, 35, 15) param const.
        Balok balok2 = new Balok(20, 35, 15);
        
        // (c) setter → set nilai lebar=5 dari konstruktor Balok()
        balok1.setLebar(5);
        
        // (d) setter → set nilai panjang=25 dari konstruktor Balok()
        balok1.setPanjang(25);
        
        // (e) setter set nilai tinggi=10 dari konstruktor Balok(20, 35, 15)
        balok2.setTinggi(10);
        
        // (f) panggil method info dari konstruktor Balok ()
        balok1.info();
        
        // (g) panggil method info dari konstruktor Balok (20, 35, 15)
        balok2.info();
    }
}

// class PersegiPanjang
class PersegiPanjang {
    int panjang;
    int lebar;
    
    public PersegiPanjang() {
        this.panjang = 10;
        this.lebar = 5;
    }
    
    public PersegiPanjang(int p, int l) {
        this.panjang = p;
        this.lebar = l;
    }
    
    public void setPanjang(int p) {
        this.panjang = p;
    }
    
    public void setLebar(int l) {
        this.lebar = l;
    }
}

// class Balok
class Balok extends PersegiPanjang {
    int tinggi;
    
    public Balok() {
        super();
        this.tinggi = 15;
    }
    
    public Balok(int p, int l, int t) {
        super(p, l);
        this.tinggi = t;
    }
    
    public void setTinggi(int t) {
        this.tinggi = t;
    }
    
    public void info() {
        System.out.println("Panjang = " + this.panjang);
