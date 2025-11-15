public class Segitiga {
    public int sudut;
    public int keliling;

    public void totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println("Total sudut 1 Nilai Segitiga adalah = " + sudut);

    }

    public void totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        System.out.println("Total sudut 2 Nilai Segitiga adalah = " + sudut);
    }

    public void keliling(int sisiA, int sisiB, int sisiC) {
        keliling = sisiA + sisiB + sisiC;
        System.out.println("Total Keliling 3 Sisi Segitiga adalah = " + keliling);
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
        double hasil =  sisiA + sisiB + sisiC;
        System.out.println("Keliling Segitiga siku 2 sisi adalah = " + hasil);
        return hasil;
    }

}
