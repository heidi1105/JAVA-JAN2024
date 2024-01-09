import java.util.ArrayList;

class DeveloperTest{
    public static void main(String[] args){
        System.out.println("------ Developer Test --------");
        Developer dev1 = new Developer();
        dev1.name = "Pepper";
        dev1.wpm = 80;
        dev1.languages.add("Java");
        dev1.salary = 200000;
        dev1.braincell = 10;
        dev1.display();
    }
}