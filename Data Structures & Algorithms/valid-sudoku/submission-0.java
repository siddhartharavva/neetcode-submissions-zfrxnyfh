class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <Character> unique = new HashSet<>();        
        for(int i = 0 ; i <9;i++){
            unique = new HashSet<>();
            for(int j = 0 ; j < 9;j++){                
                char val =board[i][j];
                if(val=='.');
                else if(!unique.contains(val))unique.add(val);
                else {
                    return false;
                }
            }
            unique = new HashSet<>();
            for(int j = 0 ; j < 9;j++){                
                char val =board[j][i];
                if(val=='.');
                else if(!unique.contains(val))unique.add(val);
                else return false;
            }


        }
        for(int l = 0 ; l < 3;l++){
            for(int i = 0 ; i < 3;i++){
                unique = new HashSet<>();
                for(int j = 0;j<3;j++){                    
                    for(int k = 0;k<3;k++){
                        char val =board[3*l+j][3*i+k];
                        /*System.out.print("row");
                        System.out.print(3*l+j);
                        System.out.print("col");
                        System.out.print(3*i+k);
                        System.out.print("val");

                        System.out.print(val);
                        System.out.print(" ");*/
                        if(val=='.');
                        else if(!unique.contains(val))unique.add(val);
                        else {
                            /*System.out.println(val);
                            System.out.println("error");*/
                            return false;
                        }                    
                    }                    
                }

            }
        }    
        return true;
    }
}
