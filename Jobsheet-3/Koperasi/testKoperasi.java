import java.util.Scanner;
public class testKoperasi {
    public static void main(String[] args) {

        float pinjam;
        float bayar;
        Scanner input= new Scanner(System.in);
        koperasi Rama = new koperasi ("1234567890", "Rama", 5000000);
        System.out.println("");
        System.out.println("Nama : " + Rama.getNama());
        System.out.println("Nomor KTP : " + Rama.getNomorKTP());
        System.out.println("Limit Pinjaman : " + Rama.getLimitPinjaman());
        System.out.println("");

        System.out.println("");
        System.out.print("masukkan jumlah pinjaman : ");
        pinjam = input.nextFloat();
        Rama.meminjam(pinjam);
        
        System.out.println("");
        System.out.print("masukkan jumlah pinjaman : ");
        pinjam = input.nextFloat();
        Rama.meminjam(pinjam);
        
        System.out.println("");
        System.out.print("masukkan jumlah angsuran : ");
        bayar = input.nextFloat();
        Rama.membayar(bayar);
        
        System.out.println("");
        System.out.print("masukkan jumlah angsuran : ");
        bayar = input.nextFloat();
        Rama.membayar(bayar);
        
    }
}
