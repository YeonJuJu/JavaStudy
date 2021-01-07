interface Parseable{
	// 구문분석 메소드
	public abstract void parse(String fileName);
}
// XML 파일 분석 클래스
class XMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - XML parsing completed.");
	}
}
// HTML 파일 분석 클래스
class HTMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " - HTML parsing completed.");
	}
}
class ParserManager{
	// return type 이 Parseable interface 임...
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			Parseable p = new XMLParser();
			return p;
		}else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

public class Ex13 {
  public static void main(String[] args) {
  	Parseable parser1 = new XMLParser();
  	Parseable parser2 = new HTMLParser();
  	
  	Parseable parser = ParserManager.getParser("XML");  // <-- new new XMLParser(); 
  	parser.parse("document.xml");
  	
  	parser = ParserManager.getParser("HTML");
  	parser.parse("tjoeun.html");
  	
  }
}




