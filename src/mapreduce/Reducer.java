package mapreduce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reducer {
	
    private void reduce () throws NumberFormatException, IOException {
        String line = "";
        String previousKey = null;
        int total = 0;
        String key;
        int value;
        BufferedReader reader = new BufferedReader(new FileReader("src/pg4300.txt"));
         
        while ((line = reader.readLine()) != null) {
            String [] linha = line.split("\\s+");
            key = linha[0];
            value = Integer.parseInt(linha[1]);
            if (!key.equals(previousKey)) {
                emit(previousKey, total);
                previousKey = key;
                total = 0;
            }
            total += value;     
        }
        emit(previousKey, total);
                 
    }
 
    private void emit(String term, int sum) {
        if (term != null) {
            System.out.println(term + "\t" + sum);
        }
    }
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        new Reducer().reduce();
    }

}
