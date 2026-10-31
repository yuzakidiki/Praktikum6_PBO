public class PegawaiBank {
    protected String id;
    protected String nama;
    protected double gajiPokok;

    public PegawaiBank(String id, String nama, double gajiPokok) {
        this.id = id;
        this.nama = nama;
        this.gajiPokok = gajiPokok; }

    // Method hitungGaji default (bakalan di override sama subclass)
    public double hitungGaji() {return gajiPokok;}

    public void tampilkanInfo() {System.out.println("ID: " + id + " | Nama: " + nama);}
}