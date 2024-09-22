class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return "" + nums[0];
        }

        String[] str = new String[n];

        for(int i = 0;i < n;i++){
            str[i] = "" + nums[i];
        }


        Comparator<String> cmp = new Comparator<>(){  // Anonymous Inner Class
            public int compare(String s1, String s2){
                return (s2 + s1).compareTo(s1 + s2);
            }
        };
        Arrays.sort(str, cmp);

        if(str[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s: str){
            sb.append(s);
        }

        return sb.toString();
    }
}