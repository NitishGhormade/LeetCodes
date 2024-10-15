class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();

        for(int i = 1;i <= numRows;i++){
            ArrayList<Integer> current = new ArrayList<>();

            for(int j = 1;j <= i;j++){
                if(j == 1 || j == i){
                    current.add(1);
                }
                else{
                    current.add((ls.get(ls.size() - 1)).get(j - 2) + (ls.get(ls.size() - 1)).get(j - 1));
                }
            }

            ls.add(current);
        }

        return ls;
    }
}