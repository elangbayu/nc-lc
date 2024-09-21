class EncodeDecode {
    public static String encode(List < String > strs) {
        StringBuilder returnString = new StringBuilder();
        for (String str: strs) {
            returnString.append(str.length()).append("|").append(str); // Append a string concatenated from 1. The length of string, 2. delimiter, 3. the actual string
        }
        return returnString.toString();
    }

  public static List < String > decode(String str) {
        List < String > returnList = new ArrayList < > ();
        int i = 0;
        while (i < str.length()) { // Looping through each character until the end of input string
            int j = i; // initiate new variable to store the delimiter position
            while (str.charAt(j) !='|') { // This `while` section is used to find the delimiter and put j in that position
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j)); // Find the length of the string by convert the character before the delimiter to `int`
            returnList.add(str.substring(j + 1, j + 1 + length)); // Append the substring of delimiter + 1 index until delimiter + 1 index + actual length of string to returnList
            i = j + 1 + length; // Reposition the i to the next string sections and repeat until the end of string
        }
        return returnList;
    }
}