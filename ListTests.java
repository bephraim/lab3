import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListTests implements StringChecker{
    public boolean checkString(String s) {
        return s.equals("a");
    }
    @Test 
    public void testFilter() {
        StringChecker sc = new ListExamples();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("a"); list1.add("b"); list1.add("c"); list1.add("d"); list1.add("e");
        ArrayList<String> list1F = new ArrayList<String>();
       list1F.add("a"); 
       assertEquals(list1F, ListExamples.filter(list1, sc));
        
       

        
       
    }

    @Test
     public void testMerge() {
        
    }
}
