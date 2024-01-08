import java.util.ArrayList;
class VoiceMessageUtil {

  public String greetMessage() {
    return "Hi";
  }

  public String greetMessage(String name) {
    return "Hi, " + name;
  }

  public String greetMessage(int count) {
    return "Hi count, " + count;
  }

  public void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(i + " : " + arr[i]);
    }
  }

  public void printArray(String[] arr) {
    for (String element : arr) {
      System.out.println(element);
    }
  }

  public void printArray(ArrayList<String> arr) {
    for (String element : arr) {
      System.out.println(element);
    }
  }
}
