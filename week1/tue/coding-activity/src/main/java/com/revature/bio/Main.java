package main.java.com.revature.bio;

public class Main {
    public static void main(String[] args) {
        /*
         * Instantiate the Associate class
         * Pass in information to the default constructor or use setters
         */
        Associate t = new Associate();
        t.setName("Todd Kirby");
        t.setDegree("Master's of Science in Biomedical Forensic Science");
        t.setPOI("Space");
        System.out.println(t);
        /*
         * System out the Associate object behaviors and fields
         */
        Associate.study();
        Associate.troubleshoot();
        int n = 0;
        for(n=0; n<=10; n++){
            System.out.println(n);
        }

        Associate.hobbies();
        // Extra practice to get more familiar with Intellij
        Cat d = new Cat("Darla",2,"white with black cow spots", 7);
        d.climb();


    }


}
