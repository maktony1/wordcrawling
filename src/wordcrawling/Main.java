package wordcrawling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
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
	    String str ="오늘 날씨는 아주 좋습니다.";
	    byte[] by=str.getBytes();
	    output.write(by);
	}
}