import javax.sound.midi.Soundbank;

public class Person {

    static int countID = 0;
    private String name;
    private int age;

    private int ID;


    public Person (String name, int age ){
        this.name = name;
        this.age = age;

        countID ++;
        this.ID = countID;

    }


    @Override
    public String toString() {
        return "Имя - " + this.name + ", "+" возраст - " + this.age +", " +  " ID - " + this.ID + ".";
    }

    public int getAge(){
        return  age;
    }

    public void setAge (int age){
        this.age = age;

    }


    public void feed(){
        System.out.println("Идем, малыш, накормлю тебя!");

    }
}
