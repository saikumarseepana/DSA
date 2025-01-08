public class StringRec {
    public static void main(String[] args){
        System.out.println(skipAppnotApple("bacappcappledaha"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p + ch, up.substring(1));
        }

    }

    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip1(up.substring(1));
        }else{
            return ch + skip1(up.substring(1));
        }

    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(up.startsWith("apple")){
           return skipApple(up.substring(5));
        }else{
           return ch + skipApple(up.substring(1));
        }

    }

    static String skipAppnotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple")){
           return skipAppnotApple(up.substring(3));
        }else{
           return ch + skipAppnotApple(up.substring(1));
        }

    }
}
