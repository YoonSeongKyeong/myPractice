public class Lion extends Feline {
    public void makeNoise() {
        System.out.println("(Lion noise)GRRRRRGGGGG!");
    } 
    public void eat() {// we can check if meal is what this animal would eat
        hunger=0;
        System.out.println("(Lion eat)GGRRGGG");
    }
}