class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int sppos [][] = new int [position.length][2];        
        for(int i = 0 ; i < position.length;i++){
            sppos[i][0]=position[i];
            sppos[i][1]=speed[i];
        }
        Arrays.sort(sppos,(a,b)-> b[0]-a[0]);                
        int c = 0;
        double prevf=0;
        for(int i = 0 ; i< sppos.length; i++){
            double f = (double)(target-sppos[i][0])/sppos[i][1];
            if(prevf<f){
                c++;                
                prevf = f;
            }
        }
        return c;
    }
}



/*class Solution {
    public int carFleet(int target, int[] position, int[] speed) {        
        int n = position.length;
        int[][] car = new int[n][2];
        for(int i = 0 ; i < n;i++){
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }
        Arrays.sort(car,(a,b)->b[0]-a[0]);
        double prevTime = 0;
        int fleet = 0;
        for(int i = 0;i< n;i++){
            double time = (double)(target-car[i][0])/car[i][1];
            if(time>prevTime){
                fleet++;
                prevTime = time;
            }
        }
        return fleet;
    }
}
*/