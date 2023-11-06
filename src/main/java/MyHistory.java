import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyHistory {
    String filename;
    ArrayList<String> data;
    public MyHistory(String fileName) {
        this.filename = fileName;
        data =  new ArrayList<>();
    }

    public void read() throws IOException {
        if(Files.exists(Paths.get(filename))){
        data = new ArrayList<>(Files.readAllLines(Paths.get(filename)));
            return;
        }
        data = new ArrayList<>();

    }

    public void save() throws IOException {
         Files.writeString(Paths.get(filename),this.toString());
        // zapíše obsah paměti do souboru, skončí výjimkou pokud soubor nejde uložit
        // pokud soubor již existuje, přepíše jej
    }

    public void addLine(String str) {
        if(!data.contains(str)){
            data.add(str);
        }
        // přidá řádek str do paměti pokud tam ještě není,
        // duplicitní řádky ignoruje.
    }

    public String toString() {
        return Arrays.toString(data.toArray());
    }
}
