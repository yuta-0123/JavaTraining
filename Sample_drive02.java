class Sample_drive02 {

    // Sample_driveの役割：インスタンス化する為

    public static void main (String[] args){

        // 左辺：インスタンスをつくる
        // 右辺：コンストラクタを呼び出す
        Sample_car02 chocoCar = new Sample_car02();
        Sample_car02 mocoCar = new Sample_car02("aaa","bbb","RED",100,true);
        Sample_car02 pochiCar = new Sample_car02("koko","zzz","BLUE",80,true);

        System.out.println("=======================");
        // 2:インスタンスのフィールドの確認
        System.out.println("chocoCar.carModel : "+ chocoCar.carModel);
        System.out.println("chocoCar.owner : "+ chocoCar.owner);
        System.out.println("=======================");
        chocoCar.accelerator();
    }
}
