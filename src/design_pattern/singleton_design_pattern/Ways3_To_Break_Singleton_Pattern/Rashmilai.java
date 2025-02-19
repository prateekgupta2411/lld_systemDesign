package design_pattern.singleton_design_pattern.Ways3_To_Break_Singleton_Pattern;

public class Rashmilai {
    private static Rashmilai rashmilai;
    private Rashmilai(){
        if(rashmilai != null){
            throw new RuntimeException("You are trying to break Singleton pattern");
        }
    }
    public static Rashmilai getRashmilai(){
        if(rashmilai == null){
            synchronized (Rashmilai.class){
                if (rashmilai == null){
                    rashmilai = new Rashmilai();
                }
            }
        }
        return rashmilai;
    }
}
