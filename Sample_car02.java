class Sample_car02 {

    // フィールドとメソッドしかない。

    // フィールドにある５つの変数
    // フィールド：クラスの直下に置かれた変数
    // <=>ローカル変数(スコープがコンストラクタの中に限るもの)
    String carModel;
    String owner;
    String color;
    int speed;
    boolean right;


    // デフォルトコンストラクタ：引数なし、処理なし


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
    // コンストラクタの中の仮引数
    // 仮引数とは、引数を受け取る為の変数

    // 仮引数には、フィールドと被らない値が望ましい
    Sample_car02(String cl,String owner,String color, int speed  ,boolean right){
        // this:自分のクラスのコンストラクタを呼び出す。
        // this():コンストラクタからコンストラクタを呼ぶときに使う。
        // コンストラクタの処理は、値をフィールドに突っ込むこと。

        // 深いコンストラクタ：呼び出す側のコンストラクタ
        // 深いコンストラクタから処理が行われていく
        // そのため、コンストラクタの呼び出し先頭に記述する

        this();

        // 左辺は箱：右辺は値。
        // this.変数名はフィールドを指す。
        this.carModel = cl;
        owner = owner;
        color = color;
        speed = speed ;
        right = right;

        // ローカル内で呼び出しがあった時は、ローカルにある変数が優先される。


        // オブジェクト指向の３大要素
        // ⑴カプセル化　⑵継承　⑶ポリモーフィズム
        // カプセル化：private や public　といったアクセス修飾子を用い、外部クラスからのフィールドやメソッドへのアクセスを制御すること
        // private：自クラス 内からのみアクセス可能

    }
}
