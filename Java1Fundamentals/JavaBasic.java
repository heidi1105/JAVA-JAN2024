class JavaBasic{
    public static void main(String[] args){
        System.out.println("Hello World");

        // 2. variables (int, double, boolean, char, String )
        String projectTitle = "Cafe Java"; 
        /*
        * FileName/ClassName: PascalCase
        * varName, methodName: camelCase
        * DO NOT USE snake_case 
        */
        String developer = "Heidi";
        int totalFiles = 2;
        boolean isDone = false;
        double requiredTime = 1.5;
        char difficulty = 'B';
        System.out.println(projectTitle + developer + totalFiles + isDone + requiredTime + difficulty);
        // Wrapper class: allow null

        // 3. if-conditions & ternary
        if(isDone){ // condition MUST BE a boolean
            System.out.println(projectTitle + " is complete.");
        }else{
            System.out.println(projectTitle + " is incomplete.");
        }

        if(totalFiles > 1){
            System.out.println(projectTitle + " requires more than 1 file");
        }

        System.out.println(requiredTime > 1? 
            "You need more time to complete" : 
            "It shouldn't take you too much time");

        // 4. String (length, concat, format, .equals)
        System.out.println(projectTitle.length());

        System.out.println(projectTitle + " ----- " + developer);
        System.out.println(projectTitle.concat("------").concat(developer));

        String projectDetails = String.format("Project Title: %s | Required Time: %.2f", projectTitle, requiredTime);
        System.out.println(projectDetails);
        //System.out.printf("Project Title: %s | Required Time: %.2f", projectTitle, requiredTime);

        String name1 = "Heidi";
        String name2 = "Heidi";
        String name3 = new String("Heidi");

        System.out.println(name1 == name2);
        System.out.println(name1 == name3);

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));

    }
}