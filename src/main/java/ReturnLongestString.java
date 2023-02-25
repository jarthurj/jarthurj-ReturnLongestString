
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int currentLongest = 0;
        int indexOfLongest = 0;
        for(int x=0; x<arr.length;x++){
            if(arr[x].length()>currentLongest){
                currentLongest = arr[x].length();
                indexOfLongest = x;
            }
        }
        return arr[indexOfLongest];
    }
}
