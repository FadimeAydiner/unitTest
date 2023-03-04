package day02;

public class Task2_CheckFirstAndLastTwoCharsSame {
    /*
        write a method which will compare last and first two charcters are the same
         BABA --> True
         AAA-->TRUE
         ACKKKLKLAC-->TRUE
         A--> false
         AB-->true
     */

    public boolean checkIfFirstAndLastTwo(String str){
        if(str.length()<=1) return false;
        if(str.length()==2) return true;


        String firstTwo=str.substring(0,2);
        String lastTwo=str.substring(str.length()-2);

        return firstTwo.equals(lastTwo);
    }
}
