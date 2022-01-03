public class GCDOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABAB","AB")); 
    }

    static String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        if(str1.length() < str2.length()){
            gcdOfStrings(str2,str1);
        }

        String rem = str1.substring(str2.length());
        if(rem.isEmpty()){
            return str2;
        }

        return gcdOfStrings(str2,rem);
    }
}
