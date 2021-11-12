//HashSet solution
//Justin Butler
//11/12/2021
class WordDictionary {
    HashSet<String> dict;
    boolean singleChar = false;
    public WordDictionary() {
        dict = new HashSet<String>();
    }
    public void addWord(String word) {
        if(word.length()==1){singleChar = true;} // improve search functionality for single chars
        dict.add(word);
    }
    public boolean search(String word) {
        if(word.contains("."))
        {
            if(word.equals(".")) // edge case that slows us down
            {return singleChar;}
            char[] arr = word.toCharArray();
            for(String i : dict) // search for match
            {
                if(i.length() == arr.length)
                {
                    StringBuilder curr = new StringBuilder();
                    for(int j = 0; j < arr.length; j++)
                    {
                        if(arr[j]=='.')
                        {
                            curr.append('.');
                        }
                        else
                        {
                            curr.append(i.charAt(j));
                        }
                    }
                    if(curr.toString().equals(word))
                    {
                        return true;
                    }
                }
                
            }
        }
        return dict.contains(word);
        
    }
        
}
