class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int ar=sentences[i].split(" ").length;
            if(max<ar){
                max=ar;
            }
        }
        return max;
    }
}
