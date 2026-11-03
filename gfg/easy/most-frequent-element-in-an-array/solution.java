class Solution {
    public int mostFreqEle(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);

            if (currentKeyFreq > maxFreq ||
               (currentKeyFreq == maxFreq && currentKey > maxFreqKey)) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }

        return maxFreqKey;
    }
}