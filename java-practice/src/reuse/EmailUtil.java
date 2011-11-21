package reuse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUtil {

	Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}");
	
	public boolean isEmailAddress(String email) {
		
		Matcher m = p.matcher(email);
		return m.matches();
	}

}