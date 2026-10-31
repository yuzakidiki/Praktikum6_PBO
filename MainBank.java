import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {
        // Membuat ArrayList dengan tipe referensi PegawaiBank (Polimorfisme / Upcasting)
        ArrayList<PegawaiBank> daftarPegawai = new ArrayList<>();

        // Menambahkan data pegawai (Teller, CS, Manajer)
        daftarPegawai.add(new Teller("T001", "Pio", 4000000, 150));
        daftarPegawai.add(new Teller("T002", "Salsa", 4000000, 200));
        daftarPegawai.add(new CustomerService("CS001", "Memet", 4500000, 4));
        daftarPegawai.add(new CustomerService("CS002", "Raihan", 4500000, 5));
        daftarPegawai.add(new ManajerBank("M001", "Hamam", 8000000, true));
        daftarPegawai.add(new ManajerBank("M002", "Wijdani", 8000000, false));

        double totalPengeluaran = 0;
        int jumlahTeller = 0;
        int jumlahCS = 0;
        int jumlahManajer = 0;

        System.out.println("=== LAPORAN GAJI PEGAWAI BANK ===");
        System.out.println("--------------------------------------------------");

        // Iterasi menggunakan Virtual Method Invocation (VMI)
        for (PegawaiBank p : daftarPegawai) {
            p.tampilkanInfo();
            
            // VMI mengeksekusi method hitungGaji() sesuai subclass aslinya
            double gajiAkhir = p.hitungGaji();
            System.out.println("Total Gaji : Rp " + gajiAkhir);
            System.out.println("--------------------------------------------------");

            // Menambahkan ke total pengeluaran bank
            totalPengeluaran += gajiAkhir;

            // Menghitung jumlah masing-masing jenis pegawai menggunakan instanceof
            if (p instanceof Teller) {
                jumlahTeller++;
            } else if (p instanceof CustomerService) {
                jumlahCS++;
            } else if (p instanceof ManajerBank) {
                jumlahManajer++;
            }
        }

        // Menampilkan Rekapitulasi & Total Pengeluaran
        System.out.println("\n=== REKAPITULASI PEGAWAI & PENGELUARAN ===");
        System.out.println("Jumlah Teller          : " + jumlahTeller + " orang");
        System.out.println("Jumlah Customer Service: " + jumlahCS + " orang");
        System.out.println("Jumlah Manajer Bank    : " + jumlahManajer + " orang");
        System.out.println("Total Pengeluaran Bank : Rp " + totalPengeluaran);
    }
}