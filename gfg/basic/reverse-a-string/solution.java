class Solution {
    public static String reverseString(String s) {
        if (s == null || s.isEmpty()) return s;
        
        int len = s.length();
        char[] result = new char[len];
        
        int left = 0;
        int right = len -1;
        
        while (left <= right) {
            result[left] = s.charAt(right);
            result[right] = s.charAt(left);
            
            left++;
            right--;
        }
        return new String(result);
    }
}