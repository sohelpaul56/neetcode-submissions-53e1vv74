class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int res=0;
        for(String ch:operations){
            if(ch.equals("+")){
            int a=st.pop();
            int b=st.peek();
            st.push(a);
            st.push(a+b);
            }
            else if(ch.equals("C")){
            st.pop();
            }
            else if(ch.equals("D")){
            st.push(st.peek()*2);
            }
            else{
            st.push(Integer.parseInt(ch));
            }
        }
        while(!st.isEmpty()){
        res+=st.pop();
        }
        return res;
    }
}