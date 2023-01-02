public class Cars {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    public Cars(){

    }
    public Cars(String brand,String model,double engineVolume, String color,int year,String country){
        this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.year=year;
        this.country=country;
    }

    public String getBrand() {
        if(brand=="null"||brand==""){
            brand ="default";
        }
        return brand;
    }

    public String getModel() {
        if(model=="null"||model==""){
            model="default";
        }
        return model;
    }

    public double getEngineVolume() {
        if(engineVolume<=0){
            engineVolume=1.5;
        }
        return engineVolume;
    }

    public String getColor() {
        if(color=="null"||color==""){
            color="белый";
        }
        return color;
    }

    public int getYear() {
        return year;
    }


    public String getCountry() {
        if(country=="null"||country==""){
            country = "default";
        }
        return country;
    }
    @Override
    public String toString() {
        return "brand=" + getBrand() +
                ", model=" + getModel() +
                ", engineVolume=" + getEngineVolume() +
                ", color=" + getColor()  +
                ", year=" + getYear() +
                ", country=" + getCountry() ;
    }

}
