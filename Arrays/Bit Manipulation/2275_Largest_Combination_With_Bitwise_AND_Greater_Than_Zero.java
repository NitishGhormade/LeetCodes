// Time Complexity: O( n * 24 ) 
// 10^7 needs 24 Bits to represent
class Solution {
    public int largestCombination(int[] candidates) {
        int maxlen = 0;

        int totalBits = (int)Math.floor(Math.log(1e7) / Math.log(2)) + 1; // 24

        for (int i = 0; i < totalBits; i++) {
            int cnt = 0;

            for (int j = 0; j < candidates.length; j++) {
                if ((candidates[j] & (1 << i)) > 0) {
                    cnt++;
                }
            }

            maxlen = Math.max(maxlen, cnt);
        }

        return maxlen;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////

// O( 2^n ) time complexity, O( n ) space complexity, (Time Limit Exceeded)
class Solution {
    static int maxlen;

    static void subseqAnd(ArrayList<Integer> current, int[] candidates, int and, int startIdx) {
        // base case
        if(and == 0){
            return;
        }
        maxlen = Math.max(maxlen, current.size());

        for (int i = startIdx; i < candidates.length; i++) {
            if (i > startIdx && candidates[i - 1] == candidates[i]) {
                continue;
            } 
            else {
                current.add(candidates[i]);
                subseqAnd(current, candidates, and & candidates[i], i + 1);

                current.remove(current.size() - 1);
            }
        }
    }

    public int largestCombination(int[] candidates) {
        maxlen = 0;
        
        int and = Integer.MAX_VALUE;

        Arrays.sort(candidates);

        subseqAnd(new ArrayList<>(), candidates, and, 0);

        return maxlen;
    }
}