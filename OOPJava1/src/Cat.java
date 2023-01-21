import javax.sound.midi.Soundbank;

public class Cat extends  Pet{
       public Person master;
//    private String breed;
//    private String name;

    public Cat (Person master, String breed, String name, int age){
        this.master = master;
        SetBreed(breed);
        SetName(name);
        SetAge(age);
    }

    public Person getMaster() {
        return master;
    }
    public void setMaster (Person master){
        this.master = master;
    }
//    public String getBreed(){
//        return  breed;
//    }
//
//    public void setBreed (String breed){
//        this.breed = breed;
//    }
//    public String getName(){
//        return  name;
//    }
//    public void setName(String name){
////        this.name = name;
//    }

    public void Say(){
        System.out.println("-Мяяяяяу");
    }

    public String toString() {
        return("Хозяин кошки: " + this.master + "; " + "\n" + "порода кошки: " + GetBreed() + ", " + " кличка: " + GetName() + ", " + "возраст питомца: " + GetAge() + ".");
    }

}
