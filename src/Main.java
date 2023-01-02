public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars("null","Granta",1.7,"желтый",2015,"Россия");
        Cars car2 = new Cars("Audi","A8 50 L TDI quattro",3.0,"null",2020,"Германия");
        Cars car3 = new Cars("BMW","",3.0,"null",2021,"Германия");
        Cars car4 = new Cars("Kia","Sportage 4-го поколения",2.4,"красный",2018,"Южная Корея");
        Cars car5 = new Cars("Hyundai","null",-5,"оранжевый",2016,"Южная Корея");
        Cars[] carsArray = {car1,car2,car3,car4,car5};
        for (int i = 0; i < carsArray.length; i++) {
            System.out.println(carsArray[i]);
        }



    }
}