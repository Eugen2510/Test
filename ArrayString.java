public class ArrayString {
    public static String [] abc ( String []... strings){
        int sumLength = 0;
        int index = 0;
        for(String [] s: strings){
            sumLength += s.length;
        }

        String [] resultArray = new String [sumLength];

        for (String [] s: strings){
            for (String el: s){
                resultArray [index] = el;
                index++;
            }
        }

        return resultArray;
    }

    public static void main (String [] args){
        String [] s1 = {"Hello","my","name","is"};
        String [] s2 = {"Eugene", "and"};
        String [] s3 = {"i","learning","java"};
        String [] s4 = {"I","WILL","BE","COOL","PROGRAMMER!!!"};
        String [] strings = ArrayString.abc(s1,s2,s3,s4);
        

        for (int i = 0; i < args.length; i++){
            for(int j = 0; j < strings.length; j++){
                if (args[i].equals(strings[j])){
                    strings[j] = null;
                }
            }
        }

        for (String s: strings){
            System.out.print(s + " ");
        }
        
        
    }
}

