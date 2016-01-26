import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SignatureDecorator {
	
	public String applyDecoration(String name, String[] commands, String[] decorations) {
		for (int i = 0; i < commands.length; i++) {
			if(commands[i].equals("surround") || commands[i].equals("prepend")){
				name = decorations[i] + name;
			}
			if(commands[i].equals("surround")){
				name =  name + new StringBuilder(decorations[i]).reverse().toString();
			}else if(commands[i].equals("append")){
				name =  name + decorations[i];
			}
		}
		return name;
	}
}
