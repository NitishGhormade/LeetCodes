class MyCalendar {
    List<int[]> times;

    public MyCalendar() {
        times = new ArrayList<>();
    }
  
    public boolean book(int start, int end) {
        if(times.size() == 0){
            times.add(new int[]{start, end});
            return true;
        }

        if(end <= times.get(0)[0]){
            times.add(0, new int[]{start, end});
            return true;
        }
        for(int i = 1;i < times.size();i++){
            if(times.get(i - 1)[1] <= start && end <= times.get(i)[0]){
                times.add(i, new int[]{start, end});
                return true;
            }
        }
        if(times.get(times.size() - 1)[1] <= start){
            times.add(new int[]{start, end});
            return true;
        }
        return false;
    }
}