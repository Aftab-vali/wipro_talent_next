package Abstraction;

abstract class Mobile{
     abstract void call();
     abstract void message();

     void openYouTube(){
         System.out.println("the YouTube is opened now!!!!");
     }
     void broadcast(){
         System.out.println("Broadcasted a message to everyone in my contact👍👍👍");
     }

}

class Aftab extends Mobile{
    void call(){
        System.out.println("Call to Aftab 👋");
    }
    void message(){
        System.out.println("Drop a Message to Aftab");
    }
}
class Priya extends Mobile{
    void call(){
        System.out.println("call to priya 🤞 ");
    }
    void message(){
        System.out.println("Drop a Message to Priya");
    }
}
class Abdul_sir extends Mobile{
    void call(){
        System.out.println("call to Abdul_sir 🙏");
    }
    void message(){
        System.out.println("Drop a Message to Abdul_sir");
    }
}




public class taks1 {
    public static void main(String[] args){
        Mobile aftab=new Aftab();
        aftab.call();
        aftab.message();
        aftab.openYouTube();
        Mobile priya= new Priya();
        priya.message();
        priya.call();
        Mobile abdul_sir= new Abdul_sir();
        abdul_sir.message();
        Mobile mobile=new Aftab();
        mobile.broadcast();
    }
}
