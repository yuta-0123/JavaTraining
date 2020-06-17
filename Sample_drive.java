class Sample_drive {

    public static void main (String[] args){
        // 1:クラスをインスタンス化
        System.out.println("======================");
        
        // インスタンス化の右辺はコンストラクタを表している。
        // クラス名＋( )
        
        // パターン１：引数無し
        Sample_car chocoCar = new Sample_car();
        // パターン２：引数５つのもの
        Sample_car mocoCar = new Sample_car("aaa","bbb","RED",100,true);
        Sample_car pochiCar = new Sample_car("koko","zzz","BLUE",80,true);

        System.out.println("=======================");
        // 2:インスタンスのフィールドの確認
        System.out.println("chocoCar.carModel : "+ chocoCar.carModel);
        System.out.println("chocoCar.owner : "+ chocoCar.owner);
        System.out.println("=======================");

    }
}
