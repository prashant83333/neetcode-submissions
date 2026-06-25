class Solution {
    public boolean isPalindrome(String t) {
        String s=t.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = s.length();
        int i = 0;
    
        int j = n-1;
        boolean f = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
                
            }
            i++;
            j--;
        }
        return true; 
    }
}
