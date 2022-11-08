public class Programer extends  Person{
    private String companyName;
    public Programer( String comanyName ){
        this.companyName=comanyName;
    }
    public void codning(){

    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
