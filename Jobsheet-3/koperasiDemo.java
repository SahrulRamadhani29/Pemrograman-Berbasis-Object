public class koperasiDemo {
   public static void main(String[] args) {
    anggota anggota1 = new anggota ("Iwan", "Jalan Merdeka No 10", 0);
    System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
    
    anggota1.setNama("Iwan Setiawan");
    anggota1.setAlamat("Jalan Soekarno Hatta No 10");
    anggota1.setor(100000);
    System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
    
    anggota1.pinjam(5000);
    System.out.println("Simpanan " + anggota1.getNama() + " : Rp. " + anggota1.getSimpanan());
    } 
}
