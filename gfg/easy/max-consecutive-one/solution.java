
class Solution {
    public int maxConsecBits(int[] arr) {
        int countOnes = 0;
        int countZeroes = 0;
        int maxOnes = 0;
        int maxZeroes = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                countOnes++;
                countZeroes = 0;
            } else {
                countZeroes++;
                countOnes = 0;
            }

            // Update maximum inside the loop
            maxOnes = Math.max(maxOnes, countOnes);
            maxZeroes = Math.max(maxZeroes, countZeroes);
        }

        return Math.max(maxOnes, maxZeroes);
    }
}
