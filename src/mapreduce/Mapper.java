package mapreduce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mapper {

	private void map () throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("src/pg4300.txt"));
		String line = null;        

		while ((line = reader.readLine()) != null) {

			StringTokenizer tokens = new StringTokenizer(line);
			while(tokens.hasMoreTokens()){
				emitIntermediate(tokens.nextToken(), "1");
			}
		}
	}

	private void emitIntermediate (String w, String um) {
		System.out.println(w + "\t" + um);
	}

	public static void main(String[] args) throws IOException {
		new Mapper().map();
	}

}
