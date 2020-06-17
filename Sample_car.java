class Sample_car {

    // Sample_carクラスの役割：変数やコンストラクタを定義する為

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

    // パターンに対応できる様に、コンストラクタをオートロードして、定義しておく。

    // パターン１：引数無し
    // フィールドの値を未登録のものを対応

    Sample_car(){
        System.out.println("constructor");

        //変数の準備と代入処理

        carModel = "未登録";
        owner = "未登録";
        color = "未登録";
        speed = 0;
        right = false;
        System.out.println("=====================================");
        // フィールドの代入が終わった時が、インスタンス化の終了
    }

    
    // パターン１：引数有り
    // 好きな値をフィールドに詰める

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
