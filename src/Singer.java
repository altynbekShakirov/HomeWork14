public class Singer extends Person{
    private String brendName;



    public  Singer (String brendName){
     this.brendName=brendName;
    }


    public  void singning(){


    }
    public void playGitar(){


    }

    public void setBrendName(String brendName) {
        this.brendName = brendName;
    }

    public String getBrendName() {
        return brendName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "brendName='" + brendName + '\'' +
                '}';
    }
}
