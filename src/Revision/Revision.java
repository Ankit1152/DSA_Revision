package Revision;

public class Revision {
    int x;

    public Revision(int x) {
        this.x = x;
    }

    public void print() {
        System.out.println("Revision");
    }

    public static void main(String[] args) {
        Revision r = new Revision();
    }
}