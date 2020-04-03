package lsystems;

import java.util.*;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
				
	ArrayList<Character> seqList = new ArrayList<Character>();
	if(line.length == 0) throw new LSystemLengthException();
	seqList.clear();
	for (int i = 0; i < line.length; i++) {
		for (LRule rule: rules) {
			if (rule.getMatch() == line[i]) {
				for (char ch: rule.getBody()) {
					if (ch=='Q') throw new LSystemSymbolException(ch);
					seqList.add(ch);
				}
			}
		}
	}
	line = listToArray(seqList);
}

	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
