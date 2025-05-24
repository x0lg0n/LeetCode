class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List <Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++){ 
            if (words[i].indexOf(x) != -1){
                res.add(i);
            }
        }

        return res;
    }
}