class Sample_car {

    // フィールド(クラス直下で定義された変数)
    //クラスの時点は初期化なしで定義。
    // 変数に何も入っていない状況。（＝実体 例:車という概念) 

    String carModel;
    String owner;
    String color;
    int speed;
    boolean right;

    // メソッド
    // accelerateメソッド
    void accelerator(){
        speed++;
        System.out.println("speed up");
    }

    // コンストラクタ(インスタンス化と同時に生成。)
    // フィールドの初期値を設定。
    // メソッド名はクラス名と同じ
    // 戻り値なし

    // パターンに対応できる様に、コンストラクタを定義しておく。

    // パターン１：引数無し
    Sample_car(){
        System.out.println("constructor");
        carModel = "zero";
        owner = "zero";
        color = "zero";
        speed = 0;
        right = false;
        System.out.println("=====================================");
    }

    
    // パターン１：引数有り
    // 好きな値をフィールドに詰める。
    Sample_car(String cm ,String on,String cl, int sp ,boolean rt){
        System.out.println("constructor");
        carModel = cm;
        owner = on;
        color = cl;
        speed = sp;
        right = rt;
        System.out.println("=====================================");
    }
}
