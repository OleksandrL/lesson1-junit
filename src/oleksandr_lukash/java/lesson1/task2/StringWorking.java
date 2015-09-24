package oleksandr_lukash.java.lesson1.task2;

/**
 *Lesson1 task2
 * @author Oleksandr_Lukash
 */
public class StringWorking {
    
    double getAverageLength(String[] arrList) {
        int totalLength = 0;
        for(String s: arrList){
            totalLength += s.length();
        }
        return totalLength*1.0/arrList.length;
    }
    
    String foundMaxLengthString(String[] arrList){
        int maxIndex = 0;
        int maxLength = arrList[0].length();
        for(int i = 1; i < arrList.length; i++){
            if (arrList[i].length() > maxLength){
                maxLength = arrList[i].length();
                maxIndex = i;
            }
        }
        return arrList[maxIndex] + " - " + maxLength;
    }
    
    String foundMinLengthString(String[] arrList){
        int minIndex = 0;
        int minLength = arrList[0].length();
        for(int i = 1; i < arrList.length; i++){
            if (arrList[i].length() < minLength){
                minLength = arrList[i].length();
                minIndex = i;
            }
        }
        return arrList[minIndex] + " - " + minLength;
    }
    
    String[] foundMaxAndMin(String[] arrList){
        String[] ss = new String[2];
        ss[0] = foundMaxLengthString(arrList);
        ss[1] = foundMinLengthString(arrList);
        return ss;
    }
    
    String[] getLongerThanAverage(String[] arrList){
        String[] la = new String[arrList.length];
        double avg = getAverageLength(arrList);
        int j = 0;
        for(String s: arrList){
            if (s.length() > avg)
                la[j++] = s + " - " + s.length();
        }
        String[]lam = new String[j];
        System.arraycopy(la, 0, lam, 0, j);
        return lam;
    }
    
    String[] getShorterThanAverage(String[] arrList){
        String[] sa = new String[arrList.length];
        double avg = getAverageLength(arrList);
        int j = 0;
        for(String s: arrList){
            if (s.length() < avg)
                sa[j++] = s + " - " + s.length();
        }
        String[]sam = new String[j];
        System.arraycopy(sa, 0, sam, 0, j);
        return sam;
    }

    String minRepetitiveSymbols(String[] arrList)
        throws Exception{
        int minCount = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i = arrList.length-1; i > -1; i-- ){
            String s = arrList[i];
            int count = 0;
            char [] arrSymbols = s.toCharArray();
            for (int j = 0; j < arrSymbols.length; j++){
                boolean was = false;
                char value = arrSymbols[j];
                for (int k = 0; k < arrSymbols.length; k++){
                    if (value == arrSymbols[k] && k != j){
                        if(k < j)
                            was = true;
                        if (k > j && !was){
                        count++;
                        break;
                        }
                    }
                }
            }
            if (count <= minCount && count > 0){
                minCount = count;
                minIndex = i;
            }
        }
        String word = "";
        try{
            word = arrList[minIndex];
        }catch (Exception e){
            throw new Exception("There is no word containing repetitive symbols.");
        }
        return word;
    }
    
    String getOnlyDiffSymbols (String[] arrList)
            throws Exception{
        int index = -1;
        for(int i = 0; i < arrList.length; i++ ){
            String s = arrList[i];
            int count = 0;
            char [] arrSymbols = s.toCharArray();
            for (int j = 0; j < arrSymbols.length; j++){
                boolean found = false;
                char value = arrSymbols[j];
                for (int k = j + 1; k < arrSymbols.length; k++){
                    if (value == arrSymbols[k]){
                        found = true;
                        break;
                    }
                }
                if (!found)
                    count++;
            }
            if (arrSymbols.length - count == 0){
                index = i;
                break;
            }
        }
        String word = "";
        try{
            word = arrList[index];
        }catch (Exception e){
            throw new Exception("There is no word containing different symbols only.");
        }
        return word;
    }
	
    String getOnlyNumbers(String[] arrList, int wanted)
            throws Exception{
        int index = -1;
        int count = 0;
        for(int i = 0; i < arrList.length; i++ ){
            String s = arrList[i];
            if (s.matches("\\d+")){
                count++;
                index = i;
            }
            if (count == wanted){
                break;
            }
        }
        String word = "";
        if (count < wanted){
            throw new Exception("There is no word with wanted index"
                    + " which consists of numbers only");
        }else{
            word = arrList[index];        
        }
        return word;
    }
}
