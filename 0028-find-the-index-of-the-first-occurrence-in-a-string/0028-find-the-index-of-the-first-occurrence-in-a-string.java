class Solution {
    public int strStr(String k, String needle) {
        int m=k.length();
        int n=needle.length();
        for(int i=0;i<=m-n;i++){
            if(k.substring(i,i+n).equals(needle)){
                return i;
            }
        }
    return -1;
    }
}