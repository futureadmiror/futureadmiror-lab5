public class Rotor {

    
    private String rotorValues;
    private char startChar;
    

    public Rotor(String v, char c){ //  #GNUAHOVBIPWCJQXDKRYELSZFMT , #
        this.rotorValues = new String(v); // #GNUAHOVBIPWCJQXDKRYELSZFMT
        this.startChar = c; // #
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        char[] rot = rotorValues.toCharArray(); //#GNUAHOVBIPWCJQXDKRYELSZFMT
        char[] str = new char[rot.length];
        str[0] = rot[rot.length - 1];    //T#GNUAHOVBIPWCJQXDKRYELSZFM
        boolean match = false;
        for (int i = 1; i < rot.length ; i++ ){
            str[i] = rot[i - 1]; 
        }

        rotorValues = new String(str);

        if (str[0] == startChar){
            match = true;
            return match;
        }
       return false;        
    }
    

    public int indexOf(char c){
        
        char[] rot = rotorValues.toCharArray();
        
        for (int i = 0; i < rot.length; i++){
            if (rot[i] == c ) {
                return i;
            }
        }
        return -1;
    }
    //Return the character at a given index.
    public char charAt(int idx){
       
        char[] rot = rotorValues.toCharArray();
        
        return rot[idx];
    }
}
    
