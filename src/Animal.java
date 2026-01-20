public class Animal {
    public Animal roar(){
        return new Animal();
    }
}

 class Tortoise extends Animal {
    @Override
     public Tortoise roar(){
        return new Tortoise();
    }
}
