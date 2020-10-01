public static int getLen(String s, String cv, int k){
        int i, j, count = 0, max = 0, countK = 0;
        for(i = 0;i < s.length();i++){
        if(cv.charAt((int)(s.charAt(i)-'a')) == '1'){
        count += 1;
        }else{
        countK += 1;
        if(countK<=k){
        count += 1;
        }else{
        count = 0;
        countK = 0;
        }
        }
        if(max < count){
        max = count;
        }
        }
        return max;
        }