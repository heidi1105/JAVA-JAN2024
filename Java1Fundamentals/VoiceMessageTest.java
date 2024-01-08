import java.util.ArrayList;

class VoiceMessageTest{
    public static void main(String[] args){
        // 6. dependency injection (using methods in another file) & overloading methods
        VoiceMessageUtil newBot = new VoiceMessageUtil();
        /* Behind the scene
        * 1. When VoiceMessageTest.java is compiled, it reads the instantiation of VoiceMessageUtil class
        * 2. The compiler search for VoiceMessageUtil.java in the same package/folder to compile
        * 3. Util file is compiled and all the methods in util can be used
        */
        System.out.println(newBot.greetMessage());
        System.out.println(newBot.greetMessage("Pepper"));
        System.out.println(newBot.greetMessage(123));

        // 5. Casting
        int intNum = 3;
        double intNumInDouble = intNum;
        System.out.println(intNumInDouble);

        double doubleNum = 2.5;
        int doubleNumInInt = (int) doubleNum;
        System.out.println(doubleNumInInt);

        // 6. Fixed Array
        int[] messagesPerDay = new int[3];
        int[] messagesPerDay2 = { 3, 6, 8};
        newBot.printArray(messagesPerDay2);

        String[] messages = {"Please call back!", "Make sure you install jdk", "DO NOT INSTALL VS CODE EXTENSION!"};
        newBot.printArray(messages);        

        System.out.println(messages);

        // 7. ArrayList
        // 7.1 instantiation of ArrayList 
        ArrayList<String> reminders = new ArrayList<String>();
    
        // NO MORE PUSH
        reminders.add("Please add semi-colon!");
        reminders.add("test");
        reminders.add("Please only use trusted repo");
        reminders.add("Put all the java files in the folder");

        System.out.println(reminders.get(0));
        reminders.remove("test");
        reminders.set(1, "Stay hydrated");
        newBot.printArray(reminders);
        System.out.println(reminders.size());
    }
}