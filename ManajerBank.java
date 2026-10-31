public class ManajerBank extends PegawaiBank {
    private boolean targetTercapai;

    public ManajerBank(String id, String nama, double gajiPokok, boolean targetTercapai) {super(id, nama, gajiPokok);this.targetTercapai = targetTercapai;}

    @Override
    public double hitungGaji() {
        // Jika true: gajiPokok + tunjangan 20%. Jika false: hanya gajiPokok.
        if (targetTercapai) {
            return gajiPokok + (gajiPokok * 0.20);
        } else {
            return gajiPokok;
        }
    }
}