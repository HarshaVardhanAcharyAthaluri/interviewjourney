import java.util.ArrayList;
import java.util.List;

public class CheckCloseOpenBraces {

	public boolean checkopenandclose(String input) {
		
		
		char splitarray[] = input.toCharArray();
		
		List<Character> l = new ArrayList<Character>();
		
		for(int i=0;i<splitarray.length;i++) {
			
			if(splitarray[i]=='{' ||splitarray[i]=='[' || splitarray[i] =='('  ) {
				l.add(splitarray[i]);
			}
			
			char temp;
			switch (splitarray[i]) {
			case '}':
				temp = l.get(l.size()-1);
				l.remove(l.size()-1);
				if(temp == '(' || temp == '[')
					return false;
				break;
				
			case ')':
				temp = l.get(l.size()-1);
				l.remove(l.size()-1);
				if(temp == '{' || temp == '[')
					return false;
				break;

			case ']':
				temp = l.get(l.size()-1);
				l.remove(l.size()-1);
				if(temp == '{' || temp == '(')
					return false;
				break;
			}
			
		}
		
		return l.isEmpty();
		
	}
	
	public static void main(String[] args) {
		CheckCloseOpenBraces cocb = new CheckCloseOpenBraces();
		System.out.println( cocb.checkopenandclose("({()[])()"));
	}
	
}
