package day02;

public class Task1_RemoveAFromFirstTwoChars {

    /*
    write a method which removes "A" from a string if "A" is found in first two characters.
      Note:all characters will be in capital
        AABB -->BB
        ABAB -->BAB
        AA -->
     */


    public String deleteAIfItIsFoundInFirstTwoChars(String str){
        //check the length

        if(str.length()<=2) return str.replace("A","");

        String firstTwo=str.substring(0,2);
        String left=str.substring(2);

        if (firstTwo.contains("A")) return firstTwo.replaceAll("A","")+left;

        return firstTwo+left;
    }
}
