public class encapsulationExample {
    static void main(String[] args){
        humanBeing h1 = new humanBeing();
        h1.setHeight(1.65f);
        h1.setWeight(68);
        h1.setBmi(calculateBmi(h1));

        System.out.println("Person has "+h1.getWeight()+" kgs and is "+h1.getHeight()+" meters in height, which results in BMI of "+h1.getBmi());
    }

    public static float calculateBmi(humanBeing h1){
        return h1.getWeight()/(h1.getHeight()*h1.getHeight());

    }
}
