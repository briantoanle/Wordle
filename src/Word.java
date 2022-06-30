public class Word {

    private LinearNode<Letter> firstLetter;

    public Word(Letter[] letters){
        firstLetter = new LinearNode<Letter>(letters[0]);
        LinearNode<Letter> tempNode = firstLetter;

        for(int i = 1; i < letters.length; i++){
            tempNode.setNext(new LinearNode<Letter>(letters[i]));
            tempNode = tempNode.getNext();
        }
        //System.out.println("in constructor: " + firstLetter);
        //System.out.println("in constructor ***: " + this.firstLetter);
    }

    public String toString(){
        String newString = "Word: " + this.firstLetter.getElement().toString();

        LinearNode temp = this.firstLetter.getNext();

        while(temp != null){
            newString += temp.getElement();
            temp = temp.getNext();
        }
        return newString;
    }

    public boolean labelWord(Word mystery){


        LinearNode temp1 = mystery.firstLetter;
        LinearNode temp2 = this.firstLetter;
        for(int i = 0; i < 6; i++){
            // check for used
            // we will run this letter against entire mystery word to check
            LinearNode mysteryNode = mystery.firstLetter;
            while (mysteryNode!=null){

                if (mysteryNode.getElement().equals(temp2.getElement())){
                    Letter l = (Letter) temp2.getElement();
                    l.setUsed();
                }
                mysteryNode = mysteryNode.getNext();

            }


            if (temp1.getElement().equals(temp2.getElement())){
                System.out.println(".... equal");
                Letter l = (Letter) temp2.getElement();
                l.setCorrect();
            }



            System.out.print(temp1.getElement() + " ");
            temp1 = temp1.getNext();
            System.out.print(temp2.getElement() + " ");
            temp2 = temp2.getNext();
            System.out.println();
        }
        System.out.println();
        return false;
    }

    public static void main (String[] args){
        Letter[] letterArray = Letter.fromString("HAPPY");

        //for (int i=0; i < letterArray.length;i++){
        //   System.out.println(letterArray[i]);
        //}

        Word w = new Word(letterArray);

        //System.out.println(w.toString());

        Word word1 = new Word(Letter.fromString("OBJECT"));

        //Word word2 = new Word(Letter.fromString("CLASS"));
        Word word2 = new Word(Letter.fromString("JOEZBT"));
        System.out.println(word2.labelWord(word1));
        //System.out.println(word2);


    }
}
