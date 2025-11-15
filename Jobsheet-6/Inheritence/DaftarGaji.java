public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index = 0;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai p) {
        listPegawai[index] = p;
        index++;
    }

    public void printSemuaGaji() {
        System.out.println("Daftar Gaji Pegawai dan Dosen:");
        System.out.println("");
        for (Pegawai p : listPegawai) {
            if (p != null) {
                System.out.println("Nama: " + p.getNama());
                System.out.println("Gaji: Rp" + p.getGaji());
                System.out.println("");
            }
        }
    }
}
