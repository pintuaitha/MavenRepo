package training.maven.quick;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
	public HelloWorld(){
}
public int countWords(String words) {
String[] separateWords = StringUtils.split(words, ' ');
return (separateWords == null) ? 0 : separateWords.length;
}
}
