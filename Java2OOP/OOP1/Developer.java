import java.util.ArrayList;

class Developer{
    // 1. properties
    public String name;
    public int wpm;
    public ArrayList<String> languages = new ArrayList<>();
    public double salary;
    public int braincell;

    // 2. other methods
    public void display(){
        System.out.println("==== Developer Display ======");
        System.out.println("Name: "+ this.name);
        System.out.println("wpm: "+ this.wpm);
        System.out.println("languages: "+ this.languages);
        System.out.println("salary: "+ this.salary);
        System.out.println("braincell: "+ this.braincell);
    }

}