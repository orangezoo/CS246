package Week02;

public enum Destination {
    Mexico(1000.00)
    , Europe(2000.00)
    , Japan(3000.00);

    double spend;

    Destination(double money){
        spend = money;
    }



}
