class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>st=new HashMap<>();
        st.put('I',1);
         st.put('V',5);
         st.put('X',10);
         st.put('L',50);
         st.put('C',100);
         st.put('D',500);
         st.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1&&st.get(s.charAt(i))<st.get(s.charAt(i+1)))
            {
                ans=ans-st.get(s.charAt(i));
            }
            else{
                ans=ans+st.get(s.charAt(i));
                
            }
        }
        return ans;
    }
}