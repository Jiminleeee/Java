package project001;


	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	import org.snu.ids.kkma.index.Keyword;
	import org.snu.ids.kkma.index.KeywordExtractor;
	import org.snu.ids.kkma.index.KeywordList;
	import org.snu.ids.kkma.ma.MExpression;
	import org.snu.ids.kkma.ma.MorphemeAnalyzer;
	import org.snu.ids.kkma.ma.Sentence;
	import org.snu.ids.kkma.util.Timer;


	public class WordAnalysis
	{

		public static void main(String[] args) throws FileNotFoundException, IOException 
		{
			File file = new File("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\빵집\\부산.csv");
			
			
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			
			File f1 = new File("C:\\Users\\501-21\\Desktop\\kopo32\\프로젝트\\빵집\\부산단어.csv");
			BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1)); // 파일 만들기
			
			String line= "";
			while ((line = bufReader.readLine()) != null) {
				StringBuffer s = new StringBuffer();
				System.out.println(line);
				String strToExtrtKwrd = line;
				KeywordExtractor ke = new KeywordExtractor();
				KeywordList kl = ke.extractKeyword(strToExtrtKwrd, true);
				for( int i = 0; i < kl.size(); i++ ) {
					Keyword kwrd = kl.get(i);
					System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());					
					s.append(kwrd.getString() + "\n");
					
				
			}
				bw1.write(s.toString()); // 새로 만든 파일에 내용 추가
				//bw1.newLine();	// 새로 만든 파일에 줄 바꾸기
				
		}
			bw1.close();
		}

		public static void maTest(String line) 
		{
			String string = line;
				
			try {
				MorphemeAnalyzer ma = new MorphemeAnalyzer();
				ma.createLogger(null);
				Timer timer = new Timer();
				timer.start();
				List<MExpression> ret = ma.analyze(string);
				timer.stop();
				timer.printMsg("Time");

				ret = ma.postProcess(ret);

				ret = ma.leaveJustBest(ret);

				List<Sentence> stl = ma.divideToSentences(ret);
				for( int i = 0; i < stl.size(); i++ ) {
					Sentence st = stl.get(i);
					System.out.println("=============================================  " + st.getSentence());
					for( int j = 0; j < st.size(); j++ ) {
						System.out.println(st.get(j));
					}
				}

				//ma.closeLogger();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void keTest(String line)
		{
			String strToExtrtKwrd = line;
			KeywordExtractor ke = new KeywordExtractor();
			KeywordList kl = ke.extractKeyword(strToExtrtKwrd, true);
			for( int i = 0; i < kl.size(); i++ ) {
				Keyword kwrd = kl.get(i);
				System.out.println(kwrd.getString() + "\t" + kwrd.getCnt());
			}
		}

	}