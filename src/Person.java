public class Person {
    private String name;
    private  String designation;
    public Person (){
        this.name=name;
        this.designation= designation;


    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }






    public  void learn(){

    }
    public void wolk(){

    }
    public  void eat(){


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
