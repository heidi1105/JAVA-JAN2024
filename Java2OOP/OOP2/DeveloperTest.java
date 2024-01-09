import java.util.ArrayList;

class DeveloperTest{
    public static void main(String[] args){
        System.out.println("------ Developer Test --------");
        Developer dev1 = new Developer("Pepper");
        dev1.display();

        Developer dev2 = new Developer();
        dev2.display();
        dev2.debug().debug().debug().debug().debug().debug().fixedBug();
        dev2.display();
    }
}