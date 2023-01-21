public abstract class Pet {
    private String name;
    private int age;
    private String breed;


    public void SetName (String name){
        this.name = name;
    }

    public void SetAge (int age){
        this.age = age;
    }

    public void SetBreed (String breed){
        this.breed = breed;
    }

    public String GetName (){
        return name;
    }

    public String GetBreed (){
        return breed;
    }

    public int GetAge (){
        return age;
    }

    public abstract void Say();


}
