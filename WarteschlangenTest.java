

public class WarteschlangenTest {
    final int N = 9;
    PatientenWarteschlange wartezimmer;
    
    WarteschlangenTest(){
        wartezimmer = new PatientenWarteschlange(N);
    }
    
    public void testeAnmelden(){
        for(int i = 0; i < N + 3; i++){
            wartezimmer.anmelden(new Patient("Patient" + i));
        }
        System.out.println(wartezimmer);
    }
}
