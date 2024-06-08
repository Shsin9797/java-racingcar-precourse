import java.util.List;
import java.util.Scanner;

public class Game {

    public List<String> getCarName() {
        List<String> carNames;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            carNames = List.of(sc.nextLine().split(","));
            if (CheckInput.checkCarNames(carNames)) {
                sc.close();
                break;
            }
        }
        return carNames;
    }




}
