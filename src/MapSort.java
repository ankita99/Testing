import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapSort {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("1", "Rashmi");
		map.put("2", "Shilpa");
		map.put("3", "Ankita");
		map.put("4", "12345");
		System.out.println(map);
		
		List<Entry<String, String>> list=new ArrayList<Map.Entry<String,String>>(map.entrySet());
		System.out.println(list);
		Collections.sort(list, new Comparator<Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1,
					Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println(list);
	}

}
