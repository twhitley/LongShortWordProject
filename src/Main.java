import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String s1 = " The cow jumped over the moon ";

        System.out.println(getLongestWord(s1));
        System.out.println(getShortestWord(s1));
    }

    static HashMap<String,Integer> getLongestWord(String s) {
        int max = 0;
        int maxIdx = 0;
        String[] newString = s.trim().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        HashMap<String,Integer> result = new HashMap<String,Integer>();
        for(int i = 0; i < newString.length; i++){
            if(newString[i].length() > max) {
                max = newString[i].length();
                maxIdx = i;
            }
        }
        result.put(newString[maxIdx], max);
        return result;
    }

    static HashMap<String,Integer> getShortestWord(String s) {
        int min = Integer.MAX_VALUE;
        int minIdx = Integer.MAX_VALUE;
        String[] newString = s.trim().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        HashMap<String,Integer> result = new HashMap<String,Integer>();
        for(int i = 0; i < newString.length; i++){
            if(newString[i].length() < min) {
                min = newString[i].length();
                minIdx = i;
            }
        }
        result.put(newString[minIdx], min);
        return result;
    }

}
