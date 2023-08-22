public class Main {
    public static void main(String[] args) {
        String phrase = "Hello World";
        String phrase2 = "world hello";

        System.out.println(phrase.substring(6));

        System.out.println(phrase.length());

        System.out.println(phrase.isEmpty());


        System.out.println(phrase.equalsIgnoreCase(phrase2));

        int myLoopControlVariable = 0;

        while (myLoopControlVariable <= 12){
            System.out.println("myLoopControlVariable " + myLoopControlVariable);
            myLoopControlVariable++;

            }

            String[] myStrArray = {"this", "that", "the other"};
            for (int i = 0; i <= 10; i++) {
                System.out.println("myStrArray{" + i + "] = " + myStrArray[i]);
            }
        }
    }
