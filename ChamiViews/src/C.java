


 class A {
    public void show(){
        System.out.println("A");
    }
    
}
 class B extends A{
     
    public void show(){
        System.out.println("");
    }
}
public  class C {
    public static void main(String[] args){
        int number=6;
       String state= number>5?number>2?"Number Greater than 5":"Number Greater than 2":"Number Less than 5";
        System.out.println(state);
    }
}