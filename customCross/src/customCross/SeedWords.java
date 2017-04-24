package customCross;

import java.util.HashMap;
import java.util.Map;

/* Dictionary class containing the complete list of words/definitions for use in generating crosswords.
 *  Currently using preset hashmap for dictionary. 
 *  This will inevitably change to an ordered database to allow for multiple "hints", and subject categories.*/
public class SeedWords {
	private String[] wordList = {"VITIATE", "INTERCESSION", "DEMIURGE", "ORTHOPTEROUS", "FARINACEOUS", "MYCOPHAGY", "DELIQUESCE", "CIRCUMPOLAR", "PHANTASMAGORIC", "VIAND"};
	private Map<String, String> dictionaryList = new HashMap<String, String>();
	{
		dictionaryList.put("vitiate", "spoil or impair the quality or efficiency of");
		dictionaryList.put("intercession", "the action of intervening on behalf of another");
		dictionaryList.put("demiurge", "A being responsible for the creation of the universe");
		dictionaryList.put("Orthopterous", "Of or belonging to the Orthoptera, a large order of insects, including crickets, locusts, and grasshoppers");
		dictionaryList.put("farinaceous", "consisting of or containing starch");
		dictionaryList.put("mycophagy", "process of organisms consuming fungi");
		dictionaryList.put("deliquesce", "(of matter) become liquid, typically during decompostion");
	dictionaryList.put("circumpolar", "situated around or inhabiting one of the earth's poles");
	dictionaryList.put("phantasmagoric", "having a fantastic or deceptive appearance, as something in a dream or created by the imagination");
	dictionaryList.put("viand", "an item of food");
	}
	
	public Map<String, String> getDictionaryList(){
		return dictionaryList;
	}
	
	public void setDictionaryList(Map<String, String> dictionaryList) {
		this.dictionaryList = dictionaryList;
	}
	
	public String[] getWordList() {
		return wordList;
	}
	
	public void setWordList(String[] wordList) {
		this.wordList = wordList;
	}

}
