package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Animal cusi= new Animal();
        System.out.println("The animal's name is: "+cusi.name);
        System.out.println("It has "+cusi.age+" year");
        System.out.println("It's health state is "+cusi.healthState);
        System.out.println("On a scale from 1 to 10 it's hunger level is: "+cusi.hungerLevel);
        System.out.println("It's happiness level is: "+cusi.happinessLevel);
        System.out.println("It's favorite food is "+cusi.favoriteFOOD);
        System.out.println(cusi.favoriteActivity+" is it's favorite activity");

        Adopter gesi= new Adopter();
        System.out.println(cusi.name+" is adopted by "+gesi.nameofAdopter);
        System.out.println(gesi.nameofAdopter+" paid "+gesi.moneyforanimal+"lei for it's vaccination");

        AnimalFood animalFood= new AnimalFood();
        System.out.println("It ate a little bowl of "+animalFood.nameOfAnimalFood+" today");
        System.out.println("The price for a bag of "+animalFood.nameOfAnimalFood+" is "+animalFood.priceOfFood+" lei");
        System.out.println("There are "+animalFood.quantityOfFood);
        System.out.println("The remainder of "+animalFood.nameOfAnimalFood+" is "+animalFood.foodAvailable);


        RecreationalActivity walk= new RecreationalActivity();
        System.out.println("Tommorrow it is "+walk.nameofRecActivity);

        Veterinarian vet= new Veterinarian();
        System.out.println("The vet's name is "+vet.nameOfVet);
        System.out.println("His specialty is in "+vet.vetSpecialty);
    }
}
