class DetectSquares {

    HashMap<String, Integer> map;
    public DetectSquares() {
        map = new HashMap<>();
    }
    
    public void add(int[] point) {
        String key = point[0] + "," + point[1];
        map.put(key, map.getOrDefault(key,0)+1);
    }
    
    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
        int result = 0;

        for(String key : map.keySet()){
            String[] parts = key.split(",");
            int px = Integer.valueOf(parts[0]);
            int py = Integer.valueOf(parts[1]);

            if (Math.abs(px-x) != Math.abs(py-y) || px == x){
                continue;
            }

            String p1 = px+","+y;
            String p2 = x+","+py;

            result += map.get(key)*map.getOrDefault(p1,0)*map.getOrDefault(p2,0);
    }
    return result;
}
}