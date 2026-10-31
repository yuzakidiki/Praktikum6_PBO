public class CustomerService extends PegawaiBank {
    private int ratingKepuasan;

    public CustomerService(String id, String nama, double gajiPokok, int ratingKepuasan) {super(id, nama, gajiPokok);this.ratingKepuasan = ratingKepuasan;}

    @Override
    public double hitungGaji() 
    // Bonus gaji = gajiPokok + (ratingKepuasan x 500000)
    {return gajiPokok + (ratingKepuasan * 500000);}
}