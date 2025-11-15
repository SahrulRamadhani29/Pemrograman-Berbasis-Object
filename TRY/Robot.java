public class Robot  {
    public String name;
    public int CPUSpeed;
    public int Power;


    public void increasePower() {
        Power += 10;
    }

    public void reducePower(int decrement) {
        Power -= 10;
    }


}