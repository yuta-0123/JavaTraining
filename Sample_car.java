class Sample_car {
    String carModel;
    String owner;
    String color;
    int speed;
    boolean right;

    Sample_car(){
        System.out.println("=====================================");
        carModel = "aaa";
        owner = "aaa";
        color = "aaa";
        speed = 0;
        right = false;
        System.out.println("=====================================");
    }

    Sample_car(String cm ,String on,String cl, int sp ,boolean rt){
        System.out.println("=====================================");
        carModel = cm;
        owner = on;
        color = cl;
        speed = sp;
        right = rt;
        System.out.println("=====================================");
    }
}
