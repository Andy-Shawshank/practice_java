package demo_package;

public class Person {
    private String name;
    private int age;

    public void tell(){
        System.out.println("my name is:" + name + "aged "+ age);
    }

    public void setName(String n) {
        name=n;
    }

    public void setAge(int a){
        age=a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}

