class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.empty()||st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
                
            }
        }
        String ans="";
        while(!st.empty()){
             sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}