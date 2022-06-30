public class Letter {
    private char letter;
    private int label;
    private final int UNSET = 1;
    private final int UNUSED = 2;
    private final int USED = 3;
    private final int CORRECT = 4;

    public Letter(char c){
        label = UNSET;
        letter = c;
    }

    public boolean equals(Object otherObject){
        if(otherObject instanceof Letter == false)
            return false;
        else if(otherObject instanceof Letter == true)
            if(this.letter == ((Letter) otherObject).letter) {
                //System.out.println("hello...");
                return true;
            }
            return false;
    }

    public String decorator(){
        if(label == USED)
            return "+";
        else if(label == UNUSED)
            return "-";
        else if(label == CORRECT)
            return "!";
        else if(label == UNSET)
            return " ";
        else
            return "";
    }

    public String toString(){
        //dCd !D!
        String d = this.decorator();
        return d + this.letter + d;
    }

    public void setUnused(){
        label = UNUSED;
    }

    public void setUsed(){
        label = USED;
    }

    public void setCorrect(){
        label = CORRECT;
    }

    public boolean isUnused(){
        if(label == UNUSED)
            return true;
        return false;
    }

    public static Letter[] fromString(String s){
        //make an array from string s
        //each s make letter object
        //store in order

        //happy
        //h a p p
        Letter[] letterArr = new Letter[s.length()];

        for(int i = 0; i < letterArr.length; i++){
            Letter letter1 = new Letter(s.charAt(i));
            letterArr[i] = letter1;
        }

        return letterArr;
    }

    public static void main(String []args){
        Letter l1 = new Letter('t');
        Letter l2 = new Letter('h');
        System.out.println(l1.equals(l2));


        //fromString("HAPPY");
        //System.out.println(fromString("hey"));
    }
}
