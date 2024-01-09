import java.util.ArrayList;

class Developer{
    // 1. properties
    private String name;
    private int wpm;
    private ArrayList<String> languages;
    private double salary;
    private int braincell;

    // 2. constructor 
    public Developer(){
        this.name = "Anonymous";
        this.wpm = 200;
        this.languages = new ArrayList<String>();
        this.languages.add("Java");
        this.salary = 150000;
        this.braincell = 8;
    }

    public Developer(String name){
        this.name = name;
        this.wpm = 60;
        this.languages = new ArrayList<String>();
        this.languages.add("Java");
        this.languages.add("HTML");
        this.languages.add("Python");
        this.salary = 120000;
        this.braincell = 10;
    }

    // 3. getters/setters
    // getter : with return, no parameters
    public String getName(){
        return this.name;
    }

    // setters : no return, with parameters
    public void setName(String name){
        this.name = name;
        // this.name : name of the instance (name of that dev created)
        // name : closest name variable -- the one in parameters
    }

    public int getWpm(){
        return this.wpm;
    }

    public void setWpm(int wpm){
        this.wpm = wpm;
    }

    public ArrayList<String> getLanguages(){
        return this.languages;
    }

    public void setLanguages(ArrayList<String> languages){
        this.languages = languages;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getBraincell(){
        return this.braincell;
    }

    public void setBraincell(int braincell){
        this.braincell = braincell;
    }

    // 4. other methods
    public void display(){
        System.out.println("==== Developer Display ======");
        System.out.println("Name: "+ this.name);
        System.out.println("wpm: "+ this.wpm);
        System.out.println("languages: "+ this.languages);
        System.out.println("salary: "+ this.salary);
        System.out.println("braincell: "+ this.braincell);
    }

    public Developer debug(){
        System.out.println(this.name + " is debugging..... still working on it");
        this.braincell--;
        return this;
    }

    public Developer fixedBug(){
        System.out.println(this.name + " has successfully fixed the bug");
        this.braincell+= 2;
        return this;        
    }
}