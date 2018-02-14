import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exer9 {
    public static void main(String[] args) throws IOException {

        String fileName = "src/file.txt";
        FileReader f=new FileReader(fileName);

        BufferedReader br = new BufferedReader(f);

            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null) {

                sb.append(line);

                if (line != null) {
                    sb.append(System.lineSeparator());
                }
            }

            System.out.println(sb);
        }

}
