class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ind1 = 0;
        int ind2 = 1;
        while( ind1<numbers.length){                        
            for(ind2=ind1+1;ind2<numbers.length;ind2++){
                    System.out.print(ind1+1);
                    System.out.print(".");
                    System.out.print(ind2+2);
                    System.out.print(".");
                    System.out.print(numbers[ind1]+numbers[ind2]);
                    System.out.println("");
                if(numbers[ind1]+numbers[ind2]==target){
                    System.out.println("In lOop");
                    return new int []{ind1+1,ind2+1};
                }
            }
                ind1++;
        }
        return new int []{ind1+1,ind2+1};
    }
        
}
