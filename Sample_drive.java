class Sample_drive {

    // Sample_driveの役割：インスタンス化する為

    public static void main (String[] args){
        // 1:クラスをインスタンス化
        
        // インスタンス化の右辺はコンストラクタを表している。
        // クラス名＋( )
        
        // コンストラクタをインスタンス化していく。

        // パターン１：引数無し
        Sample_car chocoCar = new Sample_car();

        // パターン２：引数あり
        // ５つのデータをいれたもの
        Sample_car mocoCar = new Sample_car("aaa","bbb","RED",100,true);
        Sample_car pochiCar = new Sample_car("koko","zzz","BLUE",80,true);

        System.out.println("=======================");
        // 2:インスタンスのフィールドの確認
        System.out.println("chocoCar.carModel : "+ chocoCar.carModel);
        System.out.println("chocoCar.owner : "+ chocoCar.owner);
        System.out.println("=======================");

        chocoCar.accelerator();

    }
}
