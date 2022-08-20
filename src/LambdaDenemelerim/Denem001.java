package LambdaDenemelerim;

public class Denem001 {
    public static void main(String[] args) {

        IYazBeni sdt = new   IYazBeni(){
            @Override
            public void yazdir() {
                System.out.println("Yazdir babam yazdir");
            }
        };

    }
}
