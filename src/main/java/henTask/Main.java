package henTask;

import henTask.Hen.Hen;
import henTask.Hen.HenFactory;

import java.io.*;

public class Main {
    final static File file = new File("src/main/resources/countries.txt");
    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        Hen hen = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            String[] countries = null;
            while(line != null) {
                countries = line.split(",");

                for (String country : countries) {
                    System.out.println(country);
                    hen = HenFactory.getHen(country.replaceAll("\\s", ""));
                    System.out.println(hen.getDescription() + "\n");
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error while Reading File!");
            e.printStackTrace();
        }
    }
}
