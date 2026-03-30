class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <Character> uni = new HashSet<>();
        for(int i = 0 ; i < 9;i++){
            uni = new HashSet<>();
            for(int j = 0; j < 9;j++){
                System.out.print("R");
                System.out.print(board[i][j]);
                if(board[i][j]=='.');
                else if(uni.contains(board[i][j])){
                    System.out.print("Loop1");
                    return false;
                }    
                else uni.add(board[i][j]);
            }
        }
        for(int i = 0 ; i < 9;i++){
            uni = new HashSet<>();        
            for(int j = 0; j < 9;j++){
                System.out.print("L");
                System.out.print(board[i][j]);
                if(board[j][i]=='.')continue;
                else if(uni.contains(board[j][i])){
                    System.out.print("Loop2");
                    return false;
                }else uni.add(board[j][i]);
            }
        }
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
                uni = new HashSet<>();
                for(int k = 0;k<3;k++){
                    for(int l = 0;l<3;l++){
                        System.out.print("3X3");
                        System.out.print(board[3*i+k][3*j+l]);
                                                
                        if(board[3*i+k][3*j+l]=='.')continue;
                        else if(uni.contains(board[3*i+k][3*j+l])){
                            System.out.print("Loop4");
                            return false;
                        }else uni.add(board[3*i+k][3*j+l]);                    
                    }
                }

            }
        }
        return true;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*HashSet <Character> unique = new HashSet<>();        
        for(int i = 0 ; i <9;i++){
            unique = new HashSet<>();
            for(int j = 0 ; j < 9;j++){                
                char val =board[i][j];
                if (val == '.') continue;
                if (!unique.add(val)) return false;
            }
            unique = new HashSet<>();
            for(int j = 0 ; j < 9;j++){                
                char val =board[j][i];
                if (val == '.') continue;
                if (!unique.add(val)) return false;
            }


        }
        for(int l = 0 ; l < 3;l++){
            for(int i = 0 ; i < 3;i++){
                unique = new HashSet<>();
                for(int j = 0;j<3;j++){                    
                    for(int k = 0;k<3;k++){
                        char val =board[3*l+j][3*i+k];
                        System.out.print("row");
                        System.out.print(3*l+j);
                        System.out.print("col");
                        System.out.print(3*i+k);
                        System.out.print("val");

                        System.out.print(val);
                        System.out.print(" ");
                        if (val == '.') continue;
                        if (!unique.add(val)) return false;
                        
                    }                    
                }

            }
        }    
        return true;*/
    }
}
