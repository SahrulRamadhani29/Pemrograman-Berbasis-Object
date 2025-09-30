public class motorDemo {

    public static void main(String[] args) {
        motor mtr1 = new motor();
        mtr1.printStatus();
        mtr1.tambahKecepatan();

        mtr1.nyalakanmesin();
        mtr1.printStatus();

        mtr1.tambahKecepatan();
        mtr1.printStatus();

        mtr1.tambahKecepatan();
        mtr1.printStatus();

        mtr1.tambahKecepatan();
        mtr1.printStatus();

        mtr1.matikanmesin();
        mtr1.printStatus();
    }
}