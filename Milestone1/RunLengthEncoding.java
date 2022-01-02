package Milestone1;

class RunLengthEncoding{
    public static void main(String[] args) {
        String ans = encode("aaabbbcc");
        System.out.println(ans);
    }

    static String encode(String str)
	{
          //Your code here
          char[] ch = str.toCharArray();
          
          StringBuilder sb= new StringBuilder("");
          
          sb.append(ch[0]);
          
          int count = 1;
          
          for(int i=1;i<ch.length;i++){
              char curr = ch[i];
              char prev = ch[i-1];;
              
              if(curr == prev){
                  count = count + 1;
              }else{
                  sb.append(count);
                  count = 1;
                  sb.append(curr);
              }
          }
          
          sb.append(count);
          
          return sb.toString();
          
	}
}