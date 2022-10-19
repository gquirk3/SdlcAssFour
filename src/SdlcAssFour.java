import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SdlcAssFour {

	public static void main(String[] args) {

    	String text = "";  // variable to store the poem
		
		Path fileName = Path.of("poem.txt");
		try {
			text = Files.readString(fileName);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		wordCount(text);

	}
	public static String wordCount(String st) {
		
		String output = "";
		String[] textArray = st.toLowerCase().split("\\W+");  
		
		ArrayList<Integer> list = new ArrayList<>();
	    Map<String, Integer> freqMap = new HashMap<>();
	    LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		
	    // loop to iterate through clean data 
	    // if word exists - ups the count by 1
	    // if word doesn't exist - adds word and sets count to 1
	    for (String s : textArray)
	    {	    	
	        if (freqMap.containsKey(s)) {
	            Integer count = freqMap.get(s);
	            freqMap.put(s, count + 1);
	        } else {
	            freqMap.put(s, 1);
	        }

	    }
	    
	    // adds values to list
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            list.add(entry.getValue());
        }
        
        // sorts list
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer str, Integer str1) {
                return (str1).compareTo(str);
            }
        });
        
     // uses list and keys from sorted data and
        // adds to new hashtable
        for (Integer str : list) {
            for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue().equals(str)) {
                    sortedMap.put(entry.getKey(), str);
                }
            }
        }
        
        // iterates through sorted has table and outputs word and count
        // from highest count to lowest - top 20
        int count = 1;  // variable to count to 20
        for (Map.Entry<String, Integer> e: sortedMap.entrySet())
        {
        	
        	if (count < 21)
        	{
        	output += (count + ". " + e.getKey() + " " + e.getValue());
        	System.out.println(count + ". " + e.getKey() + " " + e.getValue());
        	count += 1;
        	}

        }
		return output;
	}

}
