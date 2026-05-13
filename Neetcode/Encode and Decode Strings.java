class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0){
            return "";
        }
        String encoded = "";
        for(String i : strs){
            int len = i.length();
            encoded = encoded+len+"#"+i;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        List <String> decoded = new ArrayList<>();
        int len = str.length();
        for(int i=0; i<len; i++){
        int j = i;
        while(str.charAt(j) != '#'){
            j++;
        }
        int l = Integer.parseInt(str.substring(i, j));
                String res = "";
                int end = j+1+l;
                 for(int k=j+1; k<end; k++){
            res = res + str.charAt(k);
        }
                decoded.add(res);
                i=end-1;
        }
        return decoded;
    }
}

