// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        // code here
        char[] arr1 = S1.toCharArray();
        char[] arr2 = S2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        boolean flag = Arrays.equals(arr1,arr2);
        
        return (flag == true) ? 1 :0;
    }
}