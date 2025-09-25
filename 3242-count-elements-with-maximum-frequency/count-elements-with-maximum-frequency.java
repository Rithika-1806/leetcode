

class Solution {
    public int maxFrequencyElements(int[] nums) {
        List<Integer> unique = new ArrayList<>();
        List<Integer> freq = new ArrayList<>();

        for (int num : nums) {
            if (!unique.contains(num)) {
                unique.add(num);
                freq.add(1);
            } else {
                int index = unique.indexOf(num);
                freq.set(index, freq.get(index) + 1);
            }
        }

        int maxFreq = 0;
        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }
        int total = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                total += f;
            }
        }

        return total;
    }
}
