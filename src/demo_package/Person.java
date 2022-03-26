package demo_package;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

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

    public void main(String [] args){
        Person mzp = new Person("闵志鹏",20);
        mzp.tell();

    }

}



