class Sample_car02 {

    String carModel;
    String owner;
    String color;
    int speed;
    boolean right;


    void accelerator(){
        speed++;
        System.out.println("speed up");
    }

    void rightOn(){
        right = true;
        System.out.println(owner + "の車：周囲が暗くなった");
    }


    Sample_car02(){
        carModel = "未登録";
        owner = "未登録";
        color = "未登録";
        speed = 0;
        right = false;
    }


    // 引数ありのコンストラクタ
    Sample_car02(String cm ,String on,String cl, int sp ,boolean rt){
        // this:自分のクラスのコンストラクタを呼び出す。
        // this():コンストラクタからコンストラクタを呼ぶときに使う。
        this();
        carModel = cm;
        owner = on;
        color = cl;
        speed = sp;
        right = rt;
    }
}
