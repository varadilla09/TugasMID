//NAMA : Vara Dilla
//NIM : 13020210130

interface A {
    public void aaa();
}

interface B extends A {
    // tidak perlu mendefinisikan ulang metode aaa()
}

class Central0130 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0130 obj = new Central0130();
        System.out.println("main");
        obj.aaa();
    }
}