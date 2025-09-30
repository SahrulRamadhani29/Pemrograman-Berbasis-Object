public class encapTest {
    public static void main(String[] args) {
        encapDemo encap = new encapDemo();
        encap.SetName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
    }
}
