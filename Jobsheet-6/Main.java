public class Main {
    public static void main(String[] args) {

        DaftarGaji daftar = new DaftarGaji(3);

        Pegawai p1 = new Pegawai("111", "Budi Santoso", "Malang");
        Dosen d1 = new Dosen("222", "Dewi Lestari", "Surabaya");
        Dosen d2 = new Dosen("333", "Ramaaa", "Jakarta");

        d1.setSKS(10);
        d2.setSKS(15);

        daftar.addPegawai(p1);
        daftar.addPegawai(d1);
        daftar.addPegawai(d2);


        daftar.printSemuaGaji();
    }
}
