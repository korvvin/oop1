public class Cars {
   private String brand;
    private String model;
    double engineVolume;
    String color;
    private int year;
    private String country;

    int transmission;

    private String typeOfBodyWork;

    String registrationNumber;
    private int place;
    Boolean wheels;

    public Cars(){

    }
    public Cars(String brand,String model,double engineVolume, String color,int year,String country,int transmission,String typeOfBodyWork, String registrationNumber, int place,boolean wheels){
        this.brand=brand;
        this.model=model;
        this.engineVolume=engineVolume;
        this.color=color;
        this.year=year;
        this.country=country;
        this.transmission=transmission;
        this.typeOfBodyWork=typeOfBodyWork;
        this.registrationNumber=registrationNumber;
        this.place=place;
        this.wheels=wheels;
    }

    public String getBrand() {
        if(brand.isBlank()){
            brand ="default";
        }
        return brand;
    }

    public String getModel() {
        if(brand.isBlank()){
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
        if(color.isBlank()){
            color="белый";
        }
        return color;
    }

    public String getTypeOfBodyWork() {
        if (typeOfBodyWork.isBlank()){
            typeOfBodyWork="паркетник";
        }
        return typeOfBodyWork;
    }

    public int getPlace() {
        if (place<=1){
            place=5;
        }
        return place;
    }

    public int getYear() {
        return year;
    }

    public int getTransmission() {
        if (transmission<=0){
            transmission=5;
        }
        return transmission;
    }

    public String getRegistrationNumber() {
        if (registrationNumber.isBlank()){
            registrationNumber="XXXXXXXX"
        }
        return registrationNumber;
    }

    public Boolean getWheels() {
        return wheels;
    }

    public String getCountry() {
        if(country.isBlank()){
            country = "default";
        }
        return country;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setWheels(Boolean wheels) {
        this.wheels = wheels;
    }

    public void changeWheels(int month){
        if(month==12||month>=1&&month<5){
            this.wheels=false;
        }
        else{
            this.wheels=true;
        }
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", transmission=" + getTransmission() +
                ", typeOfBodyWork='" + getTypeOfBodyWork() + '\'' +
                ", registrationNumber='" + getRegistrationNumber() + '\'' +
                ", place=" + getPlace() +
                ", wheels=" + getWheels() +
                '}';
    }
}
class Key{
      private Boolean distanceStart;
      private Boolean connectionWithoutKey;
      public Key (Boolean distanceStart,Boolean connectionWithoutKey){
          if(distanceStart!=null&&connectionWithoutKey!=null){
              this.connectionWithoutKey=connectionWithoutKey;
              this.distanceStart=distanceStart;
          }
      }
}

}
