public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return this.getClass() + " The car's engine is starting";
    }
    @Override
    public String accelerate(){
        return this.getClass() + " The car is accelerating.";
    }
    @Override
    public String brake(){
        return this.getClass() + " The car is braking";
    }

}
