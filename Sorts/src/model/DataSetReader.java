package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataSetReader {

    public static int[] readCsv(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line = br.readLine();

        // Pula o primeiro valor por ser "Value"
        while (line != null && !line.matches(".*\\d.*")) {
            line = br.readLine();
        }

        if (line == null) {
            br.close();
            return new int[0];
        }

        // Agora a linha contém números
        String[] parts = line.split(",");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }

        br.close();
        return arr;
    }
}
