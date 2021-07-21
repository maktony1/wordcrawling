package wordcrawling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		hashWord();

	}

	static void hashWord() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\MZC01-MAKTO\\Desktop\\voca.txt"));
		HashSet<String> hashSet = new HashSet<>();
		StringTokenizer st;

		// 단어 입력 ( 자동 중복 제거 )
		while (br.ready()) {
			st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens())
				hashSet.add(st.nextToken());
		}

		// toString
//		System.out.println(hashSet.toString().replace("[", "").replace("]", "").replace(",", ""));
		OutputStream output = new FileOutputStream("C:\\\\Users\\\\MZC01-MAKTO\\\\Desktop\\\\Output.txt");
	    
		String str =hashSet.toString().replace("[", "").replace("]", "").replace(",", "").replace("\n", "").replace("\n\n", "").replace(" ", "\n").replace("(", "").replace(")", "")
				.replace("1", "").replace("2", "").replace("3", "").replace("4", "").replace("5", "").replace("6", "").replace("7", "").replace("8", "").replace("9", "").replace("0", "")
				.replace("%", "").replace("/", "").replace(";", "").replace("?", "").replace(".", "").replace(":", "").replace("–", "").replace("-", "");
	    byte[] by=str.getBytes();
	    output.write(by);
	}
}
