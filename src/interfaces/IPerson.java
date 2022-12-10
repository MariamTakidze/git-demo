package interfaces;

public interface IPerson extends ISpeak,IThink {
//    String firstName ="",lastName ="",sex ="";
//    int age = 19;

    void displayPersonInfo(String firstName,String lastName,String sex,int age);
}

