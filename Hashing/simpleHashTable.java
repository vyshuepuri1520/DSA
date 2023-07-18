import java.util.Hashtable;
import java.util.Map;

public class simpleHashTable {
    public static void main(String[] args)
    {
        Map<Integer, String> studentData = new Hashtable();
        studentData.put(1,"Ishu");
        studentData.put(2,"Vyshu");
        studentData.put(3,"Usha");
        studentData.put(4,"Omkar");
        studentData.put(5,"Sai");
        int searchIndex = 2;
        String outputName = studentData.get(searchIndex);
        System.out.println(outputName);
    }
}
