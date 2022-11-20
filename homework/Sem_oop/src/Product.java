public class Product {
     private String name;
     private Double cost;

     public Product(String name, double cost){
         this.name = name;
         this.cost = cost;
     }
     public void setName(String name){
        this.name = name;
     }
     public String getName(){
         return this.name;
     }
     public void setCost(double cost){
         this.cost = cost;
     }
     public double getCost(){
         return this.cost;
     }
}
