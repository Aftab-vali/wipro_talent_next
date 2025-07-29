package Abstraction;

abstract class Mobile{
     abstract void call();

     void openYouTube(){
         System.out.println("the YouTube is opened now!!!!");
     }

}

class Aftab extends Mobile{
    void call(){
        System.out.println("Call to Aftab");
    }
}
class Priya extends Mobile{
    void call(){
        System.out.println("call to priya");
    }
}





public class taks1 {
    public static void main(String[] args){
        Mobile aftab=new Aftab();
        aftab.call();
        aftab.openYouTube();
        Mobile priya= new Priya();
        priya.call();
    }
}
