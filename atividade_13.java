public abstract class atividade_13 {
    public static void main(String[] args) {
       int water_gragus = 88;

       if(water_gragus >= 100){
        System.out.println("water warming is:" + water_gragus);
        System.out.println("water is boiling");
       }

       else if(water_gragus < 20 && water_gragus > 0){
        System.out.println("water warming is:" + water_gragus);
        System.out.println("water is cold");
       }

       else if(water_gragus < 70 && water_gragus > 20){
        System.out.println("water warming is:" + water_gragus);
        System.out.println("water is warm");
       }

       else if(water_gragus < 100 && water_gragus > 70){
        System.out.println("water warming is:" + water_gragus);
        System.out.println("water is almost boiling");
       }

       else{
        System.out.println("water warming is:" + water_gragus);
        System.out.println("water isnt boiling");
       }

       
        
    }
}
