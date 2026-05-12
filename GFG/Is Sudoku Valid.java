class Solution {
    static boolean isValid(int mat[][]) {
        // code here
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int num = mat[i][j];
                if(num != 0){
                    if(!set.add(num+"row"+i)){
                        return false;
                    }
                    if(!set.add(num+"col"+j)){
                        return false;
                    }
                    if(!set.add(num+"box"+(i/3)+(j/3))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}