//Justin Butler
//11/12/2021
/*
Runtime: 42 ms
Memory Usage: 51 MB
*/
class WordDictionary {
    HashMap<Integer, HashSet<String>> hm;
    public WordDictionary() {
        hm = new HashMap<Integer, HashSet<String>>();
    }
    
    public void addWord(String word) {
        int size = word.length();
        if(hm.containsKey(size))
        {
            hm.get(size).add(word);
        }
        else
        {
            hm.put(size, new HashSet<String>());
            hm.get(size).add(word);
        }
        
    }
    
    public boolean search(String word) {
        int size = word.length();
        if(hm.containsKey(size))
        {
            if(word.equals(".")){return true;}
            if(word.contains("."))
            {
                HashSet<String> curr = hm.get(size);
                for(String i : curr)
                {
                    StringBuilder bld = new StringBuilder();
                    for(int j = 0; j < i.length(); j++)
                    {
                        if(word.charAt(j)=='.')
                        {
                           bld.append('.');
                        }
                        else
                        {
                            bld.append(i.charAt(j));
                        }
                    }
                    if(word.equals(bld.toString())){return true;}
                }
                return false;
            }
            else
            {
                return(hm.get(size).contains(word));
            }
            
        }
        return false;
        
    }
}
