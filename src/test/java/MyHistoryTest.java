import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyHistoryTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void read() {
        MyHistory h = new MyHistory("uwu.txt");
        try {
            h.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @org.junit.jupiter.api.Test
    void save() {
    }

    @org.junit.jupiter.api.Test
    void addLine() {
        MyHistory h = new MyHistory("uwu.txt");
        ArrayList<String> l = new ArrayList<>();
        l.add("hh");
        h.addLine("hh");
        h.addLine("hh");
       assertEquals(Arrays.toString(l.toArray()),h.toString());

    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}