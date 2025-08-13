import java.util.Date;


class Main {
    public static void main(String[] args){
        String time12h = "12:06:45PM";
        Date time= new Date();
        String ampm = time12h.substring(time12h.length() - 2);
        System.out.println(time12h.substring(2,time12h.length()-2));
        }
    }
