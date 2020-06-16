class Sample_drive {
    
    public static void main (String[] args){
        System.out.println("======================");

        Sample_car chocoCar = new Sample_car();
        Sample_car mocoCar = new Sample_car("aaa","bbb","RED",100,true);
        Sample_car pochiCar = new Sample_car("koko","zzz","BLUE",80,true);

        System.out.println("=======================");
        System.out.println("chocoCar.carModel : "+ chocoCar.carModel);
        System.out.println("chocoCar.owner : "+ chocoCar.owner);
        System.out.println("=======================");

    }
}
