class Solution {
    public int evaluatePostfix(String[] tokens) {
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
                    res.add(Math.floorDiv(a,b));
                    break;
                }
                case "^" : {
                    int b = res.pop();
                    int a = res.pop();
                    res.add((int)Math.pow(a,b));
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