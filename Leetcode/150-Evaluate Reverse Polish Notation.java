class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res = new Stack<>();
        for(String i:tokens){
            switch(i){
                case "+" : {
                    res.add(res.pop() + res.pop());
                    break;
                }
                case "-" : {
                    int b = res.pop();
                    int a = res.pop();
                    res.add(a-b);
                    break;
                }
                case "*" : {
                    int b = res.pop();
                    int a = res.pop();
                    res.add(a*b);
                    break;
                }
                case "/" : {
                    int b = res.pop();
                    int a = res.pop();
                    res.add(a/b);
                    break;
                }
                default : {
                    res.add(Integer.parseInt(i));
                }
            }
        }
        return res.pop();
    }
}