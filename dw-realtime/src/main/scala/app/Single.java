package app;

public class Single {
    private       Single(){}
    private  static      Single single;
    private  static     Single SING(){
        if(single==null){
            synchronized (Single.class){
               if(single==null) {
                    single = new Single();
                }
            }
        }
        return single;
    }


    public static void main(String[] args) {
        Single f=Single.SING();
        Single f1=Single.SING();
        System.out.println(f.hashCode());
        System.out.println(f1.hashCode());

    }


}
