import java.util.HashMap;
import java.util.Map;

class inbuildHashMethod {
    public static void main(String[] args)
    {
        Map<Integer, String> dataMap = new HashMap<>();

        String name = "Epuri Sai Vyshnavi";
        int hashcode = name.hashCode();
        dataMap.put(hashcode, name);
        String outputName = dataMap.get(hashcode);
        System.out.println("Name " + name + "\nHashCode: " + hashcode);
        System.out.println("Name: " + outputName);
    }
}
