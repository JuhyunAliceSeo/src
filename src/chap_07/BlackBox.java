package chap_07;

public class BlackBox {
    String modelName; //모델명
    String resolution; //해상도
    int price; //가격
    String color; //색깔
    int serialNumber; //시리얼 번호

    static int counter = 0;//시리얼 번호를 생성해주는 역활 (첨엔 0이었다가 ++연산을 통해서 값을 증가)

    static boolean canAutoReport = false; //자동 신고 가능 //Static을 붙이면 이 클래스에 대한 모든

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); //위에 기본생성자를 접근해서 안에있는 내용을 수행하고 아래내용을 수행함. //기본생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if (canAutoReport == true) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능을 지원하지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { //일반영상
            return 9;
        } else if (type == 2) {//이벤트 영상}
            return 1;
        }
        return 10;

    }

    //showDataTime : 날짜정보 표시여부
    //showSpeed : 속도정보 표시여부
    //min : 영상기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다");
        }
        System.out.println("영상은 " + min + " 분 단위로 기록됩니다.");
    }

    void record() {//인스턴스 메소드
        record(true, true, 5);
    }

    static void callServiceCentre() { //클래스 변수라고 선언 static
        System.out.println("서비스 센터(1588-9999)으로 연결합니다.");
        //modelname //안됨 인스턴스 변수니까
        canAutoReport = false;
    }

    void appendModelName(String modelName) {//변수의 이름과 파라미터 이름이 같으니까 this를 붙이는거임

        this.modelName += modelName;
    }

    //Getter(값을가지고 오는 메서드)  & Setter(값을 설정하고 오는 메서드)
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }


    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }


    void setPrice(int price){
        if(price < 100000){
            this.price = 100000;
        }
        else{
            this.price = price;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;

    }
}
