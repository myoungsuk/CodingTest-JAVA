import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<String> spellSet = new HashSet<>(Arrays.asList(spell));
        
        for (String word : dic) {
            Set<String> wordSet = new HashSet<>(Arrays.asList(word.split("")));
            
            if (wordSet.containsAll(spellSet)) {
                return 1;
            }
        }
        
        return 2;
    }
}