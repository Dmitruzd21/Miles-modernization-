public class BonusMilesService {
    public int calculate(int Price) {
        int oneBonusMile = 20;
        int numberOfBonusMiles = Price / oneBonusMile;
        return numberOfBonusMiles;
    }
}
