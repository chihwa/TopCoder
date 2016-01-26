import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParameterSubstitution {
	
	public String processParams(String code, String[] params) {
		int numParams = params.length;
		for (int i = 1; i <= numParams; i++) {
			code = code.replace("$" + i, params[i-1]);
		}
		return code;
	}
}
