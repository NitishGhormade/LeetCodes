class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] ss = sentence.split(" ");

        String sl = "";
        String sr = "";

        for(int i = 1;i < ss.length;i++){
            sl = ss[i - 1];
            sr = ss[i];

            if(sl.charAt(sl.length() - 1) != sr.charAt(0)){
                return false;
            }
        }

        sl = ss[0];
        sr = ss[ss.length - 1];
        if(sl.charAt(0) != sr.charAt(sr.length() - 1)){
            return false;
        }

        return true;
    }
}