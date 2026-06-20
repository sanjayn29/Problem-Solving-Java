class Solution {
    public String multiplyStrings(String s1, String s2) {
        // code here
        java.math.BigInteger n1 = new java.math.BigInteger(s1);
        java.math.BigInteger n2 = new java.math.BigInteger(s2);
        return String.valueOf(n1.multiply(n2));
    }
}