package jet.thirtydaysofcode;

public class Day4 {
    public class Person {
        private int age;

        public Person(int initialAge) {
            if (initialAge < 0) {
                System.out.println("Age is not valid, setting age to 0.");
                age = 0;
            } else {
                age = initialAge;
            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            System.out.println(age < 13 ? "You are young." :
                    age < 18 ? "You are a teenager."
                            : "You are old.");
        }

        public void yearPasses() {
            age++;
        }
    }
}
