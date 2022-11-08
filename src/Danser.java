public class Danser  extends Person{
    private String groupName;


    public Danser(String groupName ){
        this.groupName=groupName;


    }




    public void dansing(){

    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Danser{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
