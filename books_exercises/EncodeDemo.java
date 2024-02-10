class Encode{
    String key;
    Encode(String key){
        this.key = key;
    }

    String encode(String s){
        String encodedWord="";

        for(int i=0; i<s.length(); i++){
            char l1 = s.charAt(i);
            for(int j=0; j<key.length(); j++){
                char l2 = key.charAt(j);
                l1 ^= l2;
            }
            encodedWord += l1;
        }
        return encodedWord;
    }
}


class EncodeDemo{
    public static void main(String[] args) throws java.io.IOException{
        System.out.print("Digite sua chave criptográfica: "); 
        String key = "";
        for(;;){
            char c = (char) System.in.read();
            if(c=='\n') break;
            key += c;
        }

        Encode ec = new Encode(key);

        System.out.print("Digite a palavra a ser criptografada: ");
        String word = "";
        for(;;){
            char c = (char) System.in.read();
            if(c=='\n') break;
            word += c;
        }
        System.out.println("ENCODING..."); 
        System.out.println("Palavra criptografada: "+ec.encode(word));
    }
}
