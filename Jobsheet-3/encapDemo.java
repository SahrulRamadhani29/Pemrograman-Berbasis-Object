public class encapDemo {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void SetName (String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge (int newAge){
        if (age <18 || age>30) {
            System.out.println("Minimum age is 18 and maximum age is 30");
            System.exit(0);
        }
        else {
            age = newAge;
        }
    }
}
