import java.util.*;

public class Meeting {

	public static String meeting (String s) {
		s = s.toUpperCase();
			String finish = "";
				String[] sa = s.split(";");
		
		ArrayList<String> list = new ArrayList<String>();
		
			for (int i = 0; i < sa.length; i++) {
				String[] sb = sa[i].split(":");
					list.add(sb[1] + ", " + sb[0]);
			}
		
		Collections.sort(list);
		
			for (int i = 0; i < list.size(); i++) {
				finish = finish + "(" + list.get(i) + ")";
			}
		
		return finish;
	
		
	}

}
