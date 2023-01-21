public class Dog extends  Pet{
    public Person master;

    public Dog (Person master, String breed, String name, int age){
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

    public void Say(){
        System.out.println("-Гав-гав!");
    }

    public String toString() {
        return("Хозяин собаки: " + this.master + "; " + "\n" + "порода собаки: " + GetBreed() + ", " + " кличка: " + GetName() + ", " + "возраст питомца: " + GetAge() + ".");
    }


}