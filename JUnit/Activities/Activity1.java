import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static List<String> list;

    @BeforeEach
     void setUp(){
        list = new ArrayList<String>();
        list.add("alpha"); // at index 0
        list.add("beta"); // at index 1
    }

    @Test
    public void insertTest(){
        assertEquals(2, list.size(), "Wrong size");
        list.add("gamma");
        assertEquals(3, list.size(), "Wrong size");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");
    }

    @Test
    public void replaceTest(){
        assertEquals(2, list.size(), "Wrong size");
        list.add("gamma");
        assertEquals(3, list.size(), "Wrong size");
        list.set(1,"ABC");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("ABC", list.get(1), "Wrong element");
    }
}
