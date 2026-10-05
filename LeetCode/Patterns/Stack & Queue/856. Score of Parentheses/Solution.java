class Solution {
    public int scoreOfParentheses(String S) {
      return par(S,0,S.length());  
    }
    private int par(String S,int i,int j){
        int ans=0,bal=0;
        for(int k=i;k<j;++k){
            bal+=S.charAt(k)=='(' ? 1:-1;
            if(bal==0){
                if(k-i==1){
                    ans++;
                } else{
                    ans+=2*par(S,i+1,k);
                }
                i=k+1;
            }
        }
        return ans;
    }
}