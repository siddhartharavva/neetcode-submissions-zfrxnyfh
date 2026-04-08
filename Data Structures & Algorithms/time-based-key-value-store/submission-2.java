class TimeMap {
    HashMap<String, List<Pair>> vals;
    class Pair{
        String v;
        int t;
        Pair(int t, String v){
            this.v = v;
            this.t=t;
        }
    }
    
    public TimeMap() {
        vals = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!vals.containsKey(key)){
            vals.put(key,new ArrayList<>());
        }
        vals.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if (!vals.containsKey(key)) return "";

        List<Pair> list = vals.get(key);
        int l = 0, r = list.size() - 1;
        String res = "";

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid).t <= timestamp) {
                res = list.get(mid).v;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }   
}


















/*class TimeMap {

    HashMap<String, List<Pair>> map;

    class Pair {
        int timestamp;
        String value;
        Pair(int t, String v) {
            timestamp = t;
            value = v;
        }
    }

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<Pair> list = map.get(key);
        int l = 0, r = list.size() - 1;
        String res = "";

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid).timestamp <= timestamp) {
                res = list.get(mid).value;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return res;
    }
}*/